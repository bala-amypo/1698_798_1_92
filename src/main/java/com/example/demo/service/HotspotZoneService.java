package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.HotspotZone;
import com.example.demo.repository.HotspotZoneRepository;

@Service
public class HotspotZoneService {

    @Autowired
    private HotspotZoneRepository repository;

    public HotspotZone createZone(HotspotZone zone) {
        return repository.save(zone);
    }

    public List<HotspotZone> getAllZones() {
        return repository.findAll();
    }
}
