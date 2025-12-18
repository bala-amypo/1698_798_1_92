package com.example.demo.service;

import java.util.List;

import com.example.demo.model.HotspotZone;

public interface HotspotZoneService {

    HotspotZone createZone(HotspotZone zone);

    List<HotspotZone> getAllZones();
}