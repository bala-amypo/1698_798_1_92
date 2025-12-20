package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pattern_detection_results")
public class PatternDetectionResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private HotspotZone zone;

    private LocalDate analysisDate;
    private Integer crimeCount;
    private String detectedPattern;

    public PatternDetectionResult() {}

    public PatternDetectionResult(HotspotZone zone, Integer crimeCount, String detectedPattern) {
        this.zone = zone;
        this.crimeCount = Math.max(0, crimeCount);
        this.detectedPattern = detectedPattern;
        this.analysisDate = LocalDate.now();
    }

    // getters
}
