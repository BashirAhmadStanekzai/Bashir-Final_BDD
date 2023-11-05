package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tek.bdd.utilities.utilities;

public class Hooks extends utilities {

    @Before
    public void setUpTests()
    {

        openBrowser();
    }

    @After
    public void tearDown(){

        driverQuit();
    }
}
