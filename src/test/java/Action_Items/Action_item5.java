package Action_Items;

import Reusable_lib.Reusable_Method;
import org.openqa.selenium.WebDriver;

public class Action_item5 {
    public static void main(String[] args) throws InterruptedException {
        // set up the chrome driver
        WebDriver driver = Reusable_Method.defineChromeDriver();
        // navigate to bestbuy.com
        driver.navigate().to("https://www.bestbuy.com");
        Thread.sleep(3000);
        // search iphone on the search field
        Reusable_Method.sendKeysMethod(driver,"//*[@class='search-input']","iphone","search field");
        //click on search icon
        Reusable_Method.clickMethod(driver,"//*[@class='header-search-icon']","search icon");
        // select the Best Selling option on dropdown
        Reusable_Method.selectByText(driver,"//*[@class='tb-select']","Best Selling","dropdown bar");
        Thread.sleep(2000);
        // click on the first iphone image by index
        Reusable_Method.clickMethodByIndex(driver,"//*[@class='sku-title']",0,"iphone name");
        // scroll down to learn about total tach by using scrollByElement
        Reusable_Method.scrollByElement(driver,"//*[text()='Learn About Totaltech']","totalTech");
        Thread.sleep(2000);
        // click on add to court
        Reusable_Method.clickMethod(driver,"//*[@class='fulfillment-add-to-cart-button']","cart");
        // get the cart subtotal
        String cartTotal = Reusable_Method.getTextMethod(driver,"//*[@class='d-flex']","subtotal");
        String [] cartMessage = cartTotal.split(" ");

        System.out.println("The amount of the " + cartMessage[3]);
        //hover over continue shopping
        Reusable_Method.mouseHover(driver,"//*[@class='c-button-link continue-shopping']","continueShopping");

        Reusable_Method.clickMethod(driver,"//*[@class='c-button-link continue-shopping']","continueShopping");



    }// end of main
}// end of class
