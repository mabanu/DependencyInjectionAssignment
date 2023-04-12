package dependency.injection.dependencyinjectionassignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service("seasonService")
public class DevSeasonServiceImpl implements SeasonService {
    @Override
    public String saySeason() {
        return "Dev Summer";
    }
}
