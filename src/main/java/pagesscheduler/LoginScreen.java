package pagesscheduler;

import dto.AuthTest;
import dto.AuthdtoLombok;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen extends BaseScreen {
    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/log_email_input']")
    MobileElement emailEditText;
    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/log_password_input']")
    MobileElement passwordEditText;
    @AndroidFindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/login_btn']")
    MobileElement loginButton;
    @AndroidFindBy(xpath = "//*[@resource-id ='android:id/message']")
    MobileElement errorMes;

    public LoginScreen fillEmail(String email){
        type(emailEditText,email);
        return this;
    }

    public LoginScreen fillPassword(String password){
        type(passwordEditText,password);
        return this;
    }

    public WizardScreen clickLoginButton(){
        hideKeyboard();
        loginButton.click();
        return new WizardScreen(driver);
    }

    public LoginScreen fillLoginFormWithDto(AuthTest auth){
        type(emailEditText, auth.getEmail());
        type(passwordEditText, auth.getPassword());
        return this;
    }

    public WizardScreen loginWithDto(AuthdtoLombok loglom){
        type(emailEditText,loglom.getEmail());
        type(passwordEditText,loglom.getPassword());
        hideKeyboard();
        loginButton.click();
        return new WizardScreen(driver);
    }


    public LoginScreen errorLogin(){
        hideKeyboard();
        loginButton.click();
        return this;
    }

    public String errorMessage(){
        //should(errorMes,10);
        return errorMes.getText();
    }

}
