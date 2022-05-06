package testrunner;

import org.testng.annotations.Test;
import page.CreateOrderThirdTestCase;
import page.LoginTestCase;
import setup.Setup;

public class ThirdTestCaseRunner extends Setup {
    CreateOrderThirdTestCase createOrderThirdTestCase;
    LoginTestCase loginTestCase;

    @Test
    public void orderCreation() throws InterruptedException {
        loginTestCase = new LoginTestCase(driver);
        loginTestCase.doLogin();
        createOrderThirdTestCase = new CreateOrderThirdTestCase(driver);
        createOrderThirdTestCase.createOrder();
    }
}
