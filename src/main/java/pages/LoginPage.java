package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    //Constructor that will be automatically called as soon as the object of the class is created
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Locator for username field
    private static final  By USER_NAME_LOCATOR = By.id("userName");

    //Locator for password field
    private static final  By PASSWORD_LOCATOR = By.id("password");

    //Locator for login button
    private static final  By LOGIN_BUTTON_LOCATOR = By.id("login");


    //Method to enter username
    public void enterUsername(String userName) {
        enterText(USER_NAME_LOCATOR, userName);
    }

    //Method to enter password
    public void enterPassword(String pass) {
        enterText(PASSWORD_LOCATOR, pass);
    }

    //Method to click on Login button
    public void clickOnLoginButton() {
        performClickOnWebElement(LOGIN_BUTTON_LOCATOR);
    }
}
