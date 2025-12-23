public interface CrimeReportRepository extends JpaRepository<CrimeReport, Long> {
    List<CrimeReport> findByLatLongRange(
        double minLat, double maxLat,
        double minLong, double maxLong
    );
}
