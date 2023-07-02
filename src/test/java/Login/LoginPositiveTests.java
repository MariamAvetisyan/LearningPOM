package Login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class LoginPositiveTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/books");

        //Creating object of home page
        HomePage homePage = new HomePage(driver);

        //Click on Login button
        homePage.clickOnLoginButton();

        //Creating object of Login page
        LoginPage login = new LoginPage(driver);

        //Enter username & password
        login.enterUsername("gunjankaushik");
        login.enterPassword("Password@123");

        //Click on login button
        login.clickOnLoginButton();
        Thread.sleep(3000);

        driver.quit();
    }
}
