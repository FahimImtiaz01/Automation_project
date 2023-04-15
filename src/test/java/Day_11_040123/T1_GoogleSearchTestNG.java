package Day_11_040123;

import Reusable_lib.Reusable_Method;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T1_GoogleSearchTestNG {
    // to make variable, you mush declare it outside of the annotation methods
    WebDriver driver;
    //create before suite method to define your chrome drier
    @BeforeSuite
    public void setUpDriver(){
        driver= Reusable_Method.defineChromeDriver();

    }// end of before suits

    //2test is a replacement of the main method to execute your code
    @Test
    public void GoogleSearchNumber(){
        //navigate to google home
        driver.navigate().to("https://www.google.com");
        // enter bmw on search field
        Reusable_Method.sendKeysMethod(driver,"//*[@name='q']","bmw","search field");
        //submit of google search
        Reusable_Method.submitMethod(driver,"//*[@name='btnK']","google search");
        // capture the text and print out the number
        String result = Reusable_Method.getTextMethod(driver,"//*[@id='result-stats']","Search Results");
        String[] arrayResult= result.split(" ");
        System.out.println("search number for BMW:" + arrayResult[1]);
    }// end of test

    //wuit the driver
    @AfterSuite
    public void quitSession(){
        driver.quit();
    }// end of test




}//end of class
