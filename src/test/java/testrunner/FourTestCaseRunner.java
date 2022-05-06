package testrunner;

import org.testng.annotations.Test;
import page.CreateOrderFourthTestCase;
import page.LoginTestCase;
import setup.Setup;

public class FourTestCaseRunner extends Setup {
    CreateOrderFourthTestCase createOrderFourthTestCase;
    LoginTestCase loginTestCase;

    @Test
    public void orderCreation() throws InterruptedException {
        loginTestCase = new LoginTestCase(driver);
        loginTestCase.doLogin();
        createOrderFourthTestCase = new CreateOrderFourthTestCase(driver);
        createOrderFourthTestCase.createOrder();
    }
}
