package parallelTesting;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestingParallely extends BaseTest
{
    @Test
    public void WebStudentLogin() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Student login through web " );
    }
    @Test
    public void MobileStudentLogin() throws InterruptedException {
        Thread.sleep(3000);

        System.out.println("Student login through mobile");
    }
    @Test
    public void APIStudentLogin()
    {
        System.out.println("Student login through API");
    }
}