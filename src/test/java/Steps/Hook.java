package Steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static Steps.Driver.getDriver;
import static Steps.Driver.quitDriver;


public class Hook {
    @Before
    public void startBrowser() {
        getDriver().get(PropertyReader.getConfigProperty("url"));
    }

    @After
    public void driverTearDown() {
        quitDriver();
    }
}