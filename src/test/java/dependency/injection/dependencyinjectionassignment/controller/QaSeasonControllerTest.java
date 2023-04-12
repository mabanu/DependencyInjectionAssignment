package dependency.injection.dependencyinjectionassignment.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("QA")
@SpringBootTest
class QaSeasonControllerTest {

    @Autowired
    SeasonController seasonController;

    @Test
    void saySeason() {
        System.out.println(seasonController.saySeason());

        var value = seasonController.saySeason();
        var expected = "QA Autumn";

        assertThat(value).isEqualTo(expected);
    }
}