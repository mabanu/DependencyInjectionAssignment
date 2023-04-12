package dependency.injection.dependencyinjectionassignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("seasonService")
public class QASeasonServiceImpl implements SeasonService {
    @Override
    public String saySeason() {
        return "QA Autumn";
    }
}
