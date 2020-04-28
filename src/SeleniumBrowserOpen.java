import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumBrowserOpen {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "src/BrowserDriver/geckodriver");
        WebDriver driver  = new FirefoxDriver();
        driver.get("http://automate-apps.com/");
        Thread.sleep(3000);
        Actions action = new Actions (driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-item-1284\"]/a"));
        action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        driver.close();
    }

}
