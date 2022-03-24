package de.qytera.webpage.page_objects;


import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.webpage.TestContext;
import org.openqa.selenium.By;


public class EventbriteRegisterPO extends TestContext {
    public static final By firstname = By.xpath("//input[@id='buyer.N-first_name']");
    public static final By lastname = By.xpath("//input[@id='buyer.N-last_name']");
    public static final By email = By.xpath("//input[@id='buyer.N-email']");
    public static final By emailconfirm = By.xpath("//input[@id='buyer.confirmEmailAddress']");
    public static final By cancel = By.xpath("//*[@id='cross-chunky_svg__eds-icon--cross-chunky_svg']");
    String iframe = "eventbrite-widget-modal-173243735677";
    String name = "Q-man";
    String emailfield = "Q@qytera.de";


    @Step(
            name ="fullfill firstname",
            description = "Trage vorname ein"
    )
    public void fillFirstnameField() throws InterruptedException {
        driver.switchTo().defaultContent();

        driver.switchTo().frame(iframe);
        driver.findElement(firstname).sendKeys(name);

    }


    @Step(
            name ="fullfill lastname",
            description = "Trage nachname ein"
    )

    public void fillLastnameField() throws InterruptedException {

        driver.findElement(lastname).sendKeys(name);

    }

    @Step(
            name ="fullfill email",
            description = "Trage email ein"
    )

    public void fillEmailField() throws InterruptedException {

        driver.findElement(email).sendKeys(emailfield);

    }

    @Step(
            name ="fullfill email confirm",
            description = "Trage email Bestätigen ein"
    )

    public void fillEmailConfirmField() throws InterruptedException {

        driver.findElement(emailconfirm).sendKeys(emailfield);

    }

    @Step(
            name ="cancel order",
            description = "Abbruch der Bestellung"
    )

    public void cancel() throws InterruptedException {

        driver.findElement(cancel).click();

    }


}