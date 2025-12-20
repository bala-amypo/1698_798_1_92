package com.example.demo.service.impl;

import com.example.demo.model.CrimeReport;
import com.example.demo.repository.CrimeReportRepository;
import com.example.demo.service.CrimeReportService;
import java.time.LocalDateTime;
import java.util.List;

public class CrimeReportServiceImpl implements CrimeReportService {

    private final CrimeReportRepository repo;

    public CrimeReportServiceImpl(CrimeReportRepository repo) {
        this.repo = repo;
    }

    @Override
    public CrimeReport addReport(CrimeReport report) {
        if (report.getLatitude() < -90 || report.getLatitude() > 90)
            throw new IllegalArgumentException("Invalid latitude");
        if (report.getLongitude() < -180 || report.getLongitude() > 180)
            throw new IllegalArgumentException("Invalid longitude");
        if (report.getOccurredAt().isAfter(LocalDateTime.now()))
            throw new IllegalArgumentException("Crime time cannot be future");

        return repo.save(report);
    }

    @Override
    public List<CrimeReport> getAllReports() {
        return repo.findAll();
    }
}
