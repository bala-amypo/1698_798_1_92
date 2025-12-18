package com.example.demo.model;
import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Entity
public class AnalysisLog {

    
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String message;
    private HotspotZone Zone;
    private LocalDateTime LoggedAt;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public HotspotZone getZone() {
        return Zone;
    }
    public void setZone(HotspotZone zone) {
        Zone = zone;
    }
    public LocalDateTime getLoggedAt() {
        return LoggedAt;
    }
    public void setLoggedAt(LocalDateTime loggedAt) {
        LoggedAt = loggedAt;
    }
    public AnalysisLog() {
    }
    public AnalysisLog(Long id, String message, HotspotZone zone, LocalDateTime loggedAt) {
        this.id = id;
        this.message = message;
        Zone = zone;
        LoggedAt = loggedAt;
    }

    
}
