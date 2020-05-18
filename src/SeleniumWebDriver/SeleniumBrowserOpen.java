package SeleniumWebDriver;

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
        String title = driver.getTitle();
        String cUrl = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();
        System.out.println(title);
        System.out.println(cUrl);
        System.out.println(pageSource);
        Thread.sleep(3000);
//        Actions action = new Actions (driver);
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-item-1284\"]/a"));
//        action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        driver.close();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.guru99.com/");
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.close();
    }

}
