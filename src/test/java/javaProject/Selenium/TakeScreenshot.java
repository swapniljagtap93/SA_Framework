package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakeScreenshot {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(".\\target\\GreenKart.png");
        FileUtils.copyFile(src, destination);

        WebElement element = driver.findElement(By.xpath("//div[@class='cart']"));
        FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE), new File(".\\target\\GreenCart_Cart.png"));
    }
}
