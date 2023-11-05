package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.PlansPage;
import tek.bdd.utilities.utilities;

public class PlansSteps extends utilities {

    @Then("user clicks on plans button")
    public void user_clicks_on_plans_button() throws InterruptedException {
        buttonClick(PlansPage.plansButtonLocator);
        Thread.sleep(5000);

    }

    @Then("{int} rows should be displayed for the user")
    public void rows_should_be_displayed_for_the_user(int expectedRowNumber) {
       int actualRowNumber = getTableRows(PlansPage.plansRowLocator);
        Assert.assertEquals(expectedRowNumber,actualRowNumber);



    }

}
