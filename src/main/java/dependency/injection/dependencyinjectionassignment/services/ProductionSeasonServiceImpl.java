package dependency.injection.dependencyinjectionassignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PRO")
@Service("seasonService")
public class ProductionSeasonServiceImpl implements SeasonService {
    @Override
    public String saySeason() {
        return "Production spring";
    }
}
