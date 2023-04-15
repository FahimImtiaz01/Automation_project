package Action_Items;

import Reusable_lib.ReusableMethod_logger;
import Reusable_lib.Reusable_Annotation;
import Reusable_lib.Reusable_Method;
import org.testng.annotations.Test;

public class Action_item7 extends Reusable_Annotation {

    @Test(priority = 1)
    public void bestBuy () throws InterruptedException {
        driver.navigate().to("https://www.bestbuy.com");
        //enter beats headphones on the search bar
        Reusable_Method.sendKeysMethod(driver,"//*[@id='gh-search-input']","beats headphones","search");
        //click on search icon
        Reusable_Method.clickMethod(driver,"//*[@class='header-search-icon']","search icon");
        Thread.sleep(2000);
        // click on the 3rd headphone
        Reusable_Method.clickMethodByIndex(driver,"//*[@class='product-image ']",2,"headphone");
        Thread.sleep(3000);
        // change the color of the headphone
        Reusable_Method.clickMethodByIndex(driver,"//*[@class='variation-carousel-tile has-image-swatch wrap-text']",2,"headphone color");
        // click on add to cart
        Reusable_Method.clickMethod(driver,"//*[@class='fulfillment-add-to-cart-button']","add to cart");
        // click on Continue shopping
    }//end of test one
    @Test(priority = 2)
    public void macbook () throws InterruptedException {

        driver.navigate().to("https://www.bestbuy.com");

        // enter macbook in search bar
        Reusable_Method.sendKeysMethod(driver,"//*[@id='gh-search-input']","macbook","search");
        // click on search icon
        Reusable_Method.clickMethod(driver,"//*[@class='header-search-icon']","search icon");
        Thread.sleep(2000);
        // click on the second link
        Reusable_Method.clickMethodByIndex(driver,"//*[@class='product-image ']",1, "mac book 13 ");
        // capture the price
        String macPrice= Reusable_Method.getTextMethod(driver,"//*[text()='$1,199.00']","price");
        System.out.println("The price is: " + macPrice);
        // add to cart
        Reusable_Method.clickMethod(driver,"//*[@class='fulfillment-add-to-cart-button']","add to cart");
    }// end of class test 2

    @Test(priority = 3)
    public void help() throws InterruptedException {
        // scroll down on page
        Reusable_Method.scrollByPixels(driver,"scroll(0,700)");
        Thread.sleep(2000);
        //click on visit our support center
        Reusable_Method.clickMethodByIndex(driver,"//*[@class='h-full flex flex-column text-center']",0,"help");
        // click on store pick up
        Reusable_Method.clickMethod(driver,"//*[text()='Store pickup']"," store pick up ");
        // print out how it works
        String result = Reusable_Method.getTextMethod(driver,"//*[@class='widget-text-block__paragraph']","what to bring");
        System.out.println("make sure to: " + result);
    }// end of test 3
    @Test(priority = 4)
    public void giftCards() throws InterruptedException {
        driver.navigate().to("https://www.bestbuy.com");

        //click on gift card
        Reusable_Method.clickMethod(driver,"//*[text()='Gift Cards']","gift card");
        Thread.sleep(2000);
        // click on Specialty gift cards
        Reusable_Method.clickMethod(driver,"//*[text()='Specialty Gift Cards']","specialty gift cards");
        // click on gaming gift card
        Reusable_Method.clickMethod(driver,"//*[text()='Gaming gift cards']","gaming gift cards");
        // pick the first xbox game pass
        Reusable_Method.clickMethod(driver,"//*[text()='Microsoft - Xbox Game Pass for Console - 6 Month Digital Code [Digital]']","game pass");
        // add to cart
        Reusable_Method.clickMethod(driver,"//*[@class='fulfillment-add-to-cart-button']","add to cart");
    }//end of test 4

    @Test(priority = 5)
    public void checkOut (){
        // click on cart
        Reusable_Method.clickMethod(driver,"//*[text()='Cart']","cart");

        // click on checkout
        Reusable_Method.clickMethod(driver,"//*[@class='btn btn-lg btn-block btn-primary']","checkout");

    }// end of test 5














}// end of class
