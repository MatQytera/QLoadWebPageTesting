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

import java.time.Duration;


public class QyteraPO extends TestContext {
    public static final By solutions = By.xpath("//a[contains(text(),'Lösungen')]");
    public static final By testautomatisation = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='nav-wrapper']/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]");



    @Step(
            name = "Go to Qytera main page",
            description = "Navigate to the Qytera home page"
    )
    public void goToRootPage() {
        ConfigMap configMap = QtafFactory.getConfiguration();
        String url = configMap.getString("pageUrl");
        System.out.println("Page URL: " + url);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Step(
            name ="Select Lösungen",
            description = "klick Lösungen"
    )
    public void goToSolutions(){

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(solutions);
        builder.moveToElement(element).build().perform();

        //driver.findElement(solutions).click();
    }

    @Step(
            name ="Select Testautomatisierung",
            description = "klick Testautomatisierung"
    )

    public void selectTestautomatisation() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(testautomatisation));
        driver.findElement(testautomatisation).click();
    }

}
