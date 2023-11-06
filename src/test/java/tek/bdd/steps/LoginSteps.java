package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.LoginPage;
import tek.bdd.utilities.utilities;

public class LoginSteps extends utilities {

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() throws InterruptedException {
        buttonClick(LoginPage.loginButtonLocator);
        Thread.sleep(5000);


    }
    @Then("user enters username as {string}")
    public void user_enters_username_as(String username) {
        sendText(LoginPage.userNameLocator, username);


    }
    @Then("user enters password as {string}")
    public void user_enters_password_as(String password) {
        sendText(LoginPage.passwordLocator, password);


    }

    @Then("user click sign in button")
    public void user_click_sign_in_button() throws InterruptedException {
        buttonClick(LoginPage.signInButton);
        Thread.sleep(5000);




    }
    @Then("customer service portal should be displayed")
    public void customer_service_portal_should_be_displayed() {
        String actualTitle = getElementText(LoginPage.titleLocator);
        String expectedTitle = "Customer Service Portal";
        Assert.assertEquals(expectedTitle, actualTitle);



    }
}
