package ifellowMobileTestTests.Hooks;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import units.configPropertiesReader;

import java.net.URL;
import java.time.Duration;

public class Hooks {

    protected AndroidDriver driver;

    @BeforeEach
    public void BeforeTest() {
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();

        uiAutomator2Options.setCapability("platformName", "Android");
        uiAutomator2Options.setCapability("deviceName", "Pixel5");
        uiAutomator2Options.setCapability("platformVersion", "16.0");
        uiAutomator2Options.setCapability("automationName", "UiAutomator2");
        uiAutomator2Options.setCapability("appPackage", "org.wikipedia");
        uiAutomator2Options.setCapability("appActivity", ".main.MainActivity");

        String appiumUrl = configPropertiesReader.get("appium.url");

        try {
            driver = new AndroidDriver(new URL(appiumUrl), uiAutomator2Options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        } catch (Exception e) {
            throw new RuntimeException("Ошибка подключения к Appium: " + appiumUrl, e);
        }
    }

    @AfterEach
    public void AfterTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}
