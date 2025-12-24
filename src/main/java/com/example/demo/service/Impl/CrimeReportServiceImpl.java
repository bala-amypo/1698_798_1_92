package com.example.demo.service.Impl;

import com.example.demo.model.CrimeReport;
import com.example.demo.repository.CrimeReportRepository;
import com.example.demo.service.CrimeReportService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CrimeReportServiceImpl implements CrimeReportService {

    private final CrimeReportRepository repo;

    public CrimeReportServiceImpl(CrimeReportRepository repo) {
        this.repo = repo;
    }

    @Override
    public CrimeReport addReport(CrimeReport report) {
        return repo.save(report);
    }

    @Override
    public List<CrimeReport> getAllReports() {
        return repo.findAll();
    }
}
