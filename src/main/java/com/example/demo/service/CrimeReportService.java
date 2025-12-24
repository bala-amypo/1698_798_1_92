package com.example.demo.service;

import com.example.demo.model.CrimeReport;
import java.util.List;
import org.springframework.stereotype.Service;

public interface CrimeReportService {
    CrimeReport addReport(CrimeReport report);
    List<CrimeReport> getAllReports();
}
