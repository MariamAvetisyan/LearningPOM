package login;

import baseTest.BaseTest;
import objects.constants.URLs;
import objects.enums.Browser;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPositiveTests extends BaseTest {
    @Test()
    public void verifyLoginTest() throws InterruptedException {
        setupWebDriver(Browser.CHROME);
        openDesiredURL(URLs.DEMO_QA_BOOKS);

        //Creating object of home page
        HomePage homePage = new HomePage(driver);

        //Click on login button
        homePage.clickOnLoginButton();

        //Creating object of login page
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
