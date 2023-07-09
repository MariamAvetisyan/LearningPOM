package justForTesting;

import baseTest.BaseTest;
import com.beust.jcommander.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 extends BaseTest
{
    @Test
    @Parameters("myText")
    public void WebStudentLogin(String myText)
    {
        System.out.println("Student login through web " + myText);
    }
    @Test
    public void MobileStudentLogin()
    {
        System.out.println("Student login through mobile");
    }
    @Test(dependsOnMethods= {"WebStudentLogin"})
    public void APIStudentLogin()
    {
        System.out.println("Student login through API");
    }
}