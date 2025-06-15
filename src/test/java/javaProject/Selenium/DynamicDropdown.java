package javaProject.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Select too city
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

//        driver.findElement(By.cssSelector("a[value='BHO']")).click();
//        driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BHO']")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
    }
}