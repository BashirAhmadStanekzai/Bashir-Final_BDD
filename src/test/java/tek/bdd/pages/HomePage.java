package tek.bdd.pages;

import org.openqa.selenium.By;

public class HomePage {

    public final static By primaryAccountButton = By.xpath("/html/body/div[1]/div/div[2]/div/div/a");
    public final static By emailLocator = By.name("email");
    public final static By fNameLocator = By.id("firstName");
    public final static By titleLocator = By.id("title");
    public final static By genderLocator = By.name("gender");
    public final static By lNameLocator = By.id("lastName");
    public final static By martialStatusLocator = By.id("maritalStatus");
    public final static By employmentStatusLocator = By.name("employmentStatus");
    public final static By dateOfBirthLocator = By.name("dateOfBirth");

    public final static By createAccountButton = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[2]/button[1]");

    public final static By enteredEmail = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2[3]");


    public static By CREATE_PRIMARY_ACCOUNT_HOLDER = new By.ByXPath("//body//div/div[2]/div/div/div/h2");
    public static By EMAIL_PATH = new By.ById("email");
    public static By FIRST_NAME_PATH = new By.ById("firstName");
    public static By LAST_NAME_PATH = new By.ById("lastName");
    public static By EMPLOYMENT_STATUS = new By.ById("employmentStatus");
    public static By CREATE_ACCOUNT_BUTTON = new By.ByCssSelector(".css-jut409");
    public static By TITLE_PATH = new By.ByName("title");
    public static By GENDER_PATH = new By.ById("gender");
    public static By MARITAL_STATUS_PATH = new By.ById("maritalStatus");
    public static By DATE_OF_BIRTH = new By.ById("dateOfBirth");
    public static By SIGN_UP_ACCOUNT_EMAIL_TITLE = new By.ByXPath("//*[@id='root']/div/div[2]/div/div/div/h2");
    public static By EMAIL_VERIFICATION_PATH = new By.ByXPath("//*[@id='root']/div/div[2]/div/div/div/h2[3]");
    public static By BANNER_ERROR_PATH = new By.ByCssSelector(".css-1ykemat");

}
