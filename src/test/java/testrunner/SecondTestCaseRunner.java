package testrunner;

import org.testng.annotations.Test;
import page.CreateOrderSecondTestCase;
import page.Login;
import setup.Setup;

public class SecondTestCaseRunner extends Setup {
    CreateOrderSecondTestCase createOrderSecondTestCase;
    Login login;

    @Test
    public void orderCreation() throws InterruptedException {
        login = new Login(driver);
        login.doLogin();
        createOrderSecondTestCase = new CreateOrderSecondTestCase(driver);
        createOrderSecondTestCase.createOrder();
    }
}
