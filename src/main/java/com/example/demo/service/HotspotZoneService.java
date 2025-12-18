package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.HotspotZone;

public interface HotspotZoneService {

    HotspotZone addZone(HotspotZone zone);

    List<HotspotZone> getAllZones();
}
