package Day_12_040223;

import Reusable_lib.Reusable_Annotation;
import Reusable_lib.Reusable_Method;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class T1_Reusable_Annotation_yahoo extends Reusable_Annotation {
    @Test(priority = 1)
    public void searchForIphone(){
        ArrayList<String> phones = new ArrayList<>();
        phones.add("iphone");
        phones.add("samsung");
        for(int i=0; i<phones.size(); i++) {
            driver.navigate().to("https://www.yahoo.com");
            //enter iphone on search field
            Reusable_Method.sendKeysMethod(driver, "//*[@name='p']", phones.get(i), "Search Field");
            //click on search icon
            Reusable_Method.clickMethod(driver, "//*[@id='ybar-search']", "Search Icon");
            String result = Reusable_Method.getTextMethod(driver,"//span[@class=' fz-14 lh-22']","Search Results");
            String[] arrayResult = result.split(" ");
            System.out.println("Search Number for " + phones.get(i) + " is " + arrayResult[1]);
        }//end of loop
    }//end of test 1

    @Test(priority = 2)
    public void captureResultOnAboutPage(){
        //scroll to the bottom
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,4000)");
        Reusable_Method.clickMethod(driver,"//*[text()='About this page']","About This page Link");
        String result = Reusable_Method.getTextMethod(driver,"//h1[contains(text(),'Filter and refine ')]","Results");
        System.out.println("Result: " + result);
    }//end of test 2


}// end of class
