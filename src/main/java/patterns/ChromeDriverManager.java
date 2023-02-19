package patterns;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.JsonReaderUtils;


public class ChromeDriverManager {
    private static final ChromeOptions chromeOptions = new ChromeOptions();

    public static WebDriver createDriver() {

        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        setBrowserOptions();
        return new ChromeDriver(chromeOptions);
    }

    private static void setBrowserOptions() {

        if (Boolean.parseBoolean(JsonReaderUtils.getValueByKey("incognito_mode"))) {
            chromeOptions.addArguments("--incognito");
        }
        if (Boolean.parseBoolean(JsonReaderUtils.getValueByKey("full_screen"))) {
            chromeOptions.addArguments("--start-maximized");
        }
    }
}