package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Mouse_Actions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("small-searchterms"))).click().keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("pple").build().perform();
        action.moveToElement(driver.findElement(By.xpath("(//button[@type='submit'])[1]"))).click().build().perform();
        action.moveToElement(driver.findElement(By.linkText("Computers"))).build().perform();
        action.contextClick(driver.findElement(By.linkText("Computers"))).build().perform();

    }
}
