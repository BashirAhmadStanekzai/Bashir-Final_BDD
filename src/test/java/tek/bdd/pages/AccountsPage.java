package tek.bdd.pages;

import org.openqa.selenium.By;
import tek.bdd.utilities.utilities;

public class AccountsPage extends utilities {

    public final static By accountsTableRows = By.xpath("//table/tbody/tr");

    public final static By staticDropdownLocator = By.cssSelector(".chakra-select.css-161pkch");

}
