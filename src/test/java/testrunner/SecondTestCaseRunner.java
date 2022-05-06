package testrunner;

import org.testng.annotations.Test;
import page.CreateOrderSecondTestCase;
import page.LoginTestCase;
import setup.Setup;

public class SecondTestCaseRunner extends Setup {
    CreateOrderSecondTestCase createOrderSecondTestCase;
    LoginTestCase loginTestCase;

    @Test
    public void orderCreation() throws InterruptedException {
        loginTestCase = new LoginTestCase(driver);
        loginTestCase.doLogin();
        createOrderSecondTestCase = new CreateOrderSecondTestCase(driver);
        createOrderSecondTestCase.createOrder();
    }
}
