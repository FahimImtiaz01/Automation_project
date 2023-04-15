package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Action_Item3 {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11435");
        zipCode.add("11102");
        zipCode.add("11412");
        // set up the driver through web driver manager
        WebDriverManager.chromedriver().setup();
        // declare the chrome option
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito", "start-fullscreen");
        WebDriver driver = new ChromeDriver(options);
        // declare the for loop
        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to weight watchers.com
            driver.navigate().to("https://www.weightwatchers.com/us");

            Thread.sleep(2000);
            // click find a work shop
            driver.findElement(By.xpath("//*[text()='Find a Workshop']")).click();
            // click on In person
            driver.findElement(By.xpath("//*[text()='In-Person']")).click();
            Thread.sleep(2000);
            WebElement searchBar = driver.findElement(By.xpath("//*[@id='location-search']"));
            searchBar.clear();
            // enter zip code
            searchBar.sendKeys(zipCode.get(i));
            //click on the arrow
            driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
            Thread.sleep(1500);
            // start of creating studio link webElement
            // ArrayList<WebElement>studioLink= new ArrayList<>(driver.findElements(By.xpath("//*[@class='linkContainer-1NkqM']")));
            List<WebElement> studioLink = driver.findElements(By.xpath("//*[@class='linkContainer-1NkqM']"));
            // set the if else conditions
            if (i == 0) {
                studioLink.get(1).click();
            } else if (i == 1) {
                studioLink.get(2).click();
            } else if (i == 2) {
                studioLink.get(0).click();
            }// end of conditions
            Thread.sleep(3000);
             // capture the address
            String addressInfo= driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
           String[] addressMessage=addressInfo.split("In-Person");
            System.out.println("The Address Info is " + addressMessage[0]);

             // scroll studio workshop
            JavascriptExecutor jse= (JavascriptExecutor) driver;
            WebElement upcomingSchedule = driver.findElement(By.xpath("//*[@class='title-bEfSM']"));
            jse.executeScript("arguments[0].scrollIntoView(true)",upcomingSchedule);
            Thread.sleep(3000);

            //capture and print workshop schedule

           String workshopSchedule= driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).getText();
            System.out.println("Upcoming in person workshop schedule is " + workshopSchedule);







        }// end of for loop
        //quit driver
        driver.quit();


    }// end of class
}// end of class
