package Practice;

import Reusable_lib.Reusable_Method;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adidas {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = Reusable_Method.defineChromeDriver();

        driver.navigate().to("https:/adidas.com");

        Thread.sleep(3000);

    Reusable_Method.sendKeysMethod(driver,"//*[@class='_input_1f3oz_13']","running shoes","search field");

    Reusable_Method.submitMethod(driver,"//*[@class='gl-icon__wrapper']","Search icon");

    Reusable_Method.clickMethodByIndex(driver,"//*[text()='running shoes']",0,"running shoes");

    Reusable_Method.clickMethodByIndex(driver,"//*[@class='glass-product-card__assets-link']",0,"ultraBoost");

    Reusable_Method.clickMethodByIndex(driver,"//*[@class='variation___u2aRL']",2,"colorBlack");

    Reusable_Method.clickMethod(driver,"//*[text()='10']","size10");
        Thread.sleep(2000);

    Reusable_Method.clickMethod(driver,"//*[@class='gl-cta gl-cta--primary gl-cta--full-width']","add to bag");

    }// end of main
}//end of class
