package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Action_item2_part2 {
    public static void main(String[] args) throws InterruptedException {
        // set up chrome driver
        WebDriverManager.chromedriver().setup();
        //define chrome driver
        WebDriver driver = new ChromeDriver();
        // set up the array list of countries
        ArrayList<String> sports = new ArrayList<>();
        sports.add("basketball");
        sports.add("Soccer");
        sports.add("football");
        sports.add("hockey");
        // iterate through the list of countries
        for (int i = 0; i < sports.size(); i++) {
            // navigate to bing.com
            driver.navigate().to("https://www.bing.com");
            // wait for 2 second
            Thread.sleep(3000);
            //enter countries in the search bar
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sports.get(i));
            //click on bing search button
            driver.findElement(By.xpath("//*[@id='search_icon']")).submit();
            //pause the script for 3 sec
            Thread.sleep(3000);
            // capture the result using .getText()
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //Thread.sleep(2000);
            // print out the numbers
            String[] arrayResult= result.split( " ");
            System.out.println("for " + sports.get(i) + " the search number is " + arrayResult[1]);
        }// end of for loop
           // quit the driver
         driver.quit();


    }// end of main
}// end of class
