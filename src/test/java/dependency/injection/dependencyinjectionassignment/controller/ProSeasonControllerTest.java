package dependency.injection.dependencyinjectionassignment.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("PRO")
@SpringBootTest
class ProSeasonControllerTest {

    @Autowired
    SeasonController seasonController;
    @Test
    void saySeason() {
        System.out.println(seasonController.saySeason());

        var value = seasonController.saySeason();
        var expected = "Production spring";

        assertThat(value).isEqualTo(expected);
    }
}