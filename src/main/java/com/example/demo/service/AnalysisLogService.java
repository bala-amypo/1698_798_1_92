@Service
public class AnalysisLogService {

    @Autowired
    private AnalysisLogRepository repo;

    public AnalysisLog addLog(Long zoneId, String message) {
        AnalysisLog log = new AnalysisLog();
        log.setMessage(message);
        log.setLoggedAt(LocalDateTime.now());
        return repo.save(log);
    }

    public List<AnalysisLog> getLogsByZone(Long zoneId) {
        return repo.findAll();
    }
}
