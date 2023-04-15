package Practice;

import Reusable_lib.ReusableMethod_logger;
import Reusable_lib.Reusable_Annotation;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class practice_shazs_code extends Reusable_Annotation {

    @Test(priority = 1)
    public void navigateToStaples() throws InterruptedException {
       logger.log(LogStatus.INFO,"navigate to staples");
       driver.navigate().to("https://www.staples.com");
        ReusableMethod_logger.sendKeysMethod(driver,"//*[@class='search-bar-input__searchBar']","monitors",logger,"monitors");
        Thread.sleep(3000);
        ReusableMethod_logger.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']",logger,"search bar");
        ReusableMethod_logger.clickMethod(driver,"(//*[@class='VisualFilters__filterTitle'])[5]",logger,"27ich monitor");
        Thread.sleep(2000);
        ReusableMethod_logger.scrollByPixels(driver,"scroll(0,2000)");

    }// end of test one

    @Test (dependsOnMethods = "navigateToStaples")
    public void monitors() throws InterruptedException {
        ReusableMethod_logger.clickMethod(driver,"(//*[@class='standard-tile__title '])[6]",logger,"monitor number 7 ");
        Thread.sleep(2000);
        ReusableMethod_logger.clickMethodByIndex(driver,"//*[@class='sc-14dq9fm-0 jmVWgV']",4,logger,"protection plan");
        String result=ReusableMethod_logger.getTextMethod(driver,"//*[text()='Cart subtotal']",logger,"amount");
        String[] message=result.split("items)");
            System.out.println("total amount: " + message[1]);



    }// end of test two













}// end of class
