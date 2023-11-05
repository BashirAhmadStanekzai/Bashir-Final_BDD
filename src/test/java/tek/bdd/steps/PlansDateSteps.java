package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.PlansPage;
import tek.bdd.utilities.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PlansDateSteps extends utilities {
    

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
