package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.AnalysisLog;
import com.example.demo.service.AnalysisLogService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/logs")
public class AnalysisLogController {

    @Autowired
    private AnalysisLogService analysisLogService;

    @PostMapping("/{zoneId}")
    public AnalysisLog addLog(@PathVariable Long zoneId,
                              @RequestBody AnalysisLog log) {
        return analysisLogService.addLog(zoneId, log);
    }

    @GetMapping("/zone/{zoneId}")
    public List<AnalysisLog> getLogsByZone(@PathVariable Long zoneId) {
        return analysisLogService.getLogsByZone(zoneId);
    }
}
