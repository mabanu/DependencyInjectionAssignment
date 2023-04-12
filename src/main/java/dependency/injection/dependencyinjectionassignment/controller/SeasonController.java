package dependency.injection.dependencyinjectionassignment.controller;

import dependency.injection.dependencyinjectionassignment.services.SeasonService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
public class SeasonController {
    private final SeasonService seasonService;

    public SeasonController(SeasonService seasonService) {
        this.seasonService = seasonService;
    }

    public String saySeason() {
        return seasonService.saySeason();
    }
}
