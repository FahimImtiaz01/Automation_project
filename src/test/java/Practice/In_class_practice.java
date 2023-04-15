
package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class In_class_practice {
    public static void main(String[] args) throws InterruptedException {


        // ser up the driver through web driver manager
        WebDriverManager.chromedriver().setup();

        // chrome option
        ChromeOptions options= new ChromeOptions();
        options.addArguments("incognito");
        WebDriver driver= new ChromeDriver(options);
        ArrayList<String> state = new ArrayList<>();
        state.add("new york");
        state.add("pennsylvania");
        state.add("connecticut");
        for (int i=0;i<state.size();i++){
            driver.navigate().to("https://www.hotels.com");
            Thread.sleep(3000);
            try {
                //click on go to text box

                driver.findElement(By.xpath("//*[@class='uitk-fake-input uitk-form-field-trigger']")).click();
                //type in states
                driver.findElement(By.xpath("//*[@class='uitk-field-input uitk-typeahead-input uitk-typeahead-input-v2']")).sendKeys(state.get(i));
                Thread.sleep(2000);
                // click on the first option
                driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-fullWidth has-subtext destination_form_field-result-item-button result-item-button']")).click();
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println("Unable to click on destination text box " + e);
            }//end of exception for state text box

            ArrayList<Integer>adults= new ArrayList<>();
            adults.add(2);
            adults.add(3);
            adults.add(4);

           try {
               driver.findElement(By.xpath("//*[@class='uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']")).click();
           }catch (Exception e) {
               System.out.println ("unable to click on travelers tabs "+ e);
           }// end of try and catch
            //create array list of the plus and minus
            ArrayList<WebElement>button=new ArrayList<>(driver.findElements(By.xpath("//*[@class='uitk-step-input-button']")));
           Thread.sleep(2000);
            button.get(0).click();
            Thread.sleep(3000);
              for(int a=0; a<adults.get(i);a++){
                  button.get(1).click();

              }// end of loop







        }// end of for loop


        driver.quit();












    }// end of main
}// end of class
