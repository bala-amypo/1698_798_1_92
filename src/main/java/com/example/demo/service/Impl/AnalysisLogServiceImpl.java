package com.example.demo.service.Impl;

import com.example.demo.model.AnalysisLog;
import com.example.demo.model.HotspotZone;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.AnalysisLogService;

public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final AnalysisLogRepository logRepo;
    private final HotspotZoneRepository zoneRepo;

    public AnalysisLogServiceImpl(
            AnalysisLogRepository logRepo,
            HotspotZoneRepository zoneRepo) {
        this.logRepo = logRepo;
        this.zoneRepo = zoneRepo;
    }

    @Override
    public void addLog(Long zoneId, String message) {
        HotspotZone zone = zoneRepo.findById(zoneId).orElse(null);
        AnalysisLog log = new AnalysisLog();
        log.setMessage(message);
        log.setZone(zone);
        logRepo.save(log);
    }
}
