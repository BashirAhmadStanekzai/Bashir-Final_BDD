package tek.bdd.pages;

import org.openqa.selenium.By;
import tek.bdd.utilities.utilities;

public class CommonPage extends utilities {

    public static By getLinkLocator(String linkText) {
        return By.partialLinkText(linkText);
    }


}
