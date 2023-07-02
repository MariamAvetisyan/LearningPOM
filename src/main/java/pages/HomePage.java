package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    //Constructor that will be automatically called as soon as the object of the class is created
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Locator for login button
    private static final By LOGIN_BUTTON = By.id("login");

    //Method to click login button
    public void clickOnLoginButton() {
        clickOnWebElement(LOGIN_BUTTON);
    }

}
