package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.HotspotZone;
import com.example.demo.service.HotspotZoneService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/zones")
public class HotspotZoneController {

    @Autowired
    private HotspotZoneService hotspotZoneService;

    @PostMapping("/")
    public HotspotZone createZone(@RequestBody HotspotZone zone) {
        return hotspotZoneService.createZone(zone);
    }

    @GetMapping("/")
    public List<HotspotZone> getAllZones() {
        return hotspotZoneService.getAllZones();
    }
}
