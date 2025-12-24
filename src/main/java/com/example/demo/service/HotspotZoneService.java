package com.example.demo.service;

import com.example.demo.model.HotspotZone;
import java.util.List;

public interface HotspotZoneService {
    boolean existsByZoneName(String name);
    HotspotZone addZone(HotspotZone zone);
    List<HotspotZone> getZonesBySeverity(String level);
}
