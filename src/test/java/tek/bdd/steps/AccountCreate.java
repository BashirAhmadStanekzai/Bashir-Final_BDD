package tek.bdd.steps;

import io.cucumber.java.en.And;
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

    @When("Navigating to home page click on Create Primary Account button")
    public void click_CreatePAccount(){
        buttonClick(HomePage.primaryAccountButton);
    }

    @And("Type in email address {string}")
    public void type_Email(String email){
        sendText(HomePage.EMAIL_PATH, email);
    }

    @And("Choose the prefix as {string}")
    public void type_Title(String title){
        selectFromDropDown(HomePage.TITLE_PATH,title);
    }

    @And("Type in first name {string}")
    public void type_fName(String name){
        sendText(HomePage.FIRST_NAME_PATH, name);
    }

    @And("Type in last name {string}")
    public void type_LName(String lName){
        sendText(HomePage.LAST_NAME_PATH, lName);
    }

    @And("Select gender as {string}")
    public void type_Gender(String gender){
        selectFromDropDown(HomePage.GENDER_PATH, gender);
    }

    @And("Select Marital Status as {string}")
    public void type_maritalStatus(String maritalStatus){
        selectFromDropDown(HomePage.MARITAL_STATUS_PATH, maritalStatus);
    }

    @And("Type in Employment Status as {string}")
    public void type_empStatus(String empStatus){
        sendText(HomePage.EMPLOYMENT_STATUS, empStatus);
    }

    @And("Select DOB as {string}")
    public void type_DOB(String DOB){
        sendText(HomePage.DATE_OF_BIRTH, DOB);

    }

    @Then("click on Create Account button")
    public void click_CreateAccount(){
        buttonClick(HomePage.CREATE_ACCOUNT_BUTTON);
    }

    @And("Validate email address as {string}")
    public void validate_emailAddress(String expectedEmail){
        webElement_list_check(HomePage.SIGN_UP_ACCOUNT_EMAIL_TITLE, expectedEmail);
    }

    @When("Verify {string}")
    public void verify_errorMessage(String expectedMessage){
        String actualMessage = getElementText(HomePage.BANNER_ERROR_PATH).replace("ERROR", "").trim();
        Assert.assertEquals("Verify Duplicate errorMessage"
                ,expectedMessage
                ,actualMessage);
    }



}
