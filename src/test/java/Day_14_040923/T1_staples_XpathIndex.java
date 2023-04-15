package Day_14_040923;

import Reusable_lib.ReusableMethod_logger;
import Reusable_lib.Reusable_Annotation;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class T1_staples_XpathIndex extends Reusable_Annotation {


    @Test(priority = 1)
    public void ClickOnThirdIphonByXpathIndex() throws InterruptedException {
        logger.log(LogStatus.INFO,"Navigate to Staples home page");
        //navigate to staples home page
        driver.navigate().to("https://www.staples.com");

        //type on search field using sendkeys method
        ReusableMethod_logger.sendKeysMethod(driver,"//*[@id='searchInput']","iphone",logger,"Search Field");

        //click on the search icon
        ReusableMethod_logger.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']",logger,"Search Icon");

        //click on third image by xpath index
        Thread.sleep(4000);
        ReusableMethod_logger.clickMethod(driver,"(//*[@class='standard-tile__image standard-tile__image_hover'])[3]",logger,"Iphone Image");

        Thread.sleep(2000);

    }//end of test 1






}//end of calls
