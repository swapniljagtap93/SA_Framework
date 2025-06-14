package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class brokenLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links are: "+links.size());

        int brokenLinksCount = 0;
        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String linkAttributeValue = element.getAttribute("href");

            if (linkAttributeValue == null || linkAttributeValue.isEmpty()) {
                System.out.println(linkAttributeValue + " Given link is empty or null");
            }

            try {
                assert linkAttributeValue != null;
                URL url = new URL(linkAttributeValue);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                if (connection.getResponseCode() >= 400) {
                    System.out.println(linkAttributeValue + " is a broken/invalid link");
                    brokenLinksCount++;
                } else {
                    System.out.println(linkAttributeValue + " is a valid link");
                }
            } catch (Exception ignored) {

            }
        }
        System.out.println("Total number of broken links on the page are: "+brokenLinksCount);
    }
}
