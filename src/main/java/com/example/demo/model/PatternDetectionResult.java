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

    // getters and setters
}
