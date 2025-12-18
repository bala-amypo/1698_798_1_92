package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.HotspotZone;
import com.example.demo.repository.HotspotZoneRepository;

@Service
public class HotspotZoneService implements com.example.demo.service.HotspotZoneService {

    @Autowired
    private HotspotZoneRepository hotspotZoneRepository;

    @Override
    public HotspotZone addZone(HotspotZone zone) {
        return hotspotZoneRepository.save(zone);
    }

    @Override
    public List<HotspotZone> getAllZones() {
        return hotspotZoneRepository.findAll();
    }
}
