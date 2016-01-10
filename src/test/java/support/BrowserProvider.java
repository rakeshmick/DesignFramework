package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by rakeshprabhakaran on 9/01/2016.
 */
public  class BrowserProvider {

    static WebDriver driver;

    public static WebDriver openBrowser(String browserType,String url){

        switch (browserType){
            case "firefox" : driver = new FirefoxDriver();
                        driver.get(url);
                        break;

            case "chrome" : driver = new ChromeDriver();
                driver.get(url);
                    break;
            case "ie" : driver= new InternetExplorerDriver();
                driver.get(url);
                break;
            default: driver = new FirefoxDriver();

        }

        return driver;
    }
}
