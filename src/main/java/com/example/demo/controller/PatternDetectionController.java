package com.example.demo.controller;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.service.PatternDetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patterns")
@CrossOrigin
public class PatternDetectionController {

    @Autowired
    private PatternDetectionService patternService;

    @PostMapping("/{zoneId}")
    public PatternDetectionResult saveResult(
            @PathVariable Long zoneId,
            @RequestParam String pattern) {
        return patternService.saveResult(zoneId, pattern);
    }

    @GetMapping("/{zoneId}")
    public List<PatternDetectionResult> getResultsByZone(
            @PathVariable Long zoneId) {
        return patternService.getResultsByZone(zoneId);
    }
}
