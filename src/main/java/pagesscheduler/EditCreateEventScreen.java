package pagesscheduler;

import dto.EventCreateModel;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EditCreateEventScreen extends BaseScreen {
    public EditCreateEventScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_title_input']")
    MobileElement title;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_type_input']")
    MobileElement type;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_break_plus_btn']")
    MobileElement breakPlusButton;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_break_minus_btn']")
    MobileElement breakMinusButton;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_wage_edit']")
    MobileElement wageEdit;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_wage_input']")
    MobileElement wageInput;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_wage_save']")
    MobileElement wageSave;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_save_btn']")
   MobileElement saveEventBtn;

    public EditCreateEventScreen fillCretionEditForm(EventCreateModel evcrm){
        type(title, evcrm.getTitelEC());
        type(type, evcrm.getTypeEC());
        hideKeyboard();
        if (evcrm.getBreakEC()>0){
            for (int i = 0; i < evcrm.getBreakEC(); i++){
                breakPlusButton.click();
            }
        }
        wageEdit.click();
        type(wageInput,String.valueOf(evcrm.getWageEC()));
        wageSave.click();
        return this;
    }

    public HomeScreen confirmCreationEvent(){
        saveEventBtn.click();
        return new HomeScreen(driver);
    }
}
