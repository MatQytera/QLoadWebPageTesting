package de.qytera.suite_crm.page_objects;

import de.qytera.qtaf.core.QtafFactory;
import de.qytera.qtaf.core.config.entity.ConfigMap;
import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.suite_crm.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;


public class QyteraPO extends TestContext {
    public static final By solutions = By.xpath("//a[contains(text(),'Lösungen')]");
    public static final By testautomatisation = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='nav-wrapper']/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    public static final By cookieAcceptButton = By.xpath("//button[contains(text(),'OK')]");


    @Step(
            name = "Go to Qytera main page",
            description = "Navigate to the Qytera home page"
    )
    public void goToRootPage() {
        ConfigMap configMap = QtafFactory.getConfiguration();
        String url = configMap.getString("pageUrl", "https://www.qytera.de");
        System.out.println("Page URL: " + url);
        driver.get(url);
        //driver.manage().window().maximize();
    }

    @Step(
            name ="Select Lösungen",
            description = "klick Lösungen"
    )
    public void goToSolutions(){

        driver.findElement(solutions).isDisplayed();
    }

    @Step(
            name ="Select Testautomatisierung",
            description = "klick Testautomatisierung"
    )

    public void selectTestautomatisation() {

       driver.get("https://www.qytera.de/testing-solutions/testautomatisierung");
       
    }
    
     @Step(
            name="Accept Cookies",
            description = "Akzeptiere die cookies"
    )
    public void acceptCoookieButton(){
        try {
            driver.findElement(cookieAcceptButton).click();
        }
        catch (Exception e){}

    }

}
