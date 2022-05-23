package de.qytera.webpage.page_objects;

import de.qytera.qtaf.core.QtafFactory;
import de.qytera.qtaf.core.config.entity.ConfigMap;
import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.webpage.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class QLoadPO extends TestContext {
    //public static final By emailaddressefield = By.xpath("//*[@id=\"exampleInputEmail1\"]");
    public static final By emailaddressefield = By.xpath("//input[@id='exampleInputEmail1']");
    String email =  "jane.doe";

    public static final By passwordfield = By.xpath("//*[@id=\"exampleInputPassword1\"]");
    String password = "Test_1234";

    public static final By submit = By.xpath("//button[@type='submit']");
//button[@type='submit']
    //input[@id='exampleInputEmail1']

    @Step(
            name = "Go to QLoad Login page",
            description = "Navigate to the QLoad Login page"
    )
    public void goToRootPage() {
        ConfigMap configMap = QtafFactory.getConfiguration();
        String url = configMap.getString("pageUrl","http://192.168.178.120:8081/app/index.html");
        System.out.println("Page URL: " + url);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Step(
            name ="insert Email address",
            description = "fill out email address"
    )
    public void emailAddressInsert(){
        driver.findElement(emailaddressefield).sendKeys(email);

    }

    @Step(
            name ="insert password",
            description = "fill out password"
    )
    public void passwordInsert(){


        driver.findElement(passwordfield).sendKeys(password);

    }

    @Step(
            name ="Select submit buttom",
            description = "click password"
    )

    public void submitClick() {

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //wait.until(ExpectedConditions.visibilityOfElementLocated(testautomatisation));
        driver.findElement(submit).click();
    }


}
