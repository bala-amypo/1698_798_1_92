package com.example.demo.service;

import com.example.demo.model.HotspotZone;
import java.util.List;

public interface HotspotZoneService {
    HotspotZone createZone(HotspotZone zone);
    List<HotspotZone> getAllZones();
}
