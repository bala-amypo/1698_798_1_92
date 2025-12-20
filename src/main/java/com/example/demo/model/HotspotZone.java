
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class HotspotZone {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotBlank
@Column(unique = true)
private String zoneName;

@Min(-90)
@Max(90)
private Double centerLat;

@Min(-180)
@Max(180)
private Double centerLong;


@NotBlank
private String severityLevel;

public HotspotZone() {
}

public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getZoneName() {
return zoneName;
}

public void setZoneName(String zoneName) {
this.zoneName = zoneName;
}

public Double getCenterLat() {
return centerLat;
}

public void setCenterLat(Double centerLat) {
this.centerLat = centerLat;
}

public Double getCenterLong() {
return centerLong;
}

public void setCenterLong(Double centerLong) {
this.centerLong = centerLong;
}

public String getSeverityLevel() {
return severityLevel;
}

public void setSeverityLevel(String severityLevel) {
this.severityLevel = severityLevel;
}
}




