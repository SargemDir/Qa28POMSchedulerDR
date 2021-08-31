package testsscheduler;

import config.ConfigSchedulerAndr8Ver003;
import dto.AuthdtoLombok;
import dto.EventCreateModel;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pagesscheduler.HomeScreen;
import pagesscheduler.SplashScreen;

public class EventCreateTest extends ConfigSchedulerAndr8Ver003 {
    @Test
    public void eventCreationTest(){
        AuthdtoLombok loglom = AuthdtoLombok.builder().email("scheduler@gmail.com").password("Scheduler0.0.3").build();
        EventCreateModel ev = new EventCreateModel().withTitelEC("Event").withTypeEC("DV").withBreakEC(3).withWageEC(30);

       boolean isEventCreated =  new SplashScreen(driver)
                .checkVersion("0.0.3")
                .loginWithDto(loglom)
                . skipWizard()
                .initCreationEvent()
                .fillCretionEditForm(ev)
                .confirmCreationEvent()
                .isFabAddPresent();
        Assert.assertTrue(isEventCreated);
    }

    @AfterTest
    public void postCondition(){
        new HomeScreen(driver)
                .openMenu()
                .logout();
    }
}
