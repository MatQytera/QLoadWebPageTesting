package de.qytera.webpage.page_objects;


import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.webpage.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class QyteraTestautomationPO extends TestContext {
    public static final By testautomationTraining = By.xpath("//a[contains(text(),'ISTQB Advanced Level Test Automation Engineer')]");
    public static final By cookieAcceptButton = By.xpath("//*[@id=\"popup-buttons\"]/button[2]");


    @Step(
            name ="Select ISTQB Advanced Level Test Automation Engineer",
            description = "Klick ISTQB Advanced Level Test Automation Engineer"
    )

    public void acceptCoookieButton(){
        try {
           // JavascriptExecutor js = (JavascriptExecutor) driver;

          //  js.executeScript("window.scrollBy(0,3000)");
            driver.findElement(cookieAcceptButton).click();
        }
        catch (Exception e){}

    }

    public void goToTestautomationTraining() throws InterruptedException {

        driver.findElement(testautomationTraining).click();

        //driver.findElement(solutions).click();
    }



}
