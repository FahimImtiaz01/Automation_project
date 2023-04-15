package Day_14_040923;

import Reusable_lib.ReusableMethod_logger;
import Reusable_lib.Reusable_Annotation;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class T2_googleSearch_logger extends Reusable_Annotation {

    @Test(priority = 1)
    public void searchForCricket(){
        //navigate to google home
        logger.log(LogStatus.INFO,"Navigate to Google Home page");
        driver.navigate().to("https://www.google.com");
        //type the word cricket on search field
        ReusableMethod_logger.sendKeysMethod(driver,"//*[@name='q']","cricket",logger,"Search Field");
        //hit submit on google search
        ReusableMethod_logger.submitMethod(driver,"//*[@name='btnK']",logger,"Google Search Button");
    }//end of test 1

    @Test(priority = 2)
    public void printOutSearchNumber(){
        //capture the search result
        String result = ReusableMethod_logger.getTextMethod(driver,"//*[@id='result-stats']",logger,"Search Results");
        logger.log(LogStatus.INFO,"Search Results: " + result);
        String[] arrayResult = result.split(" ");
        System.out.println("Search number for cricket: " + arrayResult[1]);
        logger.log(LogStatus.INFO,"Search number for cricket: " + arrayResult[1]);
    }//end of test 2




}//end of class
