package patterns;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.JsonReaderUtils;

public class FirefoxDriverManager {
    private static final FirefoxOptions firefoxOptions = new FirefoxOptions();

    public static WebDriver createDriver() {
        WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        setBrowserOptions();
        return new FirefoxDriver(firefoxOptions);
    }

    private static void setBrowserOptions() {

        if (Boolean.parseBoolean(JsonReaderUtils.getValueByKey("incognito_mode"))) {
            firefoxOptions.addArguments("-private");
        }
        if (Boolean.parseBoolean(JsonReaderUtils.getValueByKey("full_screen"))) {
            firefoxOptions.addArguments("--window-size=1280,1024");
        }
    }
}

