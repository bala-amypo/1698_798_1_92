package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.repository.PatternDetectionResultRepository;

@Service
public class PatternDetectionService {

    @Autowired
    private PatternDetectionResultRepository repository;

    public PatternDetectionResult detect(Long zoneId) {
        PatternDetectionResult result = new PatternDetectionResult();
        result.setZoneId(zoneId);
        result.setPattern("Sample Pattern");
        return repository.save(result);
    }

    public List<PatternDetectionResult> getResultsByZone(Long zoneId) {
        return repository.findByZoneId(zoneId);
    }
}
