package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.service.PatternDetectionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/patterns")
public class PatternDetectionController {

    @Autowired
    private PatternDetectionService patternService;

    @PostMapping("/detect/{zoneId}")
    public PatternDetectionResult detectPattern(@PathVariable Long zoneId) {
        return patternService.detect(zoneId);
    }

    @GetMapping("/zone/{zoneId}")
    public List<PatternDetectionResult> getResults(@PathVariable Long zoneId) {
        return patternService.getResultsByZone(zoneId);
    }
}
