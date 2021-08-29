package testsscheduler;

import config.ConfigSchedulerAndr8Ver003;
import config.MyDaraProvider;
import dto.AuthdtoLombok;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pagesscheduler.HomeScreen;
import pagesscheduler.LoginScreen;

public class LoginDataProvider extends ConfigSchedulerAndr8Ver003 {

    @Test(dataProvider = "validLoginData", dataProviderClass = MyDaraProvider.class)
    public void LoginWithDto(String email, String password) {
        AuthdtoLombok loglom = AuthdtoLombok.builder().email(email).password(password).build();

        new LoginScreen(driver)
                .loginWithDto(loglom)
                .skipWizard()
                .openMenu();
    }

    @AfterMethod
    public void postcondition(){
        new HomeScreen(driver).logout();
    }
}
