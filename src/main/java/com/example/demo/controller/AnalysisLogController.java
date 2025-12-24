package com.example.demo.controller;

import com.example.demo.model.AnalysisLog;
import com.example.demo.service.AnalysisLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analysis-logs")
@CrossOrigin
public class AnalysisLogController {

    @Autowired
    private AnalysisLogService analysisLogService;

    @PostMapping("/{zoneId}")
    public AnalysisLog createLog(
            @PathVariable Long zoneId,
            @RequestParam String message) {
        return analysisLogService.createLog(zoneId, message);
    }

    @GetMapping("/{zoneId}")
    public List<AnalysisLog> getLogsByZone(@PathVariable Long zoneId) {
        return analysisLogService.getLogsByZone(zoneId);
    }
}
