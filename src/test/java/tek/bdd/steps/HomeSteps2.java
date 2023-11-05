package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.AccountPage;
import tek.bdd.utilities.utilities;

public class HomeSteps2 extends utilities {

    @When("click on the {string} button")
    public void clickOnThePrimaryAccountButton(String expectedButton) throws InterruptedException {
        buttonClick(AccountPage.primaryAccountButton);
        Thread.sleep(2000);


    }
    @Then("the Form Title is {string}")
    public void theFormTitleIsPrimaryAccountHolder(String expectedTitle) {
        String actualText = getElementText(AccountPage.createAccountHolder);
        Assert.assertEquals("validate title", expectedTitle, actualText);


    }






}








