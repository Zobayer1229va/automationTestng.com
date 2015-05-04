package commonApi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Zarif on 4/24/2015.
 */
public class Base {
    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    //resived Parameters
    public void setup(String url) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }

    //Utiliteis Methods
    public void clickByCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    //this one use click and enter
    public void typeAndEnterByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    //this one use click and enter
    public void typeAndEnterByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }
public List<WebElement> getWebElements(String locator){
    List<WebElement> element = driver.findElements(By.cssSelector(locator));
    return element;
}
    public List<String> getTextByCss(String locator) {
        List<WebElement> element = driver.findElements(By.cssSelector(locator));
        List<String> text = new ArrayList<String>();
        for (WebElement st : element) {
            text.add(st.getText());
        }
        return text;

    }
    //for loop
    public void displayText(List<String> text){
        for (String st:text){
            System.out.println(st);
        }
    }
public  void  sleepFor(int sec) throws InterruptedException{
    Thread.sleep(sec*1000);
}
}




