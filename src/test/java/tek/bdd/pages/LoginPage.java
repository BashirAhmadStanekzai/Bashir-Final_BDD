package tek.bdd.pages;

import org.openqa.selenium.By;

public class LoginPage {

    public final static By loginButtonLocator = By.xpath("//div[1]/div/a[2]");
    public final static By userNameLocator = By.id("username");
    public final static By passwordLocator = By.name("password");
    public final static By titleLocator = By.xpath("//h2[contains(text(),'Customer Service Portal')]");
    public final static By signInButton = By.xpath("//form/div/div[3]/button[1]");
    public final static By errorBanner = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div");
}
