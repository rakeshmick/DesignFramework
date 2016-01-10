package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import support.BrowserProvider;


/**
 * Created by rakeshprabhakaran on 9/01/2016.
 */
public class LoginTest {
    WebDriver driver;


    @Test
    public void logintoWordPress(){
        driver = BrowserProvider.openBrowser("firefox","https://wordpress.com/me");

        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class );

        loginPage.logintoWordPress("testcodermick","Miclak@12");

        loginPage.logOutWordPress();
    }

    @AfterTest
    public void tearDown(){
        driver.close();

    }
}
