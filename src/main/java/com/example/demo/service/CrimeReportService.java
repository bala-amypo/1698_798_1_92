package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CrimeReport;

public interface CrimeReportService {

    CrimeReport addReport(CrimeReport report);

    List<CrimeReport> getAllReports();
}
