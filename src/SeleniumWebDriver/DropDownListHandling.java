package SeleniumWebDriver;

/* Types of select method
    i. SelectByVisibleText
    ii. SelectByIndexMethod
    iii. SelectByValueMethod
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownListHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/BrowserDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //driver.manage().window().maximize();
        Select month = new Select(driver.findElement(By.cssSelector("select#month")));
        month.selectByVisibleText("Nov");
        Thread.sleep(3000);
        Select day = new Select (driver.findElement(By.cssSelector("select#day")));
        day.selectByIndex(0);
        Thread.sleep(1000);
        Select year = new Select (driver.findElement(By.cssSelector("select#year")));
        year.selectByValue("1982");
        List <WebElement> yearCount = year.getOptions();
        System.out.println(yearCount.size());
        for (int i =0; i <yearCount.size(); i++){
            String years = yearCount.get(i).getText();
            System.out.println(years);
        }
        driver.close();
    }
}
