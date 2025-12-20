package com.example.demo.service.impl;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.PatternDetectionService;
import com.example.demo.exception.ResourceNotFoundException;
import java.util.List;

public class PatternDetectionServiceImpl implements PatternDetectionService {

    private final HotspotZoneRepository zoneRepo;
    private final CrimeReportRepository reportRepo;
    private final PatternDetectionResultRepository resultRepo;
    private final AnalysisLogRepository logRepo;

    public PatternDetectionServiceImpl(
        HotspotZoneRepository zoneRepo,
        CrimeReportRepository reportRepo,
        PatternDetectionResultRepository resultRepo,
        AnalysisLogRepository logRepo) {
        this.zoneRepo = zoneRepo;
        this.reportRepo = reportRepo;
        this.resultRepo = resultRepo;
        this.logRepo = logRepo;
    }

    @Override
    public PatternDetectionResult detectPattern(Long zoneId) {
        HotspotZone zone = zoneRepo.findById(zoneId)
            .orElseThrow(() -> new ResourceNotFoundException("zone not found"));

        double lat = zone.getCenterLat();
        double lon = zone.getCenterLong();

        List<CrimeReport> reports = reportRepo.findByLatLongRange(
            lat - 0.1, lat + 0.1, lon - 0.1, lon + 0.1
        );

        int count = reports.size();
        String pattern;
        String severity;

        if (count > 5) {
            pattern = "High crime density";
            severity = "HIGH";
        } else if (count > 0) {
            pattern = "Medium crime density";
            severity = "MEDIUM";
        } else {
            pattern = "No crime pattern";
            severity = "LOW";
        }

        zone.setSeverityLevel(severity);
        zoneRepo.save(zone);

        PatternDetectionResult result =
            new PatternDetectionResult(zone, count, pattern);
        resultRepo.save(result);

        logRepo.save(new AnalysisLog("Pattern detected: " + pattern, zone));

        return result;
    }

    @Override
    public List<PatternDetectionResult> getResultsByZone(Long zoneId) {
        return resultRepo.findByZone_Id(zoneId);
    }
}
