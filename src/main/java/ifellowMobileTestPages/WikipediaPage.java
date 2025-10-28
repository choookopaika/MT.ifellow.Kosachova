package ifellowMobileTestPages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class WikipediaPage extends BasePage {

    protected AndroidDriver driver;
    protected WebDriverWait wait;

    public WikipediaPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void pressContinue(int times) {
        for (int i = 0; i < times; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
        }

        wait.until(ExpectedConditions.elementToBeClickable(firstDot)).click();
    }

    public void addLanguage(String languageName) {
        wait.until(ExpectedConditions.elementToBeClickable(addingLanguageButton)).click();
        driver.findElement(addLanguage).click();
        driver.findElement(searchLanguage).click();
        driver.findElement(writeLanguage).sendKeys(languageName);

        List<WebElement> results = driver.findElements(By.xpath(
                "//android.widget.TextView[contains(@text,'" + languageName + "')]"
        ));
        if (!results.isEmpty()) {
            results.get(0).click();
        }
    }

    public void deleteLanguage() {
        driver.findElement(moreOptionsButton).click();
        driver.findElement(deleteLanguageTitle).click();
        driver.findElement(languageCheckbox).click();
        driver.findElement(deleteSelectedButton).click();
        driver.findElement(confirmDeleteButton).click();
    }
}
