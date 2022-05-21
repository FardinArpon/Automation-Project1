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

import java.awt.*;
import java.time.Duration;

public class CreateOrderFourthTestCase extends AllWebElements{
    WebDriver driver;

    public CreateOrderFourthTestCase(WebDriver driver){
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
        Thread.sleep(20000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("///select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:soc3::content']")));
        businessUnit.click();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.xpath( "//select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:soc3::content']")));
        select.selectByVisibleText("OTP");
        Thread.sleep(3000);
        customer.click();
        Thread.sleep(3000);
        customer.sendKeys("Colony square");
        Thread.sleep(7000);
        orderType.click();
        Thread.sleep(7000);
        orderType.sendKeys("OTP Hot Route Order");
        Thread.sleep(5000);

        lookingGlass.click();
        Thread.sleep(7000);
        itemNumber.sendKeys("102084");
        Thread.sleep(1000);
        itemSearch.click();
        Thread.sleep(5000);
        chickenSelectFor4Th.click();
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
        itemNumber.sendKeys("102088");
        Thread.sleep(1000);
        itemSearch.click();
        Thread.sleep(5000);
        chickenSelectFor4Th2nd.click();
        Thread.sleep(3000);
        clickOk.click();
        Thread.sleep(7000);
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

        item1UpdateLinesOTP();
        item2UpdateLinesOTP();
        shippingDetails();

//        actionsToWarehouse.click();
//        Thread.sleep(3000);
//        updateLines.click();
//        Thread.sleep(6000);
//        warehouse.click();
//        Thread.sleep(3000);
//        rightArrow.click();
//        Thread.sleep(1000);
//        warehouseNext.click();
//        Thread.sleep(4000);
//        warehouseValue.click();
//        Thread.sleep(1000);
//        warehouseValue.sendKeys("GAOTP - GAOTP");
//        saveAndClose.click();
//        Thread.sleep(4000);
//        warehouseYes.click();
//        Thread.sleep(4000);
//
//        shippingDetails.click();
//        requestType.click();
//        Thread.sleep(2000);
//        Select select1 = new Select(driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:soc1::content")));
//        select1.selectByVisibleText("Arrive on");
//        Thread.sleep(3000);
//        requestDate.clear();
//        Thread.sleep(1000);
//        requestDate.sendKeys("5/20/22 11:00 AM");
//        Thread.sleep(1000);
//        shippingMethod.click();
//        Thread.sleep(3000);
//        submit.click();
//        Thread.sleep(20000);
//        popOk.click();
//        Thread.sleep(5000);
//        refresh.click();
//        Thread.sleep(5000);
    }
}
