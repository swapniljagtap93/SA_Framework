package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class FrameHandling {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        System.out.println(driver.findElement(By.id("draggable")).getText());
        System.out.println(driver.findElement(By.id("droppable")).getText());

        Actions action = new Actions(driver);
//        driver.findElement(By.id("draggable"));
//        driver.findElement(By.id("droppable"));
        action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
        System.out.println(driver.findElement(By.id("droppable")).getText());

        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Accept")).click();

    }
}
