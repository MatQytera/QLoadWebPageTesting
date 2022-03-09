package de.qytera.suite_crm.page_objects;


import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.suite_crm.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class EventbriteNumberOptionPO extends TestContext {
    public static final By eventbriteNumberOption = By.xpath("//select[@id='ticket-quantity-selector-305815399']");
   // public static final By numbers = By.id("ticket-quantity-selector-305815399");
    public static final By cashregister = By.xpath("//button[contains(text(),'Zur Kasse')]");

   // String iframe1 = "epik_localstore";
    String iframe2 = "eventbrite-widget-modal-173243735677";
    String num = "1";


    @Step(
            name ="Select count and confirm",
            description = "Anzahl an Tickets auswählen und bestätigen"
    )
    public void eventbriteNumberOption() throws InterruptedException {

        int size = driver.findElements(By.tagName("iframe")).size();

        driver.switchTo().frame(iframe2);


        String test8 = driver.findElement(By.xpath("//select[@id='ticket-quantity-selector-305815399']")).getAttribute("id");


        Select number = new Select(driver.findElement(eventbriteNumberOption));
        number.selectByValue(num);

       // Thread.sleep(2000);

        driver.findElement(cashregister).click();


    }



}