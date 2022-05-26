package testrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import setup.Setup;

import java.time.LocalDate;
import java.util.List;

public class FifthTestCaseRunner extends Setup {
    @Test
    public void fifthOne() throws InterruptedException {
        driver.get("https://m.informstaging.cfahome.com/?bypass_sso=true#/Inventory/Order/Place");
         driver.findElement(By.id("loginUsername")).sendKeys("cook.cook2");
         driver.findElement(By.id("loginPassword")).sendKeys("Cook123");
         driver.findElement(By.id("btnLogin")).click();
         driver.findElement(By.id("mx-navbar-menu-button")).click();
         driver.findElement(By.id("mx-nav-group-orders-group")).click();
         driver.findElement(By.id("mx-nav-order-create")).click();
         driver.findElement(By.id("btnAddOrder")).click();
        driver.findElement(By.id("ddl-btn-vendors")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'CHICK-FIL-A SUPPLY')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btn-for-review-no")).click();

        //String todayDay = LocalDate.now().getDayOfWeek().name();
        int todayDate = LocalDate.now().getDayOfMonth();
        int deliveryDate = 0;
        int coverDate = 0;

        if (todayDate <= 31){
            if((todayDate + 3) > 30){
                deliveryDate = 2;
                coverDate = 3;
            }
            else{
                deliveryDate = todayDate + 2;
                coverDate = todayDate + 3;
            }
        }

        String deliveryDateString = String.valueOf(deliveryDate);
        String coverDateString = String.valueOf(coverDate);

        //delivery date
        driver.findElement(By.id("btn-calendar-delivery-date")).click();
        List<WebElement> deliveryDates = driver.findElements(By.xpath("//span[contains(text(),'"+deliveryDateString+"')]"));
        deliveryDates.get(1).click();
        driver.findElement(By.id("DeliveryClock")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[3]/div[2]/span[1]/div/div/div/div/table/tbody/tr[2]/td[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[3]/div[2]/span[1]/div/div/div/div/table/tbody/tr[2]/td[1]/input")).sendKeys("03");

        //cover date
        driver.findElement(By.id("btn-calendar-cover-date")).click();
        List<WebElement> coverDates = driver.findElements(By.xpath("//span[contains(text(),'"+coverDateString+"')]"));
        coverDates.get(1).click();

        //confirm
        driver.findElement(By.id("btn-modal-confirm")).click();

        driver.findElement(By.id("txt-item-search")).sendKeys("100876");
        driver.findElement(By.name("PurchaseQuantity")).clear();
        driver.findElement(By.name("PurchaseQuantity")).sendKeys("2");

        driver.findElement(By.id("txt-item-search")).clear();
        driver.findElement(By.id("txt-item-search")).sendKeys("032808");
        driver.findElement(By.name("PurchaseQuantity")).clear();
        driver.findElement(By.name("PurchaseQuantity")).sendKeys("3");

        driver.findElement(By.id("txt-item-search")).clear();
        driver.findElement(By.id("txt-item-search")).sendKeys("051835");
        driver.findElement(By.name("PurchaseQuantity")).clear();
        driver.findElement(By.name("PurchaseQuantity")).sendKeys("5");

        driver.findElement(By.id("txt-item-search")).clear();
        driver.findElement(By.id("txt-item-search")).sendKeys("101564");
        driver.findElement(By.name("PurchaseQuantity")).clear();
        driver.findElement(By.name("PurchaseQuantity")).sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='tbl-order-summary']/tbody/tr/td[6]")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("order-details-actions")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[3]/div/div/ul/li[1]/a")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("btn-place-order-modal-confirm")).click();
        Thread.sleep(5000);


    }
}
