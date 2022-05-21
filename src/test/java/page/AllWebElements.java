package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AllWebElements {
    WebDriver driver;

    @FindBy(id = "groupNode_order_management_1")
    WebElement orderManagementLink;
    @FindBy(id = "itemNode_order_management_order_management_1")
    WebElement orderManagement;
    @FindBy(xpath = "//span[@class='xrf']")
    WebElement createOrder;
    @FindBy(xpath = "//select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:soc3::content']")
    WebElement businessUnit;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:partyNameId::content")
    WebElement customer;
    @FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:orderType1Id::content']")
    WebElement orderType;
    @FindBy(xpath = "//img[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:searchIcoId::icon']")
    WebElement lookingGlass;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:efqrp:value00::content")
    WebElement itemNumber;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:efqrp:value00::content")
    WebElement forFuel;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:efqrp::search")
    WebElement itemSearch;
    //    @FindBy(xpath = "//span[contains(text(),'102084')]")
    @FindBy(xpath = "//span[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:0:effcpDescription::content']")
    WebElement itemSelect;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:0:effcpDescription::content")
    WebElement baconSelect;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:1:effcpDescription::content")
    WebElement chickenSelect;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:0:effcpDescription::content")
    WebElement chickenSelectFor4Th;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:1:effcpDescription::content")
    WebElement chickenSelectFor4Th2nd;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:1:effcpDescription::content")
    WebElement potatoSelect;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:2:effcpDescription::content")
    WebElement honeySelect;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:cb1")
    WebElement clickOk;
    @FindBy(xpath = "//span[contains(text(),'HOT ROUTE FEE')]")
    WebElement hotRouteFee;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:createLineQuantity::content")
    WebElement addingQuantity;
    @FindBy(xpath = "//span[contains(text(),'Add')]")
    WebElement addingItem;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:sdi2::icon")
    WebElement shippingDetails;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:soc1::content")
    WebElement requestType;
    @FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:id1::content']")
    WebElement requestDate;
    @FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:shipMethodId::content']")
    WebElement shippingMethod;
    @FindBy(xpath = "//span[@class='xrf'][contains(text(),'Save')]")
    WebElement save;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement submit;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:cb14")
    WebElement popOk;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:4:APVIEW1:cbrefr")
    WebElement refresh;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:pc1:t1:c1")
    WebElement actionsToWarehouse;
    @FindBy(xpath = "//span[contains(text(),'Update Lines')]")
    WebElement updateLines;
    @FindBy(xpath = "//label[contains(text(),'Warehouse')]")
    WebElement warehouse;
    @FindBy(xpath = "//label[contains(text(),'Request Type')]")
    WebElement updateRequestType;
    @FindBy(xpath = "//label[contains(text(),'Requested Date')]")
    WebElement updateRequestdate;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:2:SP1:_selectAttribs::move")
    WebElement rightArrow;
    @FindBy(xpath = "//span[contains(text(),'ext')]")
    WebElement warehouseNext;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:3:SP2:t2:0:soc1::content")
    WebElement setRequestTypeInUpdateLines;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:3:SP2:t2:1:id2::content")
    WebElement setRequestedDateInUpdateLines;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:3:SP2:t2:0:integerValueId::content")
    WebElement warehouseValue;
    @FindBy(xpath = "//span[contains(text(),'ave and Close')]")
    WebElement saveAndClose;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:3:SP2:cb1")
    WebElement warehouseYes;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:pc1:t1:0:errAndLineNbr")
    WebElement item1;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:pc1:t1:1:errAndLineNbr")
    WebElement item2;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:pc1:t1:2:errAndLineNbr")
    WebElement item3;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:pc1:t1:3:errAndLineNbr")
    WebElement item4;
    @FindBy(xpath = "//span[contains(text(),'Customer Site Zone Context is not populated')]")
    WebElement errorMessage;
    @FindBy(xpath = "//select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:3:SP2:t2:0:soc1::content']")
    WebElement updateLinesRequestType;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:soc1::content")
    WebElement requestTypeInShippingDetails;

    public void item1UpdateLinesCFA() throws InterruptedException, AWTException {
        item1.click();
        genericUpdateLinesForCFA();
    }
    public void item2UpdateLinesCFA() throws InterruptedException, AWTException {
        item2.click();
        genericUpdateLinesForCFA();
    }
    public void item3UpdateLinesCFA() throws InterruptedException, AWTException {
        item3.click();
        genericUpdateLinesForCFA();
    }
    public void item4UpdateLinesCFA() throws InterruptedException, AWTException {
        item4.click();
        genericUpdateLinesForCFA();
    }
    public void item1UpdateLinesOTP() throws InterruptedException, AWTException {
        item1.click();
        genericUpdateLinesForOTP();
    }
    public void item2UpdateLinesOTP() throws InterruptedException, AWTException {
        item2.click();
        genericUpdateLinesForOTP();
    }
    public void item3UpdateLinesOTP() throws InterruptedException, AWTException {
        item3.click();
        genericUpdateLinesForOTP();
    }
    public void item4UpdateLinesOTP() throws InterruptedException, AWTException {
        item4.click();
        genericUpdateLinesForOTP();
    }
    public void genericUpdateLinesForCFA() throws InterruptedException, AWTException {
        Thread.sleep(3000);
        updateLines.click();
        Thread.sleep(6000);
        updateRequestType.click();
        Thread.sleep(3000);
        rightArrow.click();
        Thread.sleep(2000);
        updateRequestdate.click();
        Thread.sleep(3000);
        rightArrow.click();
        Thread.sleep(1000);
        warehouseNext.click();
        Thread.sleep(8000);

        updateLinesRequestType.click();
//        Select selectRequestTypeFromUpdateLines = new Select(driver.findElement(By.xpath("//select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:3:SP2:t2:0:soc1::content']")));
//        selectRequestTypeFromUpdateLines.selectByValue("0");
//        updateLinesRequestType.sendKeys(Keys.ARROW_DOWN);
//        updateLinesRequestType.sendKeys(Keys.ENTER);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        setRequestedDateInUpdateLines.clear();
        Thread.sleep(1000);
        setRequestedDateInUpdateLines.sendKeys("5/31/22 11:00 AM");
        Thread.sleep(2000);
        saveAndClose.click();
        Thread.sleep(5000);
    }

    public void genericUpdateLinesForOTP() throws InterruptedException, AWTException {
        Thread.sleep(3000);
        updateLines.click();
        Thread.sleep(6000);
        updateRequestType.click();
        Thread.sleep(3000);
        rightArrow.click();
        Thread.sleep(2000);
        updateRequestdate.click();
        Thread.sleep(3000);
        rightArrow.click();
        Thread.sleep(1000);
        warehouseNext.click();
        Thread.sleep(8000);
//        Select select4 = new Select(driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:soc1::content")));
//        select4.selectByVisibleText("Arrive on");

        updateLinesRequestType.click();
//        Select selectRequestTypeFromUpdateLines = new Select(driver.findElement(By.xpath("//select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:3:SP2:t2:0:soc1::content']")));
//        selectRequestTypeFromUpdateLines.selectByValue("0");
//        updateLinesRequestType.sendKeys(Keys.ARROW_DOWN);
//        updateLinesRequestType.sendKeys(Keys.ENTER);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(3000);
        setRequestedDateInUpdateLines.clear();
        Thread.sleep(1000);
        setRequestedDateInUpdateLines.sendKeys("5/31/22 11:00 AM");
        Thread.sleep(2000);
        saveAndClose.click();
        Thread.sleep(5000);
    }

    public void shippingDetailsForCFA() throws InterruptedException, AWTException {
        shippingDetails.click();
        Thread.sleep(3000);
        requestType.click();
        Thread.sleep(4000);
//        Select select1 = new Select(driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:soc1::content")));
//        select1.selectByVisibleText("Arrive on");
        requestTypeInShippingDetails.click();
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_UP);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(3000);
        requestDate.clear();
        Thread.sleep(1000);
        requestDate.sendKeys("5/31/22 11:00 AM");
        Thread.sleep(1000);
        shippingMethod.click();
        Thread.sleep(3000);
        save.click();
        Thread.sleep(5000);
        String text = errorMessage.getText();
        Assert.assertEquals(text,"Customer Site Zone Context is not populated");
    }

    public void shippingDetails() throws InterruptedException, AWTException {
        shippingDetails.click();
        Thread.sleep(3000);
        requestType.click();
        Thread.sleep(2000);
//        Select select1 = new Select(driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:soc1::content")));
//        select1.selectByVisibleText("Arrive on");
        requestTypeInShippingDetails.click();
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_UP);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        requestDate.clear();
        Thread.sleep(1000);
        requestDate.sendKeys("5/31/22 11:00 AM");
        Thread.sleep(1000);
        shippingMethod.click();
        Thread.sleep(3000);
        save.click();
        Thread.sleep(10000);
        submit.click();
        Thread.sleep(20000);
        popOk.click();
        Thread.sleep(5000);
        refresh.click();
        Thread.sleep(5000);
    }
}
