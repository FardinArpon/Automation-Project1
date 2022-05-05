package testrunner;

import org.testng.annotations.Test;
import page.CreateOrderThirdTestCase;
import page.Login;
import setup.Setup;

public class ThirdTestCaseRunner extends Setup {
    CreateOrderThirdTestCase createOrderThirdTestCase;
    Login login;

    @Test
    public void orderCreation() throws InterruptedException {
        login = new Login(driver);
        login.doLogin();
        createOrderThirdTestCase = new CreateOrderThirdTestCase(driver);
        createOrderThirdTestCase.createOrder();
    }
}
