package com.example.demo.service.impl;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.model.HotspotZone;
import com.example.demo.repository.PatternDetectionResultRepository;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.PatternDetectionService;

import java.util.List;
@Service
public class PatternDetectionServiceImpl implements PatternDetectionService {

    private final PatternDetectionResultRepository resultRepo;
    private final HotspotZoneRepository zoneRepo;

    public PatternDetectionServiceImpl(
            PatternDetectionResultRepository resultRepo,
            HotspotZoneRepository zoneRepo) {
        this.resultRepo = resultRepo;
        this.zoneRepo = zoneRepo;
    }

    @Override
    public PatternDetectionResult detectPattern(Long zoneId) {
        HotspotZone zone = zoneRepo.findById(zoneId).orElse(null);
        PatternDetectionResult result = new PatternDetectionResult();
        result.setZone(zone);
        result.setDetectedPattern("No");
        return resultRepo.save(result);
    }

    @Override
    public PatternDetectionResult saveResult(Long zoneId, String pattern) {
        HotspotZone zone = zoneRepo.findById(zoneId).orElse(null);
        PatternDetectionResult result = new PatternDetectionResult();
        result.setZone(zone);
        result.setDetectedPattern(pattern);
        return resultRepo.save(result);
    }

    @Override
    public List<PatternDetectionResult> getResultsByZone(Long zoneId) {
        return resultRepo.findByZone_Id(zoneId);
    }
}
