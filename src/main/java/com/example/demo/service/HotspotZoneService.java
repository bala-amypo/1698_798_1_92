@Service
public class HotspotZoneService {

    @Autowired
    private HotspotZoneRepository repo;

    public HotspotZone addZone(HotspotZone zone) {
        return repo.save(zone);
    }

    public List<HotspotZone> getAllZones() {
        return repo.findAll();
    }
}
