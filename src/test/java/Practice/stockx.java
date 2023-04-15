package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class stockx {
    public static void main(String[] args) throws InterruptedException {

        // go to jetblue website
        // enter a 3 country you want to visit using the for loop(italy, spain, bangladesh)
        // chose the depeart
        //click search for flights.

        WebDriverManager.chromedriver().setup();
        // set chrome option
        ChromeOptions options= new ChromeOptions();
        // get the chrome option to incognito
        options.addArguments("start-maximized");
        // define web drive and passing the option
        WebDriver driver = new ChromeDriver(options);

        // navigate to jetblue
        driver.navigate().to("https://google.com");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Africa");

        driver.findElement(By.xpath("//*[@class='gLFyf']")).submit();

        String results= driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

        String[] arrayResult= results.split(" ");

        System.out.println("the search number is " + arrayResult[1]);

         Thread.sleep(2000);
        driver.quit();











    }// end of main
}//end of class
