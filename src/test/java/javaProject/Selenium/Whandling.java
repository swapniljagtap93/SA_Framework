package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Whandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        System.out.println(driver.findElement(By.cssSelector("a[class='cart-header-navlink']:nth-child(2)")).getText());

        driver.findElement(By.cssSelector("a[class='cart-header-navlink']:nth-child(2)")).click();

       Set<String> windows = driver.getWindowHandles();
       Iterator<String> it = windows.iterator();
       String parentID = it.next();
       String childID = it.next();
       driver.switchTo().window(childID);

       wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("tr:nth-child(2)"))));
       System.out.println(driver.findElement(By.cssSelector("tr:nth-child(2)")).getText());
       driver.quit();
    }
}
