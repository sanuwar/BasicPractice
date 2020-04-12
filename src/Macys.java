import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Macys {
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/BrowserDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://macys.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            WebElement element = driver.findElement(By.xpath("//*[@id = 'shopByDepartmentDropdownLabel']"));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        Thread.sleep(3000);
        WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),'women')]"));
        action.moveToElement(element1).perform();
        Thread.sleep(3000);
        driver.close();
    }
}
//    WebElement element = driver.findElement(By.xpath(locator));
//    Actions action = new Actions(driver);
//    Actions hover = action.moveToElement(element);
//            hover.perform();

//    List<WebElement> elements = driver.findElements(By.name("name"));
//    System.out.println("Number of elements:" +elements.size());
