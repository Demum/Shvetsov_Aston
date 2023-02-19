package patterns;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import utils.JsonReaderUtils;


public class DriverSingleton {

    private static WebDriver driver;

    private DriverSingleton() {
    }

    public static WebDriver getDriver() {

        if (driver == null) {
            driver = WebDriverFactory.createDriver(DriverManagerType.valueOf(JsonReaderUtils.getValueByKey("browser_name").toUpperCase()));
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}