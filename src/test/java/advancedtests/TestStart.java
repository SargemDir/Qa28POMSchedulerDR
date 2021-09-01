package advancedtests;

import config.ConfigAdvanced;
import org.testng.annotations.Test;
import pagesadvanced.DragScreen1;

public class TestStart extends ConfigAdvanced {

    @Test
    public void dragDownTest(){
        new DragScreen1(driver)
                .selectDraggableBasic()
                .dragDown();
    }

    @Test
    public void dragDownCountTest(){
        new DragScreen1(driver)
                .selectDraggableBasic()
                .dragDown(4);
    }

    @Test
    public void dragDownWindowTest(){
        new DragScreen1(driver)
                .selectDraggableBasic()
                .dragDownWindow();
    }
}
