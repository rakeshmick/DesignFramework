package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by rakeshprabhakaran on 9/01/2016.
 */
public class LoginPage {


    WebDriver driver;

 /*   @FindBy('')
    WebElement ;*/
    @FindBy(css = "#user_login")
    WebElement usernameField;

    @FindBy(css = "#user_pass")
    WebElement passwordField;

    @FindBy(css = "#rememberme")
    WebElement rememberMeCheckBox;

    @FindBy(css = "#wp-submit")
    WebElement submitButton;

    @FindBy(css=".me-sidebar__menu__signout.form-button.button")
    WebElement signOut;

    public LoginPage(WebDriver driver) {
        this.driver= driver;
    }

    public void logintoWordPress(String username, String password){

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        rememberMeCheckBox.click();
        submitButton.click();
    }
    public void logOutWordPress(){
        signOut.click();
    }





}



