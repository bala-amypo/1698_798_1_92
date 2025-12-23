package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hotspot_zones")
public class HotspotZone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String zoneName;

    private Double centerLat;
    private Double centerLong;
    private String severityLevel;

    public HotspotZone() {}

    public HotspotZone(String zoneName, Double centerLat, Double centerLong) {
        this.zoneName = zoneName;
        this.centerLat = centerLat;
        this.centerLong = centerLong;
        this.severityLevel = "LOW";
    }

    // getters and setters
}
