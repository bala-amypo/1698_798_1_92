public interface HotspotZoneRepository extends JpaRepository<HotspotZone, Long> {
    boolean existsByZoneName(String zoneName);
    Optional<HotspotZone> findByZoneName(String zoneName);
    List<HotspotZone> findBySeverityLevel(String severityLevel);
}
