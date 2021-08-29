package testsscheduler;

import config.ConfigSchedulerAndr8Ver003;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesscheduler.SplashScreen;

public class LaunchAppTest extends ConfigSchedulerAndr8Ver003 {

    @Test
    public void launchtest(){

        String version = new SplashScreen(driver).getCurrentVersion();
        Assert.assertEquals(version,"0.0.3");
    }

}