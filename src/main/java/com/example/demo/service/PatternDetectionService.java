@Service
public class PatternDetectionService {

    @Autowired
    private PatternDetectionResultRepository repo;

    public PatternDetectionResult detectPattern(Long zoneId) {
        PatternDetectionResult r = new PatternDetectionResult();
        r.setCrimeCount(0);
        r.setDetectedPattern("No Pattern");
        return repo.save(r);
    }

    public List<PatternDetectionResult> getResultsByZone(Long zoneId) {
        return repo.findAll();
    }
}
