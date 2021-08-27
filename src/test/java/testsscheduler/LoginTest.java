package testsscheduler;

import config.ConfigScheduler;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesscheduler.SplashScreen;

public class LoginTest extends ConfigScheduler {

    @Test
    public void loginTest() {
        boolean isFabButtonPresent = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillEmail("scheduler@gmail.com")
                .fillPassword("Scheduler0.0.3")
                .clickLoginButton()
                .skipWizard()
                .isFabAddPresent();
        Assert.assertTrue(isFabButtonPresent);
    }
}
