package testsscheduler;

import config.ConfigSchedulerAndr8Ver003;
import dto.AuthTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesscheduler.SplashScreen;

public class LoginTest extends ConfigSchedulerAndr8Ver003 {

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

    @Test
    public void negativeTestLoginWithInvalidPassword() {
        AuthTest dataEP = new AuthTest().withEmail("scheduler@gmail.com").withPassword("Scheduler");

       String errorMessage = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillLoginFormWithDto(dataEP)
                .errorLogin()
                .errorMessage();
       Assert.assertEquals(errorMessage, "Wrong email or password");


    }
}
