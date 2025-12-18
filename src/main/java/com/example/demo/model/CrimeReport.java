package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

@Entity
public class CrimeReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String crimeType;

    private String description;

    @Min(-90)
    @Max(90)
    private Double latitude;

    @Min(-180)
    @Max(180)
    private Double longitude;

    @PastOrPresent
    private LocalDateTime occurredAt;

    public CrimeReport() {
    }

  
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getCrimeType() {
        return crimeType;
    }
 
    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public Double getLatitude() {
        return latitude;
    }
 
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
 
    public Double getLongitude() {
        return longitude;
    }
 
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
 
    public LocalDateTime getOccurredAt() {
        return occurredAt;
    }
 
    public void setOccurredAt(LocalDateTime occurredAt) {
        this.occurredAt = occurredAt;
    }
}
