package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.PlansPage;
import tek.bdd.utilities.utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PlansSteps extends utilities {

    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d, yyyy");
    String todaySFormattedDate = simpleDateFormat.format(date);
    Calendar calendar = Calendar.getInstance();


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

    @Then("Validate DATE CREATED is today")
    public void validateDateCreatedIsTodayS() {

        String actualDate= getElementText(PlansPage.TODAY_DATE);
        String actualDate2= getElementText((PlansPage.TODAY_DATE_2));
        String actualDate3 = getElementText(PlansPage.TODAY_DATE_3);
        String actualDate4= getElementText(PlansPage.TODAY_DATE_4);

        Assert.assertEquals("validating date created column",
                todaySFormattedDate, actualDate);
        Assert.assertEquals("validating date created column",
                todaySFormattedDate, actualDate2);
        Assert.assertEquals("validating date created column",
                todaySFormattedDate, actualDate3);
        Assert.assertEquals("validating date created column",
                todaySFormattedDate, actualDate4);

    }
    @Then("Validate DATE EXPIRE is tomorrow")
    public void validateDateExpireIsTomorrow() {
        calendar.add(Calendar.DATE,1);
        String tomorrowSDateFormatted = simpleDateFormat.format(calendar.getTime());

        String actualDate = getElementText(PlansPage.DAY_AFTER_DATE);
        String actualDate2 = getElementText((PlansPage.DAY_AFTER_DATE_2));
        String actualDate3 = getElementText(PlansPage.DAY_AFTER_DATE_3);
        String actualDate4 = getElementText(PlansPage.DAY_AFTER_DATE_4);

        Assert.assertEquals("validating date created column",
                tomorrowSDateFormatted, actualDate);
        Assert.assertEquals("validating date created column",
                tomorrowSDateFormatted, actualDate2);
        Assert.assertEquals("validating date created column",
                tomorrowSDateFormatted, actualDate3);
        Assert.assertEquals("validating date created column",
                tomorrowSDateFormatted, actualDate4);




    }



}
