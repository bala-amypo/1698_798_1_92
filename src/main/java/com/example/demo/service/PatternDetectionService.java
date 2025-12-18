package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.repository.PatternDetectionResultRepository;

@Service
public class PatternDetectionService implements com.example.demo.service.PatternDetectionService {

    @Autowired
    private PatternDetectionResultRepository patternRepo;

    @Override
    public PatternDetectionResult detectPattern(Long zoneId) {
        PatternDetectionResult result = new PatternDetectionResult();
        result.setCrimeCount(0);
        result.setDetectedPattern("No pattern detected");
        return patternRepo.save(result);
    }

    @Override
    public List<PatternDetectionResult> getResultsByZone(Long zoneId) {
        return patternRepo.findAll();
    }
}
