package tek.bdd.pages;

import org.openqa.selenium.By;

public class ProfilePage {

    public final static By PROFILE_BUTTON = By.xpath("//div[1]/div[1]/div[1]/div[1]/button[1]");

    public final static By USER_STATUS = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[1]/p[2]/span/span");

    public final static By USER_TYPE =By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[2]/p[2]");
    public final static By USER_NAME =By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[3]/p[2]");
    public final static By USER_USERNAME=By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[4]/p[2]");
    public final static By USER_AUTHORITIES=By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[5]/ul/li");
    public final static By LOGOUT_LOCATOR = By.xpath("/html/body/div[3]/div[3]/div/div/footer/div/button[1]");
    public final static By HEADING_LOCATOR = By.xpath("/html/body/div[1]/div/div[2]/div/div/h2[1]");

}
