package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import tek.bdd.pages.AccountPage;
import tek.bdd.pages.HomePage;
import tek.bdd.utilities.utilities;

public class HomeSteps extends utilities {


    @Then("the {string} is displayed")
    public void the_is_displayed(String expectedButton) {
        boolean actualButton = isElementDisplayed(HomePage.primaryAccountButton);
        Assert.assertTrue("The Button is not displayed in the Home Page", actualButton);

    }
    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        String actualTile = getDriver().getTitle();

        Assert.assertEquals("Title Validation",
                expectedTitle,
                actualTile);

    }

    @When("click on the {string} button")
    public void clickOnThePrimaryAccountButton(String expectedButton) throws InterruptedException {
        buttonClick(AccountPage.primaryAccountButton);
        Thread.sleep(2000);


    }
    @Then("the Form Title is {string}")
    public void theFormTitleIsPrimaryAccountHolder(String expectedTitle) {
        String actualText = getElementText(AccountPage.createAccountHolder);
        org.junit.Assert.assertEquals("validate title", expectedTitle, actualText);


    }


}
