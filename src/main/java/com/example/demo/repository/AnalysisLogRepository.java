package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AnalysisLog;

@Repository
public interface AnalysisLogRepository extends JpaRepository<AnalysisLog, Long> {
}
