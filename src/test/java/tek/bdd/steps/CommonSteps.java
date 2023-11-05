package tek.bdd.steps;

import io.cucumber.java.en.When;
import org.junit.Assert;

public class CommonSteps {

    @When("Wait {int} Second")
    public void waitInSeconds(Integer seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            Assert.fail("Interrupted Exception happened on Wait Step");
        }

    }   }