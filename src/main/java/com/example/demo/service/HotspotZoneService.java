package com.example.demo.service;

import com.example.demo.model.HotspotZone;
import java.util.List;
import org.springframework.stereotype.Service;

public interface HotspotZoneService {
    HotspotZone createZone(HotspotZone zone);
    List<HotspotZone> getAllZones();
}
