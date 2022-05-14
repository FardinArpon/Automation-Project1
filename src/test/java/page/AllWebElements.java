package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    @FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:efqrp:value00::content']")
    WebElement itemNumber;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:efqrp::search")
    WebElement itemSearch;
    //    @FindBy(xpath = "//span[contains(text(),'102084')]")
    @FindBy(xpath = "//span[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:0:effcpDescription::content']")
    WebElement itemSelect;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:1:effcpDescription::content")
    WebElement baconSelect;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:0:effcpDescription::content")
    WebElement chickenSelect;
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
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:2:SP1:_selectAttribs::move")
    WebElement rightArrow;
    @FindBy(xpath = "//span[contains(text(),'ext')]")
    WebElement warehouseNext;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:3:SP2:t2:0:integerValueId::content")
    WebElement warehouseValue;
    @FindBy(xpath = "//span[contains(text(),'ave and Close')]")
    WebElement saveAndClose;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:3:SP2:cb1")
    WebElement warehouseYes;
    @FindBy(xpath = "//span[contains(text(),'Customer Site Zone Context is not populated')]")
    WebElement errorMessage;
}
