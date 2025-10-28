package ifellowMobileTestPages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchJavaPage extends BasePage{

    protected AndroidDriver driver;
    protected WebDriverWait wait;

    public SearchJavaPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void searchJava(String pageName){
        driver.findElement(searchGoogle).click();
        wait.until(ExpectedConditions.elementToBeClickable(googleInput)).click();
        WebElement input = driver.findElement(By.className("android.widget.EditText"));
        input.sendKeys(pageName);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        wait.until(ExpectedConditions.presenceOfElementLocated(resultJava));

        List<WebElement> results = driver.findElements(resultJava);
        if (results.isEmpty()) {
            throw new AssertionError("Результаты поиска не содержат текст 'Java'");
        }
        driver.findElement(resultJava).click();
    }
}
