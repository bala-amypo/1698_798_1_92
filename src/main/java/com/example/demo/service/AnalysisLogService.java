package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnalysisLog;
import com.example.demo.repository.AnalysisLogRepository;

@Service
public class AnalysisLogService implements com.example.demo.service.AnalysisLogService {

    @Autowired
    private AnalysisLogRepository analysisLogRepository;

    @Override
    public AnalysisLog addLog(Long zoneId, String message) {
        AnalysisLog log = new AnalysisLog();
        log.setMessage(message);
        log.setLoggedAt(LocalDateTime.now());
        return analysisLogRepository.save(log);
    }

    @Override
    public List<AnalysisLog> getLogsByZone(Long zoneId) {
        return analysisLogRepository.findAll();
    }
}
