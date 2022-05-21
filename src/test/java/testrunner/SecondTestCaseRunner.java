package testrunner;

import org.testng.annotations.Test;
import page.CreateOrderSecondTestCase;
import page.LoginTestCase;
import setup.Setup;

import java.awt.*;

public class SecondTestCaseRunner extends Setup {
    CreateOrderSecondTestCase createOrderSecondTestCase;
    LoginTestCase loginTestCase;

    @Test
    public void orderCreation() throws InterruptedException, AWTException {
        loginTestCase = new LoginTestCase(driver);
        loginTestCase.doLogin();
        createOrderSecondTestCase = new CreateOrderSecondTestCase(driver);
        createOrderSecondTestCase.createOrder();
    }
}
