package testrunner;

import org.testng.annotations.Test;
import page.CreateOrderFourthTestCase;
import page.CreateOrderThirdTestCase;
import page.Login;
import setup.Setup;

public class FourTestCaseRunner extends Setup {
    CreateOrderFourthTestCase createOrderFourthTestCase;
    Login login;

    @Test
    public void orderCreation() throws InterruptedException {
        login = new Login(driver);
        login.doLogin();
        createOrderFourthTestCase = new CreateOrderFourthTestCase(driver);
        createOrderFourthTestCase.createOrder();
    }
}
