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

    public final static By errorMessageLocator = By.xpath("//div/div/form/div[1]");



}
