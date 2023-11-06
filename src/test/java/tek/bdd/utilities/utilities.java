package tek.bdd.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;
import tek.bdd.pages.PlansPage;

import java.time.Duration;
import java.util.List;

import static java.lang.Character.getName;

public class utilities extends BaseSetup {

    private WebDriverWait getWait() {

        return new WebDriverWait(getDriver(), Duration.ofMinutes(1));
    }
    public boolean isElementDisplayed(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.isDisplayed();

    }

    private WebElement waitUntilElementClickable(By locator){
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void buttonClick(By locator) {
        waitUntilElementClickable(locator).click();

    }

    public void sendText (By locator, String text) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
    public String getElementText(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.getText();
    }


    public void webElement_list_check(By locator, String expectedValue){
        List<WebElement> elements_list = getListOfElements(locator);
        String assertionMessage =  "Validating " + expectedValue + ":";
        for (WebElement element: elements_list){
            String actualValue = element.getText();
            if (expectedValue.contains(actualValue)){
                Assert.assertEquals(assertionMessage, expectedValue, actualValue);
                System.out.println("expected title: " + expectedValue);
                System.out.println("actual title: " + actualValue);
            }
        }
    }



    public void selectFromDropDown(By locator, String option) {
        WebElement dropdownElement = waitUntilVisibilityOfElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(option);
    }
    public int getTableRows (By locator) {
        return getDriver().findElements(locator).size();
    }

    public List<WebElement> getListOfElements(By locator) {

        return waitUntilVisibilityOfAllElement(locator);
    }
    private List<WebElement> waitUntilVisibilityOfAllElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
    private WebElement waitUntilVisibilityOfElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
}
