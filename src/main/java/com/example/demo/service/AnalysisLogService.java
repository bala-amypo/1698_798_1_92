package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnalysisLog;
import com.example.demo.repository.AnalysisLogRepository;

@Service
public class AnalysisLogService {

    @Autowired
    private AnalysisLogRepository repository;

    public AnalysisLog addLog(Long zoneId, AnalysisLog log) {
        log.setZoneId(zoneId);
        return repository.save(log);
    }

    public List<AnalysisLog> getLogsByZone(Long zoneId) {
        return repository.findByZoneId(zoneId);
    }
}
