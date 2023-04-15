package Day_10_032623;

import Day_9_032523.Ex_Reusable_Method;
import org.openqa.selenium.WebDriver;

public class Staples_Reusable_M {
    public static void main(String[] args) throws InterruptedException {

        //set up the chrome driver
        WebDriver driver = Ex_Reusable_Method.defineChromeDriver();

        //navigate to staples home page
        driver.navigate().to("https://www.staples.com");

        //type on search field using sendkeys method
        Ex_Reusable_Method.sendKeysMethod(driver,"//*[@id='searchInput']","iphone","Search Field");

        //click on the search icon
        Ex_Reusable_Method.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']","Search Icon");

        //click on first image by index
        Ex_Reusable_Method.clickMethodByIndex(driver,"//*[@class='standard-tile__image standard-tile__image_hover']",0,"Iphone Image");

        //click on add to the cart button
        Ex_Reusable_Method.clickMethod(driver,"//*[@id='ctaButton']","Add to cart");

        //capture the starting price and print it out
        Thread.sleep(3000);
        String result = Ex_Reusable_Method.captureTextMethod(driver,"//*[contains(text(),'starting at')]","Starting Price");

        System.out.println("My result is " + result);




    }// end of main

}// end of class
