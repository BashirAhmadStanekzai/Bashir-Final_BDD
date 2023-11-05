package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.LoginPage;
import tek.bdd.utilities.utilities;

public class LoginError extends utilities {


    @Then("error message should be displayed")
    public void error_message_should_be_displayed() throws InterruptedException {
        String actualErrorMessage = getElementText(LoginPage.errorBanner);
        String expectedErrorMessage = "ERROR\n" +
                "User wrong username not found";
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
        Thread.sleep(5000);


    }
}
