package pagesadvanced;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SwipeScreen2 extends BaseScreenADV{
    public SwipeScreen2(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@resource-id ='com.h6ah4i.android.example.advrecyclerview:id/button'][2]")
    MobileElement selectSwipableBasic;

    public SwipeableBasicScreen22 selectSwipeableBasic(){
        selectSwipableBasic.click();
        return new SwipeableBasicScreen22(driver);
    }

}
