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

public class AccountError extends utilities {

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

    //verify error for duplicate email_address
    @When("Verify {string}")
    public void verify_errorMessage(String expectedMessage){
        String actualMessage = getElementText(HomePage.BANNER_ERROR_PATH).replace("ERROR", "").trim();
        Assert.assertEquals("Verify Duplicate errorMessage"
                ,expectedMessage
                ,actualMessage);
    }




    }









