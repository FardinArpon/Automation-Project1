package testrunner;

import org.testng.annotations.Test;
import page.CreateOrderThirdTestCase;
import page.LoginTestCase;
import setup.Setup;

import java.awt.*;

public class ThirdTestCaseRunner extends Setup {
    CreateOrderThirdTestCase createOrderThirdTestCase;
    LoginTestCase loginTestCase;

    @Test
    public void orderCreation() throws InterruptedException, AWTException {
        loginTestCase = new LoginTestCase(driver);
        loginTestCase.doLogin();
        createOrderThirdTestCase = new CreateOrderThirdTestCase(driver);
        createOrderThirdTestCase.createOrder();
    }
}
