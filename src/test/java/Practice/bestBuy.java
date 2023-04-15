package Practice;

import Reusable_lib.Reusable_Method;
import org.openqa.selenium.WebDriver;

public class bestBuy {
    public static void main(String[] args) {

        //define the webDriver
        WebDriver driver = Reusable_Method.defineChromeDriver();
        // go to bestBuy
        driver.navigate().to("https://www.bestbuy.com/");

        Reusable_Method.sendKeysMethod(driver,"//*[@class='search-input']","iphone","search iphone");

        Reusable_Method.submitMethod(driver,"//*[@class='header-search-icon']","search");








    }// end of main

}// end of class
