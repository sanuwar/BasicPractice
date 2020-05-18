package SeleniumWebDriver;

// If there is a frame in the webpage, right click inside the frame will return 'reload frame'
//How to find total number of frame
/* int frameCount = driver.findElements(By.tagName("iframe")).size();
    System.out.println(framecount); */

/* Three ways to switch to the frame
    1. switchTo.frame(int frameNumber)
    2. switchTo.frame(String frame name or Id)
    3. switchTo.frame(WebElement frameLocator)
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/BrowserDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
        //driver.switchTo().frame(0);
        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);
        driver.findElement(By.id("draggable")).click();
        System.out.println("Frame handaled");
        driver.close();
    }
}
