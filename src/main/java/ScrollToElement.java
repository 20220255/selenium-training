import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\OneDrive\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(name);
        Thread.sleep(2000);
        name.sendKeys("Meaghan Lewis");
        Thread.sleep(2000);
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");

        driver.quit();
    }
}
