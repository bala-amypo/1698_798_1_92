package com.example.demo.service.impl;

import com.example.demo.model.HotspotZone;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.HotspotZoneService;
import java.util.List;

public class HotspotZoneServiceImpl implements HotspotZoneService {

    private final HotspotZoneRepository repository;

    public HotspotZoneServiceImpl(HotspotZoneRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean existsByZoneName(String name) {
        return repository.findByZoneName(name).isPresent();
    }

    @Override
    public HotspotZone addZone(HotspotZone zone) {
        return repository.save(zone);
    }

    @Override
    public List<HotspotZone> getZonesBySeverity(String level) {
        return repository.findBySeverityLevel(level);
    }
}
