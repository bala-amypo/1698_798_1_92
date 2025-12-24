package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hotspot_zones")
public class HotspotZone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String zoneName;

    private Double centerLat;

    private Double centerLong;

    private String severityLevel;

    public HotspotZone() {
    }

    public HotspotZone(String zoneName, Double centerLat, Double centerLong) {
        this.zoneName = zoneName;
        this.centerLat = centerLat;
        this.centerLong = centerLong;
        this.severityLevel = "LOW";
    }

    /* ========= GETTERS ========= */

    public Long getId() {
        return id;
    }

    public String getZoneName() {
        return zoneName;
    }

    public Double getCenterLat() {
        return centerLat;
    }

    public Double getCenterLong() {
        return centerLong;
    }

    public String getSeverityLevel() {
        return severityLevel;
    }

    /* ========= SETTERS ========= */

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public void setCenterLat(Double centerLat) {
        this.centerLat = centerLat;
    }

    public void setCenterLong(Double centerLong) {
        this.centerLong = centerLong;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }
}
