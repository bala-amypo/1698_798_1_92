package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnalysisLog;
import com.example.demo.repository.AnalysisLogRepository;

@Service
public class AnalysisLogService {

    @Autowired
    private AnalysisLogRepository analysisLogRepository;

    public AnalysisLog saveLog(AnalysisLog log) {
        log.setCreatedAt(LocalDateTime.now());
        return analysisLogRepository.save(log);
    }

    public List<AnalysisLog> getAllLogs() {
        return analysisLogRepository.findAll();
    }
}
