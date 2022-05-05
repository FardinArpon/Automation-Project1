package testrunner;

import org.testng.annotations.Test;
import page.CreateOrderFirstTestCase;
import page.Login;
import setup.Setup;

public class FirstTestCaseRunner extends Setup {
    CreateOrderFirstTestCase createOrderFirstTestCase;
    Login login;

    @Test
    public void orderCreation() throws InterruptedException {
        login = new Login(driver);
        login.doLogin();
        createOrderFirstTestCase = new CreateOrderFirstTestCase(driver);
        createOrderFirstTestCase.createOrder();
    }
}
