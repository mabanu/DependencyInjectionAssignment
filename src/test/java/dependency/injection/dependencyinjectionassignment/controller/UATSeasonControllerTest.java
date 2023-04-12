package dependency.injection.dependencyinjectionassignment.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("UAT")
@SpringBootTest
class UATSeasonControllerTest {

    @Autowired
    SeasonController seasonController;
    @Test
    void saySeason() {
        System.out.println(seasonController.saySeason());

        var value = seasonController.saySeason();
        var expected = "UAT winter";

        assertThat(value).isEqualTo(expected);
    }
}