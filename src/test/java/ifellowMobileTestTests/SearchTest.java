package ifellowMobileTestTests;

import ifellowMobileTestPages.SearchJavaPage;
import ifellowMobileTestTests.Hooks.Hooks;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest extends Hooks {

    @Test
    @DisplayName("Тест поиска")
    public void SearchTest() {
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
        SearchJavaPage searchJavaPage = new SearchJavaPage(driver);
        searchJavaPage.searchJava("java");
        WebElement result = driver.findElement(By.xpath("//*[contains(@text,'Java')]"));
        assertTrue(result.getText().toLowerCase().contains("java"), "Первый результат не содержит текст 'Java'");
    }
}
