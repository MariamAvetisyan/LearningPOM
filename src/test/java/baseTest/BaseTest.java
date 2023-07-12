package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import setup.Configuration;

public class BaseTest {
   protected WebDriver driver ;

    protected void setupWebDriver(Browser browser){

        if (browser.equals(Browser.CHROME)){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browser.equals(Browser.EDGE)){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }

    protected void openDesiredURL(String url){
        driver.get(url);
    }

    @BeforeSuite
    public void beforeSuite(){
        Configuration reader = new Configuration();
        System.out.println("before Suite ");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after Suite ");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test ");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test ");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method ");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method ");
    }
}
