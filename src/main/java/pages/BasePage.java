package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.WaitUtil;

import java.time.Duration;

public class BasePage {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement getWebElement(By by){
        return driver.findElement(by);
    }
    protected void clickOnWebElement(By by){
        WaitUtil.waitElementLocatedBecomeClickable(driver,by);
        getWebElement(by).click();
    }
    protected void performClickOnWebElement(By by){
        Actions action = new Actions(driver);
        action.moveToElement(getWebElement(by)).pause(Duration.ofMillis(500)).click().perform();
    }
    protected void enterText(By by, String text){
        getWebElement(by).sendKeys(text);
    }
}
