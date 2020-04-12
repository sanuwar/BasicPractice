import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumBasic {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/BrowserDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id = 'identifierId']")).sendKeys("Ami kisu pari na");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//       // explicit wait - to wait for the compose button to be click-able
//       WebDriverWait wait = new WebDriverWait(driver,30); Thread.sleep(3000);
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]"))); driver.close();
//       // click on the compose button as soon as the "compose" button is visible
//}      driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();

    }
}