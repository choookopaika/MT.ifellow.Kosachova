package ifellowMobileTestTests;

import ifellowMobileTestPages.WikipediaPage;
import ifellowMobileTestTests.Hooks.Hooks;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WikipediaTest extends Hooks {

    @Test
    @DisplayName("Тест Википедии")
    public void wikipediaTest() {
        WikipediaPage wikipediaPage = new WikipediaPage(driver);
        wikipediaPage.pressContinue(3);
        wikipediaPage.addLanguage("Русский");
        wikipediaPage.deleteLanguage();
    }
}
