package pagesadvanced;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DragScreen1 extends BaseScreenADV{
    public DragScreen1(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@resource-id ='com.h6ah4i.android.example.advrecyclerview:id/button'][2]")
    MobileElement selectDraggableBasic;
    @AndroidFindBy (xpath = "//*[@content-desc ='Swipe']")
    MobileElement swipe;

    public DraggableBasicScreen12 selectDraggableBasic(){
        selectDraggableBasic.click();
        return new DraggableBasicScreen12(driver);
    }

    public SwipeScreen2 selectSwipe(){
        swipe.click();
        return new SwipeScreen2(driver);
    }
}
