package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class UploadFile {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/BrowserDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,700)");
        WebElement fileUpload = driver.findElement(By.id("uploadfile"));
        fileUpload.sendKeys("/Users/sanuwar/desktop/Screen Shot 2020-04-10 at 8.35.02 PM.png");
        Thread.sleep(3000);
        driver.close();
    }
}
