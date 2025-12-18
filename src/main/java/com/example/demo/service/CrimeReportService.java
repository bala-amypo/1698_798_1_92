package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CrimeReport;
import com.example.demo.repository.CrimeReportRepository;

@Service
public class CrimeReportService implements com.example.demo.service.CrimeReportService {

    @Autowired
    private CrimeReportRepository crimeReportRepository;

    @Override
    public CrimeReport addReport(CrimeReport report) {
        return crimeReportRepository.save(report);
    }

    @Override
    public List<CrimeReport> getAllReports() {
        return crimeReportRepository.findAll();
    }
}
