package de.qytera.webpage.page_objects;

import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.webpage.TestContext;
import org.openqa.selenium.By;


public class UpLoadPO extends TestContext {



    public static final By submit = By.xpath("//button[@type='submit']");


    @Step(
            name ="Upload Data",
            description = "using path for Data upload"
    )
    public void uploadJMeterProject(){
        driver.findElement(By.xpath("//input[@id='jmeterProjectFile']")).sendKeys((System.getProperty("user.dir") + "\\src\\main\\resources\\uploaddata\\example-project.jmx"));

    }

    @Step(
            name ="drag'nDrop",
            description = "using path for Data upload"
    )
    public void dragnDrop(){


        driver.findElement(By.xpath("//input[@id='resourceFiles']")).sendKeys((System.getProperty("user.dir") + "\\src\\main\\resources\\uploaddata\\4cee28e5new-Kopie.jpg"));

    }


    @Step(
            name ="Select submit buttom",
            description = "click submit buttom"
    )
    public void uploadClick() {

        driver.findElement(submit).click();
    }


}
