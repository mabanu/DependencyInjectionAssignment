package dependency.injection.dependencyinjectionassignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("seasonService")
public class UATSeasonServiceImpl implements SeasonService {
    @Override
    public String saySeason() {
        return "UAT winter";
    }
}
