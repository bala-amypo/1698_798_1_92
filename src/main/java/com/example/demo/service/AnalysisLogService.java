
package com.example.demo.service;

import java.util.List;
import com.example.demo.model.AnalysisLog;

public interface AnalysisLogService {

    AnalysisLog addLog(Long zoneId, AnalysisLog log);

    List<AnalysisLog> getLogsByZone(Long zoneId);
}
