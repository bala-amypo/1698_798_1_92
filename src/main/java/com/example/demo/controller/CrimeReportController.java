package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.CrimeReport;
import com.example.demo.service.CrimeReportService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/reports")
public class CrimeReportController {

    @Autowired
    private CrimeReportService crimeReportService;

    @PostMapping("/")
    public CrimeReport addReport(@RequestBody CrimeReport report) {
        return crimeReportService.addReport(report);
    }

    @GetMapping("/")
    public List<CrimeReport> getAllReports() {
        return crimeReportService.getAllReports();
    }
}
