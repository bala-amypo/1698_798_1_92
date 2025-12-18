package com.example.demo.controller;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.service.PatternDetectionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patterns")
public class PatternDetectionController {

    private final PatternDetectionService patternService;

    public PatternDetectionController(PatternDetectionService patternService) {
        this.patternService = patternService;
    }

    // Trigger pattern detection (dummy pattern for now)
    @PostMapping("/{zoneId}")
    public PatternDetectionResult detectPattern(@PathVariable Long zoneId) {

        // You can later replace this with real detection logic
        String detectedPattern = "SUSPICIOUS_ACTIVITY";

        return patternService.saveResult(zoneId, detectedPattern);
    }

    // Fetch results for a zone
    @GetMapping("/{zoneId}")
    public List<PatternDetectionResult> getResults(@PathVariable Long zoneId) {
        return patternService.getResultsByZone(zoneId);
    }
}
