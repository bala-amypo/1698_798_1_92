package com.example.demo.service;

import com.example.demo.model.AnalysisLog;
import com.example.demo.model.HotspotZone;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.repository.HotspotZoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalysisLogService {

private final AnalysisLogRepository analysisLogRepository;
private final HotspotZoneRepository hotspotZoneRepository;

public AnalysisLogService(AnalysisLogRepository analysisLogRepository,
HotspotZoneRepository hotspotZoneRepository) {
this.analysisLogRepository = analysisLogRepository;
this.hotspotZoneRepository = hotspotZoneRepository;
}

public AnalysisLog createLog(Long zoneId, String message) {

HotspotZone zone = hotspotZoneRepository.findById(zoneId)
.orElseThrow(() -> new RuntimeException("HotspotZone not found"));

AnalysisLog log = new AnalysisLog();
log.setMessage(message);
log.setZone(zone);

return analysisLogRepository.save(log);
}

public List<AnalysisLog> getLogsByZone(Long zoneId) {
return analysisLogRepository.findByZone_Id(zoneId);
}
}

