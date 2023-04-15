package Day_11_040123;

import Reusable_lib.Reusable_Method;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T2_GoogleSearchTestNG_priorites {

    // to make variable, you mush declare it outside of the annotation methods
    WebDriver driver;
    //create before suite method to define your chrome drier
    @BeforeSuite
    public void setUpDriver(){
        driver= Reusable_Method.defineChromeDriver();

    }// end of before suits

    //2test is a replacement of the main method to execute your code
    @Test(priority = 1)
    public void searchForBmw() {
        //navigate to google home
        driver.navigate().to("https://www.google.com");
        // enter bmw on search field
        Reusable_Method.sendKeysMethod(driver, "//*[@name='q']", "bmw", "search field");
        //submit of google search
        Reusable_Method.submitMethod(driver, "//*[@name='btnK']", "google search");
    }// end of test 1
        @Test(priority = 2)
         public void captureSearchNumberForBmw(){
      // capture the text and print out the number
        String result = Reusable_Method.getTextMethod(driver,"//*[@id='result-stats']","Search Results");
        String[] arrayResult= result.split(" ");
        System.out.println("search number for BMW:" + arrayResult[1]);
    }// end of test 2
    @Test(dependsOnMethods = {"searchForBmw","captureSearchNumberForBmw"})
    public void clickOnFinance() {
        Reusable_Method.clickMethod(driver," //div[text()='Finance']","Finance");
    }//end of test 3
    //wait the driver
    @AfterSuite
    public void quitSession(){
        driver.quit();
    }// end of test



}

