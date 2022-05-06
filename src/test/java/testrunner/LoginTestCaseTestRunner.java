package testrunner;

import org.testng.annotations.Test;
import page.LoginTestCase;
import setup.Setup;

public class LoginTestCaseTestRunner extends Setup {
    LoginTestCase loginTestCase;

    @Test
    public void Login() throws InterruptedException {
        loginTestCase = new LoginTestCase(driver);
        loginTestCase.doLogin();
    }
}
