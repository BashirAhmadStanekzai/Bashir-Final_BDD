package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tek.bdd.pages.HomePage;
import tek.bdd.utilities.utilities;

public class AccountCreate extends utilities {

    String text = "elonmusk.";
    int number = (int)(Math.random()*10000);
   String emailAddress = text+number+"@gmail.com";
    @When("i click on create primary account")
    public void i_click_on_create_primary_account() {
        buttonClick(HomePage.primaryAccountButton);

    }
    @When("when i fill up the form")
    public void when_i_fill_up_the_form() {
        sendText(HomePage.emailLocator, emailAddress);
        WebElement titleElement = getDriver().findElement(By.id("title"));
        Select select = new Select(titleElement);
        select.selectByVisibleText("Mr.");
        sendText(HomePage.fNameLocator, "Bashir Ahmad");
        sendText(HomePage.lNameLocator, "Stanekzai");
        WebElement genderElement = getDriver().findElement(By.name("gender"));
        Select select1 = new Select(genderElement);
        select1.selectByVisibleText("Male");
        WebElement maritalStatusElement = getDriver().findElement(By.id("maritalStatus"));
        Select select3 = new Select(maritalStatusElement);
        select3.selectByVisibleText("Single");
        sendText(HomePage.employmentStatusLocator, "SDET");
        sendText(HomePage.dateOfBirthLocator, "12/11/1994");



    }
    @Then("i click create account button")
    public void i_click_create_account_button() throws InterruptedException {
        buttonClick(HomePage.createAccountButton);
        Thread.sleep(5000);


    }


    @Then("i see email address shows as expected")
    public void i_see_email_address_shows_as_expected() {
        String actualText = getElementText(HomePage.enteredEmail);
        String expectedText = emailAddress;
        Assert.assertEquals(expectedText, actualText);

    }



}
