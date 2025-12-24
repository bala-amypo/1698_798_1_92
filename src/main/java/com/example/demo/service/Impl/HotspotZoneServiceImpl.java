package com.example.demo.service.Impl;

import com.example.demo.model.HotspotZone;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.HotspotZoneService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotspotZoneServiceImpl implements HotspotZoneService {

    private final HotspotZoneRepository repo;

    public HotspotZoneServiceImpl(HotspotZoneRepository repo) {
        this.repo = repo;
    }

    @Override
    public HotspotZone createZone(HotspotZone zone) {
        return repo.save(zone);
    }

    @Override
    public List<HotspotZone> getAllZones() {
        return repo.findAll();
    }
}
