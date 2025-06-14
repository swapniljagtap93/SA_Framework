package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        List<WebElement> countries = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
        System.out.println(countries.size());

        for (WebElement country : countries)
        {
            if (country.getText().equalsIgnoreCase("india"))
            {
                Thread.sleep(5);
                country.click();
                break;
            }

        }
    }
}
