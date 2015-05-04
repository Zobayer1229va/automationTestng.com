package amazon.com;

import commonApi.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Zarif on 4/24/2015.
 */
public class AmazonHomepage extends Base {
    @Test
    public void homePageOfAmazon()throws InterruptedException{
        System.out.println(driver.getCurrentUrl());
        typeAndEnterByCss("#twotabsearchtextbox","book");
        sleepFor(3);
        //list 0f WebElements size count
       // List<WebElement> list = driver.findElements(By.cssSelector("#nav-subnav .nav-a"));
        List<String> list = getTextByCss("#nav-subnav .nav-a");
        displayText(list);
        for (int i=1; i<list.size(); i++){
            driver.findElement(By.linkText(list.get(i))).click();        }

        //clickByXpath(".//*[@id='nav-subnav']/a[2]");
        sleepFor(3);
    }
}
