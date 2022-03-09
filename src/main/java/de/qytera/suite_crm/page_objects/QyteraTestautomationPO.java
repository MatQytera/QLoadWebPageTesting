package de.qytera.suite_crm.page_objects;


import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.suite_crm.TestContext;
import org.openqa.selenium.By;


public class QyteraTestautomationPO extends TestContext {
    public static final By testautomationTraining = By.xpath("//a[contains(text(),'ISTQB Advanced Level Test Automation Engineer')]");



    @Step(
            name ="Select ISTQB Advanced Level Test Automation Engineer",
            description = "Klick ISTQB Advanced Level Test Automation Engineer"
    )
    public void goToTestautomationTraining() throws InterruptedException {

        driver.findElement(testautomationTraining).click();

        //driver.findElement(solutions).click();
    }



}
