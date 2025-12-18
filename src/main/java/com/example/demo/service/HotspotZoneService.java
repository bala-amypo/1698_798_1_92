package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.HotspotZone;
import com.example.demo.repository.HotspotZoneRepository;

@Service
public class HotspotZoneService {

    @Autowired
    private HotspotZoneRepository hotspotZoneRepository;

    public HotspotZone save(HotspotZone zone) {
        return hotspotZoneRepository.save(zone);
    }

    public List<HotspotZone> getAll() {
        return hotspotZoneRepository.findAll();
    }
}
