package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CrimeReport;
import com.example.demo.repository.CrimeReportRepository;

@Service
public class CrimeReportService {

    @Autowired
    private CrimeReportRepository crimeReportRepository;

    public CrimeReport save(CrimeReport report) {
        return crimeReportRepository.save(report);
    }

    public List<CrimeReport> getAll() {
        return crimeReportRepository.findAll();
    }
}
