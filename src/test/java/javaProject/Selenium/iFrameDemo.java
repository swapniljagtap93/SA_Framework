package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class iFrameDemo {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https:the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        System.out.println(driver.findElement(By.cssSelector("div h3")).getText());

        System.out.println(driver.findElement(By.xpath("//span[text()='Edit']")).getText());

        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        driver.findElement(By.tagName("p")).click();
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("This is an a iFrame test.");

        driver.switchTo().defaultContent();
        // Switch to default content on the screen first then only below code work
        System.out.println(driver.findElement(By.xpath("//span[text()='Format']")).getText());
    }
}
