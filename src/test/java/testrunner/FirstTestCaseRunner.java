package testrunner;

import org.testng.annotations.Test;
import page.CreateOrderFirstTestCase;
import page.LoginTestCase;
import setup.Setup;

import java.awt.*;

public class FirstTestCaseRunner extends Setup {
    CreateOrderFirstTestCase createOrderFirstTestCase;
    LoginTestCase loginTestCase;

    @Test
    public void orderCreation() throws InterruptedException, AWTException {
        loginTestCase = new LoginTestCase(driver);
        loginTestCase.doLogin();
        createOrderFirstTestCase = new CreateOrderFirstTestCase(driver);
        createOrderFirstTestCase.createOrder();
    }
}
