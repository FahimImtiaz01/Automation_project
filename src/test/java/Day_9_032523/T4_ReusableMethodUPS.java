package Day_9_032523;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T4_ReusableMethodUPS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= Ex_Reusable_Method.defineChromeDriver();


        //navigate to ups website
        driver.navigate().to("http://www.ups.com/us");

        //declare the explicit wait command
        WebDriverWait wait = new WebDriverWait(driver,20);


        //click on shipping
        //your explicit wait condition replaces your driver.findElement(s)
        //presenceOfAllElementsLocatedBy is same as findElements
        Ex_Reusable_Method.clickMethod(driver,"//*[@id='mainNavDropdown1']","Shipping Link");

        //click on Schedule a Pickup
        //when you see element not interactable exception then you have to use Thread.sleep for few seconds before
        Thread.sleep(2000);
        Ex_Reusable_Method.clickMethod(driver,"//*[text()='Schedule a Pickup']","Schedule a Pickup");


        //click on Freight
        Ex_Reusable_Method.clickMethod(driver,"//*[text()='Freight']","Freight");








        //click on shipping
        //your explicit wait condition replaces your driver.findElement(s)
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='mainNavDropdown1']"))).click();

        //click on Schedule a Pickup
        //when you see element not interactable exception then you have to use Thread.sleep for few seconds before
       // Thread.sleep(2000);
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Schedule a Pickup']"))).click();

        //enter a tracking number on the box
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='tracknumlist']"))).sendKeys("1234455555");



    }//end of main
}// end of class
