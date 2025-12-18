package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HotspotZone;

@Repository
public interface HotspotZoneRepository extends JpaRepository<HotspotZone, Long> {
}
