package Day_5_031123;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_xpath_contains {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //define the chrome driver that you will use for automation
        WebDriver driver = new ChromeDriver();
        //navigate to yahoo page
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(2000);
        //using the xpath contains click on the mail link by ignoring the white space on the text property for that element
        driver.findElement(By.xpath("//a[contains(text(),'Mail')]")).click();


    }//end of main
}//end of class
