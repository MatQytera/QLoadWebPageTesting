package de.qytera.suite_crm.page_objects;


import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.suite_crm.TestContext;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static de.qytera.qtaf.core.QtafFactory.getWebDriver;


public class EventbritePO extends TestContext {
    public static final By testautomationTraining = By.xpath("//button[@id='eventbrite-widget-modal-trigger-173243735677']");



    @Step(
            name ="Select Tickets",
            description = "Klicke Tickets"
    )
    public void goToTestautomationTraining() throws InterruptedException {

        String CurrentTab = getWebDriver().getWindowHandle();
        int i = 0;
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        for (String tab : tabs) {
            if (tab.equals(CurrentTab)) {
                driver.switchTo().window(tabs.get(i + 1));
                break;
            } else {
                i++;
            }
        }

        driver.findElement(testautomationTraining).click();
       // Thread.sleep(2000);
        //driver.findElement(solutions).click();
    }



}