package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "crime_reports")
public class CrimeReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String crimeType;

    @Column(length = 1000)
    private String description;

    private Double latitude;

    private Double longitude;

    private LocalDateTime occurredAt;

    public CrimeReport() {
    }

    public CrimeReport(String crimeType,
                       String description,
                       Double latitude,
                       Double longitude,
                       LocalDateTime occurredAt) {
        this.crimeType = crimeType;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.occurredAt = occurredAt;
    }

    /* ========= GETTERS ========= */

    public Long getId() {
        return id;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public String getDescription() {
        return description;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public LocalDateTime getOccurredAt() {
        return occurredAt;
    }

    /* ========= SETTERS ========= */

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setOccurredAt(LocalDateTime occurredAt) {
        this.occurredAt = occurredAt;
    }
}
