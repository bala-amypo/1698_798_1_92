package com.example.demo.service;

import com.example.demo.model.AnalysisLog;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AnalysisLogService {
    AnalysisLog createLog(Long zoneId, String message);
    List<AnalysisLog> getLogsByZone(Long zoneId);
}
