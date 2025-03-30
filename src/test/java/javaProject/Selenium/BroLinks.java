package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BroLinks {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.deadlinkcity.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links are: " + links.size());

        for (WebElement link : links) {
            String urlValue = link.getAttribute("href");

            try {
                URL url = new URL(urlValue);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.connect();

                if (conn.getResponseCode() >= 400) {
                    System.out.println(urlValue + " is a broken link");
                } else {
                    System.out.println(urlValue + " is a valid link");
                }


            } catch (Exception e) {

            }


        }
    }
}
