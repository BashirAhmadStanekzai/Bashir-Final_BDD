package tek.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.ProfilePage;
import tek.bdd.utilities.utilities;

public class ProfileSteps extends utilities {

    @Then("click on profile button")
    public void ClickElement() throws InterruptedException {
       // WebElement Click = getDriver().findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/button[1]"));
       // Click.click();
        buttonClick(ProfilePage.PROFILE_BUTTON);
        Thread.sleep(2000);

    }
    @And("validate {string} is correct")
    public void validate_user_status_is_correct( String expectedStatus) {
        String actualStatus=getElementText(ProfilePage.USER_STATUS);
        Assert.assertEquals("validate user status",expectedStatus,actualStatus);

    }
    @And("validate {string} is ok")
    public void validate_user_Type_is_correct(String expectedType){
        String actualType=getElementText(ProfilePage.USER_TYPE);
        Assert.assertEquals("validate user Type",expectedType,actualType);
    }
    @And("Validate {string} is entered right")
    public void validate_user_Name_is_correct(String expectedName){
        String actualName=getElementText(ProfilePage.USER_NAME);
        Assert.assertEquals("validate user Name",expectedName,actualName);
    }
    @And("validate {string} is fine")
    public void validate_user_Username_is_correct(String expectedUsername) {
        String actualUsername=getElementText(ProfilePage.USER_USERNAME);
        Assert.assertEquals("validate user Username",expectedUsername,actualUsername);
    }
    @And("validate {string} is as expected")
    public void validate_user_Authorities_is_correct(String expectedAuthorities) {
        String actualAuthorities=getElementText(ProfilePage.USER_AUTHORITIES);
        Assert.assertEquals("validate user Authorities",expectedAuthorities,actualAuthorities);

    }

    @Then("user clicks on logout button")
    public void user_clicks_on_logout_button() throws InterruptedException {
        buttonClick(ProfilePage.LOGOUT_LOCATOR);
        Thread.sleep(5000);
    }
    @Then("user is on homepage")
    public void user_is_on_homepage() {
        String actualText = getElementText(ProfilePage.HEADING_LOCATOR);
        String expectedText = "Lets get you started";
        Assert.assertEquals(actualText,expectedText);

    }
}
