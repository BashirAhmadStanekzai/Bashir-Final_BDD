package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tek.bdd.pages.HomePage;
import tek.bdd.utilities.utilities;

public class AccountError extends utilities {


    @When("the user enters an existing email address {string}")
    public void the_user_enters_an_existing_email_address(String email) {
        sendText(HomePage.emailLocator, "basheer.stanekzai12@gmail.com");
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


    @Then("the error message should be shown")
    public void theMessageShouldBeSame() {
        String actualErrorMessage = getElementText(HomePage.errorMessageLocator);
        String expectedText = "ERROR\n" +
                "Account with email basheer.stanekzai12@gmail.com is exist";
        Assert.assertEquals(expectedText,  actualErrorMessage);

    }




    }




