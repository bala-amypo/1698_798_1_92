package com.example.demo.service;

import com.example.demo.model.HotspotZone;
import com.example.demo.model.PatternDetectionResult;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.repository.PatternDetectionResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatternDetectionService {

    private final PatternDetectionResultRepository repository;
    private final HotspotZoneRepository hotspotZoneRepository;

    public PatternDetectionService(
            PatternDetectionResultRepository repository,
            HotspotZoneRepository hotspotZoneRepository) {
        this.repository = repository;
        this.hotspotZoneRepository = hotspotZoneRepository;
    }

    public PatternDetectionResult saveResult(Long zoneId, String pattern) {

        HotspotZone zone = hotspotZoneRepository.findById(zoneId)
                .orElseThrow(() -> new RuntimeException("Zone not found"));

        PatternDetectionResult result = new PatternDetectionResult();
        result.setZone(zone);
        result.setPattern(pattern);

        return repository.save(result);
    }

    public List<PatternDetectionResult> getResultsByZone(Long zoneId) {
        return repository.findByZone_Id(zoneId);
    }
}
