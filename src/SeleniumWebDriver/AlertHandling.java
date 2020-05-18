package SeleniumWebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/BrowserDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
        driver.findElement(By.id("alertbtn")).click();
        Alert alert = driver.switchTo().alert();
        String alertMsg=alert.getText();
        System.out.println(alertMsg);
        alert.accept();
        WebElement alertBoxMsg=driver.findElement(By.id("name"));
        alertBoxMsg.sendKeys("msr");

        driver.findElement(By.id("confirmbtn")).click();
        String confirmAlertMsg = alert.getText();
        System.out.println(confirmAlertMsg);
        if (confirmAlertMsg.contains("you want to confirm")){
            System.out.println("Alert text is YES matched");
        }
        else
            System.out.println("Alert text is NOT matched");
        alert.dismiss();
        driver.close();
    }
}
