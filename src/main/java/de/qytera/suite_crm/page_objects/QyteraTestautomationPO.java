package de.qytera.suite_crm.page_objects;


import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.suite_crm.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QyteraTestautomationPO extends TestContext {
    public static final By testautomationTraining = By.xpath("//a[contains(text(),'ISTQB Advanced Level Test Automation Engineer')]");


    @Step(
            name ="ScrollDown",
            description = "scrolle die nach unten"
    )

    public void scrollDownPage()   {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,3000)");



    }



    @Step(
            name ="Select ISTQB Advanced Level Test Automation Engineer",
            description = "Klick ISTQB Advanced Level Test Automation Engineer"
    )
    public void goToTestautomationTraining() throws InterruptedException {

        driver.findElement(testautomationTraining).click();

    }



}
