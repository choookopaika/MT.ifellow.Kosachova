package ifellowMobileTestPages;

import org.openqa.selenium.By;

public class BasePage {
    //Википедия
    //скролл страниц
    public final By continueButton = By.id("org.wikipedia:id/fragment_onboarding_forward_button");

    //добавление языка
    public final By addingLanguageButton = By.id("org.wikipedia:id/addLanguageButton");
    public final By addLanguage = By.className("android.widget.ImageView");
    public final By searchLanguage = By.id("org.wikipedia:id/menu_search_language");
    public final By writeLanguage = By.id("org.wikipedia:id/search_src_text");

    //перелистывание на 1 стр
    public final By firstDot = By.xpath("//android.widget.HorizontalScrollView[@content-desc=\"Page 4 of 4\"]" + "/android.widget.LinearLayout/android.widget.LinearLayout[1]");

    //удаление добавленного языка
    public final By moreOptionsButton = By.xpath("//android.widget.ImageView[@content-desc='More options']");
    public final By deleteLanguageTitle = By.id("org.wikipedia:id/title");
    public final By languageCheckbox = By.xpath("(//android.widget.CheckBox[@resource-id='org.wikipedia:id/wiki_language_checkbox'])[2]");
    public final By deleteSelectedButton = By.id("org.wikipedia:id/menu_delete_selected");
    public final By confirmDeleteButton = By.id("android:id/button1");

    //поиск страницы
    public final By searchGoogle = By.id("com.google.android.apps.nexuslauncher:id/overview_actions_view");
    public final By googleInput = By.xpath("//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.RelativeLayout");
    public final By resultJava = By.xpath("(//android.widget.TextView[@text=\"Java\"])[2]");
}
