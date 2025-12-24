package com.example.demo.service;

import com.example.demo.model.PatternDetectionResult;
import java.util.List;
import org.springframework.stereotype.Service;

public interface PatternDetectionService {
    PatternDetectionResult detectPattern(Long zoneId);
    PatternDetectionResult saveResult(Long zoneId, String pattern);
    List<PatternDetectionResult> getResultsByZone(Long zoneId);
}
