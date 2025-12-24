package com.example.demo.service;

import com.example.demo.model.PatternDetectionResult;

public interface PatternDetectionService {
    PatternDetectionResult detectPattern(Long zoneId);
}
