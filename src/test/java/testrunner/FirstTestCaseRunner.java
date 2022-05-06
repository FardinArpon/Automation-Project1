package testrunner;

import org.testng.annotations.Test;
import page.CreateOrderFirstTestCase;
import page.LoginTestCase;
import setup.Setup;

public class FirstTestCaseRunner extends Setup {
    CreateOrderFirstTestCase createOrderFirstTestCase;
    LoginTestCase loginTestCase;

    @Test
    public void orderCreation() throws InterruptedException {
        loginTestCase = new LoginTestCase(driver);
        loginTestCase.doLogin();
        createOrderFirstTestCase = new CreateOrderFirstTestCase(driver);
        createOrderFirstTestCase.createOrder();
    }
}
