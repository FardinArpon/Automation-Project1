package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;

public class CreateOrderFirstTestCase extends AllWebElements{
    WebDriver driver;
    WebDriverWait wait;

    public CreateOrderFirstTestCase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void createOrder() throws InterruptedException, AWTException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        Actions keyPress = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("groupNode_order_management_1")));
        orderManagementLink.click();
        Thread.sleep(1000);
        orderManagement.click();
        Thread.sleep(30000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='xrf']")));
        createOrder.click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:soc3::content']")));
        businessUnit.click();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.xpath( "//select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:soc3::content']")));
        select.selectByVisibleText("CFA Supply");
        Thread.sleep(3000);
        customer.click();
        Thread.sleep(3000);
        customer.sendKeys("Chapel Hill FSU");
        Thread.sleep(7000);
        orderType.click();
        Thread.sleep(7000);
        orderType.sendKeys("Hot Route Order");
        Thread.sleep(5000);

        lookingGlass.click();
        Thread.sleep(7000);
        itemNumber.sendKeys("100063");
        Thread.sleep(1000);
        itemSearch.click();
        Thread.sleep(5000);
        baconSelect.click();
        Thread.sleep(3000);
        clickOk.click();
        Thread.sleep(7000);
        addingItem.click();
        Thread.sleep(5000);

        lookingGlass.click();
        Thread.sleep(7000);
        itemNumber.sendKeys("102084");
        Thread.sleep(1000);
        itemSearch.click();
        Thread.sleep(5000);
        chickenSelect.click();
        Thread.sleep(3000);
        clickOk.click();
        Thread.sleep(7000);
        addingQuantity.clear();
        Thread.sleep(1000);
        addingQuantity.sendKeys("2");
        Thread.sleep(1000);
        addingItem.click();
        Thread.sleep(5000);

        lookingGlass.click();
        Thread.sleep(7000);
        itemNumber.sendKeys("999102");
        Thread.sleep(1000);
        itemSearch.click();
        Thread.sleep(5000);
        hotRouteFee.click();
        Thread.sleep(3000);
        clickOk.click();
        Thread.sleep(7000);
        addingItem.click();
        Thread.sleep(5000);

        item1UpdateLinesCFA();
//        item2UpdateLinesCFA();
        shippingDetailsForCFA();
    }
}
