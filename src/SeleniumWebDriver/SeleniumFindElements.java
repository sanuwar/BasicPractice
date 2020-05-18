package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumFindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/BrowserDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        List<WebElement> list  = driver.findElements(By.tagName("a"));
        for (int i =0; i<list.size(); i++){
            System.out.println(list.get(i).getText());
        }
        driver.close();
    }
}
