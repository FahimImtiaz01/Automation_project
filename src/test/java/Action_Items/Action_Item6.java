package Action_Items;

import Reusable_lib.Reusable_Method;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Action_Item6 {

    WebDriver driver;
    // define chrome driver
    @BeforeSuite
    public void setUpDriver(){

        driver= Reusable_Method.defineChromeDriver();
    }// end of before suits

    @Test(priority = 1)
    public void fideliscare() throws InterruptedException {

        //navigate to fideliscare
        driver.navigate().to("https://www.fideliscare.org");
        // click on search
        Reusable_Method.clickMethodByIndex(driver,"//*[@class='dropdown-toggle']",1,"search bar");
        Thread.sleep(3000);
        // enter get dental coverage on search bar
        Reusable_Method.sendKeysMethodByIndex(driver,"//*[@class='form-control search-input']","get dental coverage",0,"searchValue");
        // click on search
        Reusable_Method.clickMethod(driver,"//*[@class='btn btn-primary btn-search']","search icon");
        // capture the search result
       String searchResult= Reusable_Method.getTextMethod(driver,"//*[@class='gsc-result-info']","search result");
       String[] result= searchResult.split(" ");
        System.out.println("the search number is: " + result[1]);
        // click on first link
        Reusable_Method.clickMethodByIndex(driver,"//*[text()='Get Dental Coverage']",0,"get dental coverage");
    } // end of test one

    @Test ( dependsOnMethods = "fideliscare")
    public void getDentalCoverage() throws InterruptedException {
        Reusable_Method.switchToTabByIndex(driver,1);
        // enter on first name
        Reusable_Method.sendKeysMethod(driver,"//*[@id='firstName']","Fahim","name field");
        // enter last name
        Reusable_Method.sendKeysMethod(driver,"//*[@id='lastName']","Imtiaz","Last name field");
        // enter zipcode
        Reusable_Method.sendKeysMethod(driver,"//*[@id='zipCode']","11435","zipcode field");
        // enter phone number
        Reusable_Method.sendKeysMethod(driver,"//*[@id='phoneNumber']","3456713541","phone number field");
        // enter email
        Reusable_Method.sendKeysMethod(driver,"//*[@id='email']","imtiaz.fahim54@gmail.com","email field");
        Thread.sleep(3000);
        // click on box
        Reusable_Method.clickMethodByIndex(driver,"//*[@for='contactMe']",1,"checkbox");
        Thread.sleep(3000);
        //click on contact me
        Reusable_Method.clickMethodByIndex(driver,"//*[text()='Contact Me']",2,"contact me");
        //capture the text
       String submitMessage= Reusable_Method.getTextMethod(driver,"//*[@class='alert alert-success']","submitText");
        // print out the message
        System.out.println("The message is " + submitMessage);
        //close the tab
        driver.close();
    }// end of test 2

    @Test (dependsOnMethods ="getDentalCoverage")
    public void login (){
        // switch back to default page
        Reusable_Method.switchToTabByIndex(driver,0);
        // click on lig in
        Reusable_Method.clickMethodByIndex(driver,"//*[@class='tool dropdown login']",0,"login");
        // click on members online portal
        Reusable_Method.clickMethodByIndex(driver,"//*[@target='_blank']",0,"member online portal");
        //switch to new tab
        Reusable_Method.switchToTabByIndex(driver,1);
        //capture / print Help full hints
        String result =Reusable_Method.getTextMethod(driver,"//*[@class='tipsContentText']","help-full hints");
        System.out.println("the hint is " + result);
        // close the tab
        driver.close();







    }//end of log in







}// end of class

