package patterns;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;


public class WebDriverFactory {
    public static WebDriver createDriver(DriverManagerType type) {

        return   switch (type) {
            case CHROME -> ChromeDriverManager.createDriver();
            case FIREFOX -> FirefoxDriverManager.createDriver();
            default -> throw new IllegalStateException("Unexpected browser");
        };
    }
}
