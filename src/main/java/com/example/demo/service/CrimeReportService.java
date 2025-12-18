@Service
public class CrimeReportService {

    @Autowired
    private CrimeReportRepository repo;

    public CrimeReport addReport(CrimeReport report) {
        return repo.save(report);
    }

    public List<CrimeReport> getAllReports() {
        return repo.findAll();
    }
}
