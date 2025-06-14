package AJ;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class FrameHandling {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        System.out.println(driver.findElement(By.id("draggable")).getText());

        Actions action = new Actions(driver);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
        action.dragAndDrop(src, dest).build().perform();

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[text()='Accept']")).click();


        action.moveToElement(driver.findElement(By.name("s"))).click().keyDown(Keys.SHIFT).sendKeys("java").build().perform();
        driver.findElement(By.xpath("(//div[@class='tsmb-suggestion_title'])[3]")).click();

        driver.navigate().to("https://demo.nopcommerce.com/");
        action.moveToElement(driver.findElement(By.id("small-searchterms"))).click().keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("pple").build().perform();
        action.moveToElement(driver.findElement(By.xpath("//button[@type='submit']"))).click().build().perform();
    }

}
