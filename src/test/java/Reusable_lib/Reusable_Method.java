package Reusable_lib;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.util.ArrayList;

import static Reusable_lib.Reusable_Annotation.driver;

public class Reusable_Method {
    //create a return method to return the webdriver you going to use on your test classes
    //static command allows your method to be global
    public static WebDriver defineChromeDriver() {
        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
       // options.addArguments("headless");
        //options.addArguments("start-fullscreen");
        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //set maximized for mac users
        driver.manage().window().maximize();

        return driver;

    }//end of webdriver method

    //return method will execute your statements along with returning some conditions/value
    //example of return methods are only WebDriver method & getText action

    //void method will only perform the action but won't return anything
    //void actions are click, sendKeys, scrolling, submit, select, mouse hover, clear

    //click action is one of the type of void method
    public static void clickMethod(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
            System.out.println("Successfully clicked on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ": " + e);
        }
    }//end of click method

    //submit action is one of the type of void method
    public static void submitMethod(WebDriver driver,String xpath,String elementName){
        WebDriverWait wait =  new WebDriverWait(driver,10);
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).submit();
            System.out.println("Successfully submit on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + ": " + e);
        }
    }//end of submit method








    //click action is one of the type of void method
    public static void sendKeysMethod(WebDriver driver, String xpath, String userValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Thread.sleep(3000);
            element.clear();
            element.sendKeys(userValue);
            System.out.println("Successfully entered a value on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to enter a value on element " + elementName + ": " + e);
        }
    }//end of sendkeys method

    //click action is one of the type of void method
    public static void clickMethodByIndex(WebDriver driver, String xpath, int index, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).click();
            System.out.println("Successfully clicked on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ": " + e);
        }
    }//end of click method by index

    //click action is one of the type of void method

    public static void sendKeysMethodByIndex(WebDriver driver, String xpath, String userValue, int index, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            element.clear();
            element.sendKeys(userValue);
            System.out.println("Successfully entered a value on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to enter a value on element " + elementName + ": " + e);
        }
    }//end of sendkeys method

    //capture a text and return it using return method
    public static String getTextMethod(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String result = "";
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            result = element.getText();
            System.out.println("Successfully captured a text from element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to capture text from element " + elementName + ": " + e);
        }
        return result;
    } //end of gettext method

        //dropdown method
        public static void selectByText(WebDriver driver,String xpath, String selectValue, String elementName){
            WebDriverWait wait = new WebDriverWait(driver, 10);
            try {
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
                Select dropDown = new Select(element);
                dropDown.selectByVisibleText(selectValue);
                System.out.println("Successfully selected by text from element " + elementName);
            } catch (Exception e) {
                System.out.println("Unable to select by text from element " + elementName + ": "  + e);
            }
        }// end of selectByText method

        public static void scrollByElement(WebDriver driver,String xpath,String elementName){
        WebDriverWait wait= new WebDriverWait(driver,10);
        try {
            WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true)",element);
            System.out.println("Successfully selected element" + elementName);
        } catch (Exception e) {
            System.out.println("unable to select element" + elementName +": " + e);

        }

        }// end of scrollByElement

    public static void mouseHover(WebDriver driver,String xpath,String elementName){
        WebDriverWait wait= new WebDriverWait(driver,10);

        try{
            WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Actions mouseAction= new Actions(driver);
            mouseAction.moveToElement(element).perform();
            System.out.println("successfully hover over element");
        } catch (Exception e){
            System.out.println("unable to hover over element");
        }


    }// end of mousehover

    public static void verifyBooleanStatement(WebDriver driver, String xpath, boolean expectedValue, String elementName){
        //store the xpath in boolean statement
        WebDriverWait wait = new WebDriverWait(driver, 7);
        try {
            boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isSelected();
            System.out.println("Value: " + elementState);
            if (elementState == expectedValue) {
                System.out.println("Passed: Checkbox is " + expectedValue);
            } else {
                System.out.println("Failed: Checkbox is " + elementState);
            }
        } catch (Exception e) {
            System.out.println("Unable to verify element  " + elementName + " " + e);
        }//end of exception
    }//end of verifyBooleanStatement

    public static void scrollByPixels(WebDriver driver, String scrollValue){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript(scrollValue);

    }// end of scrollByPixel

    public static void switchToTabByIndex(WebDriver driver, int tabNumber){

         ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
            // switch to the new tab by index of 1
            driver.switchTo().window(tabs.get(tabNumber));

    } // end of switchToTabByIndex






} //end of reusableM
