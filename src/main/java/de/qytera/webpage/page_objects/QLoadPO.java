package de.qytera.webpage.page_objects;

import de.qytera.qtaf.core.QtafFactory;
import de.qytera.qtaf.core.config.entity.ConfigMap;
import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.webpage.TestContext;
import org.openqa.selenium.By;


public class QLoadPO extends TestContext {

    public static final By emailaddressefield = By.xpath("//input[@id='exampleInputEmail1']");
    String email =  "jane.doe";

    public static final By passwordfield = By.xpath("//*[@id=\"exampleInputPassword1\"]");
    String password = "Test_1234";

    public static final By submit = By.xpath("//button[@type='submit']");


    @Step(
            name = "Go to QLoad Login page",
            description = "Navigate to the QLoad Login page"
    )
    public void goToRootPage() {
        ConfigMap configMap = QtafFactory.getConfiguration();
        String url = configMap.getString("pageUrl","http://qload-api.eba-9gsnxmph.eu-central-1.elasticbeanstalk.com/");
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

        driver.findElement(submit).click();
    }


}
