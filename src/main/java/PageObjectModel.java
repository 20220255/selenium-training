import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ConfirmationPage;
import pages.FormPage;

import static org.junit.Assert.assertEquals;

public class PageObjectModel {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\OneDrive\\Selenium Projects\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

//        FormPage formPage = new FormPage();
        FormPage.submitForm(driver);

//        ConfirmationPage confirmationPage = new ConfirmationPage();
        ConfirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", ConfirmationPage.getAlertBannerText(driver));

        driver.quit();
    }
}
