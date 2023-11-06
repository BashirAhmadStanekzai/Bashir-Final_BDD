package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.PlansPage;
import tek.bdd.utilities.utilities;

import java.util.Date;

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

    @Then("Validate DATE CREATED is {}")
    public void validate_date_created_is_today_s(String expectedDate ) {
        Date expextedDate = new Date();
        String actualDate= getElementText(PlansPage.TODAY_DATE);
        String actualDate2= getElementText((PlansPage.TODAY_DATE_2));
        String actualDate3 = getElementText(PlansPage.TODAY_DATE_3);
        String actualDate4= getElementText(PlansPage.TODAY_DATE_4);

        Assert.assertEquals("validating date created column",
                expectedDate, actualDate);
        Assert.assertEquals("validating date created column",
                expectedDate, actualDate2);
        Assert.assertEquals("validating date created column",
                expectedDate, actualDate3);
        Assert.assertEquals("validating date created column",
                expectedDate, actualDate4);

    }
    @Then("Validate DATE EXPIRE is {}")
    public void validate_date_expire_is_day_after(String expectedDate) {
        String actualDate = getElementText(PlansPage.DAY_AFTER_DATE);
        String actualDate2 = getElementText((PlansPage.DAY_AFTER_DATE_2));
        String actualDate3 = getElementText(PlansPage.DAY_AFTER_DATE_3);
        String actualDate4 = getElementText(PlansPage.DAY_AFTER_DATE_4);

        Assert.assertEquals("validating date created column",
                expectedDate, actualDate);
        Assert.assertEquals("validating date created column",
                expectedDate, actualDate2);
        Assert.assertEquals("validating date created column",
                expectedDate, actualDate3);
        Assert.assertEquals("validating date created column",
                expectedDate, actualDate4);




    }



}
