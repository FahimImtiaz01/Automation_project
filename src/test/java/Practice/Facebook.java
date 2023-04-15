package Practice;

import Reusable_lib.Reusable_Method;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Reusable_Method.defineChromeDriver();
        // navigate to facebook
        driver.navigate().to("https:/Facebook.com");

        Thread.sleep(3000);

        // click on create new account(sign up)
        Reusable_Method.clickMethod(driver, "//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']", "create new account");

        Reusable_Method.sendKeysMethod(driver, "//*[@name='firstname']", "John", "First name");

        Reusable_Method.sendKeysMethod(driver, "//*[@name='lastname']", "cena", "surname");
        Thread.sleep(3000);
        Reusable_Method.sendKeysMethod(driver, "//*[@name='reg_email__']", "John.cena420@gmail.com", "Email");

        Reusable_Method.sendKeysMethod(driver, "//*[@name='reg_email_confirmation__']", "John.cena420@gmail.com", "Re-enter Email");

        Reusable_Method.sendKeysMethod(driver, "//*[@name='reg_passwd__']", "123john", "password");
        Thread.sleep(3000);
        Reusable_Method.clickMethod(driver, "//*[@value='4']", "day");

        Reusable_Method.clickMethod(driver, "//*[text()='Jun']", "month");

        Reusable_Method.clickMethod(driver, "//*[@value='1999']", "year");
        Thread.sleep(3000);
        Reusable_Method.clickMethod(driver, "//*[text()='Male']", "gender");
        Thread.sleep(2000);
        driver.quit();
    }// end of main
}// end of class
