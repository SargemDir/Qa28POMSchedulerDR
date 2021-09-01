package pagesadvanced;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;

import java.util.List;

public class SwipeableBasicScreen22 extends BaseScreenADV {
    public SwipeableBasicScreen22(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@resource-id ='com.h6ah4i.android.example.advrecyclerview:id/container']")
    List<MobileElement> list;
    @AndroidFindBy(xpath = "//*[@resource-id ='android:id/button1']")
    MobileElement clickOk;

    public SwipeableBasicScreen22 swipeRight() {
        MobileElement element = list.get(3);

        Rectangle rect = element.getRect();
        int xFrom = rect.getX() + rect.getWidth() / 4;
        int yFrom = rect.getY() + rect.getHeight() / 2;
        int xTo = xFrom + rect.getWidth() / 2;
        int yTo = yFrom;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom, yFrom))
                .moveTo(PointOption.point(xTo, yTo))
                .release()
                .perform();
        return this;
    }



    public SwipeableBasicScreen22 swipeLeft() {
        MobileElement element = list.get(4);

        Rectangle rect = element.getRect();
        int xStart = rect.getX() + rect.getWidth() / 4 * 3;
        int yStart = rect.getY() + rect.getHeight() / 2;
        int xEnd = xStart - rect.getWidth() / 2;
        int yEnd = yStart;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xStart, yStart))
                .moveTo(PointOption.point(xEnd, yEnd))
                .release()
                .perform();
        clickOk.click();
        return this;

    }
}
