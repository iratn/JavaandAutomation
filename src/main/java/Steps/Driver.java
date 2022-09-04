package Steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver = null;
    public static WebDriver getDriver() {
        if (driver == null) {
            startDriver();
        }
        return driver;
    }
    private static void startDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        EventFiringWebDriver driverWithEvents = new EventFiringWebDriver(driver);
        driverWithEvents.register(new EventListener());
        driver = driverWithEvents;
    }

    public static void quitDriver() {
        getDriver().quit();
        driver = null;
    }
}
