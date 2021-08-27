package pagesscheduler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class WizardScreen extends BaseScreen {
    public WizardScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@recource-id = 'com.example.svetlana.scheduler:id/wizard_settings_skip_container']")
    MobileElement skipButton;

    public HomeScreen skipWizard() {
        try {
            skipButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HomeScreen(driver);
    }


}
