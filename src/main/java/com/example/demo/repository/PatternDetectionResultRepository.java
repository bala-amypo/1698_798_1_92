public interface PatternDetectionResultRepository
        extends JpaRepository<PatternDetectionResult, Long> {
    List<PatternDetectionResult> findByZone_Id(Long zoneId);
}
