package advancedtests;

import config.ConfigAdvanced;
import org.testng.annotations.Test;
import pagesadvanced.DragScreen1;

public class TestSwipeableBasic extends ConfigAdvanced {

    @Test
    public void swipeRight() {
        new DragScreen1(driver)
                .selectSwipe()
                .selectSwipeableBasic()
                .swipeRight();
    }

    @Test
    public void swipeLeft() {
        new DragScreen1(driver)
                .selectSwipe()
                .selectSwipeableBasic()
                .swipeLeft();
    }
}
