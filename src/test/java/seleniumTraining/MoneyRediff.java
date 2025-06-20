package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MoneyRediff {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://money.rediff.com/gainers");
        List<WebElement> allCompany = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
        List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
        String expResult = "Waaree Energies";

        for (int i = 0; i < allCompany.size(); i++) {
            if (allCompany.get(i).getText().equalsIgnoreCase(expResult)) {
                System.out.println(allCompany.get(i).getText() + "==" + currentPrice.get(i).getText());

                // Scroll element into view
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", allCompany.get(i));

                // Wait until clickable
                new WebDriverWait(driver, Duration.ofSeconds(20))
                        .until(ExpectedConditions.elementToBeClickable(allCompany.get(i)));

                allCompany.get(i).click();
                System.out.println("Title of te Stock details page is: "+driver.getTitle());
                break;
            }
        }
        driver.close();
    }
}