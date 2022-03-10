package de.qytera.webpage.page_objects;


import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.webpage.TestContext;
import org.openqa.selenium.By;


public class QyteraTestautomationRegistrationOptionsPO extends TestContext {
    public static final By testautomationRegistration = By.xpath("//tbody/tr[2]/td[7]/a[1]");



    @Step(
            name ="Select Anmelden",
            description = "klicke Anmelden für den 02. - 05. Mai"
    )
    public void goToTestautomationRegistration() throws InterruptedException {

        driver.findElement(testautomationRegistration).click();
      //  Thread.sleep(2000);

    }



}
