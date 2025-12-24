package com.example.demo.service.impl;

import com.example.demo.model.CrimeReport;
import com.example.demo.repository.CrimeReportRepository;
import com.example.demo.service.CrimeReportService;
import java.util.List;

public class CrimeReportServiceImpl implements CrimeReportService {

    private final CrimeReportRepository repository;

    public CrimeReportServiceImpl(CrimeReportRepository repository) {
        this.repository = repository;
    }

    @Override
    public CrimeReport addReport(CrimeReport report) {
        return repository.save(report);
    }

    @Override
    public List<CrimeReport> getReportsInRange(
            double minLat, double maxLat,
            double minLong, double maxLong) {
        return repository.findByLatLongRange(minLat, maxLat, minLong, maxLong);
    }
}
