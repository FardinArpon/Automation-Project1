package testrunner;

import org.testng.annotations.Test;
import page.CreateOrderFourthTestCase;
import page.LoginTestCase;
import setup.Setup;

import java.awt.*;

public class FourTestCaseRunner extends Setup {
    CreateOrderFourthTestCase createOrderFourthTestCase;
    LoginTestCase loginTestCase;

    @Test
    public void orderCreation() throws InterruptedException, AWTException {
        loginTestCase = new LoginTestCase(driver);
        loginTestCase.doLogin();
        createOrderFourthTestCase = new CreateOrderFourthTestCase(driver);
        createOrderFourthTestCase.createOrder();
    }
}
