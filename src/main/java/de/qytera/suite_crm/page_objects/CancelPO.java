package de.qytera.suite_crm.page_objects;




import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.suite_crm.TestContext;
import org.openqa.selenium.By;

public class CancelPO extends TestContext {

    public static final By cancel = By.xpath("//button[contains(text(),'Abbrechen')]");
    String iframe = "eventbrite-widget-modal-173243735677";


    @Step(
            name ="Cancel",
            description = "klicke Abbruch"
    )
    public void cancel() throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(iframe);


        driver.findElement(cancel).click();

    }



}
