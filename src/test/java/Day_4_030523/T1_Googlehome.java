package Day_4_030523;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Googlehome {
    public static void main(String[] args) throws InterruptedException {
        // set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();
        //define the chorme driver that you will use for automation
        WebDriver driver = new ChromeDriver();
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
        //wait for 3 second
        Thread.sleep(2000);
        // close it
        // driver.close();
        //enter keyword bmw to search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("BMW");
        // click on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        // whenever you got a new page or navigate, always use 2-3 seconds wait to pause your script a bit
        Thread.sleep(2000);

        //capture the search results using .getText()
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //System.out.println("Search results: " + result);
        //print out only the number
        String[] arrayResult = result.split(" ");
        System.out.println("Search Number: " + arrayResult[1]);
        // simply close/quit the driver/browser
        driver.quit();
        //String newResult = result.replace("(","").replace(")",""); if you want to replace anything
    }//end of main
}// end of java
