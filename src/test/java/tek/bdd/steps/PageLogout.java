package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.ProfilePage;
import tek.bdd.utilities.utilities;

public class PageLogout extends utilities {

    @Then("user clicks on logout button")
    public void user_clicks_on_logout_button() throws InterruptedException {
       buttonClick(ProfilePage.LOGOUT_LOCATOR);
       Thread.sleep(5000);
    }
    @Then("user is on homepage")
    public void user_is_on_homepage() {
        String actualText = getElementText(ProfilePage.HEADING_LOCATOR);
        String expectedText = "Lets get you started";
        Assert.assertEquals(actualText,expectedText);

    }

}
