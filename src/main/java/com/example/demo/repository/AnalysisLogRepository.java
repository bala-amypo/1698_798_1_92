public interface AnalysisLogRepository
        extends JpaRepository<AnalysisLog, Long> {
    List<AnalysisLog> findByZone_Id(Long zoneId);
}
