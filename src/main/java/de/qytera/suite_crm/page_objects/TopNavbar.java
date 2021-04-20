package de.qytera.suite_crm.page_objects;

import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.suite_crm.SuiteCRMTestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

import javax.inject.Singleton;


@Singleton
public class TopNavbar extends SuiteCRMTestContext {
    String profileButtonSelector = ".suitepicon.suitepicon-action-current-user";
    String profileMenuSelector = "ul[role='menu', aria-labelledby='dropdownMenu2']";
    String salesMenuSelector = "a#grouptab_0";
    String hamburgerMenuSelector = "div.navbar-header button.navbar-toggle";
    String mobileMenuItems = "ul.dropdown-menu.mobile_menu li[role='presentation']";
    String moduleButtonSelector = "#moduleTab_Contacts";
    String moduleLinksSelector = "#modulelinks ul.dropdown-menu li.mobile-current-actions ul.mobileCurrentTab li";

    @Step(name = "Click sales menu", description = "Click sales menu")
    public void clickSalesMenu() {
        WebElement menu = driver.findElement(By.cssSelector(salesMenuSelector));
        menu.click();
    }

    @Step(name = "Open mobile menu", description = "Open mobile menu")
    public void openMobileMenu() {
        WebElement we = driver.findElement(By.cssSelector(hamburgerMenuSelector));
        we.click();
    }

    public List<WebElement> getMenuItems() {
        return driver.findElements(By.cssSelector(mobileMenuItems));
    }

    public List<WebElement> getModuleLinks() {
        return driver.findElements(By.cssSelector(moduleLinksSelector));
    }

    @Step(name = "Click contact menu item", description = "Click contact menu item")
    public void clickMobileContactsMenu() {
        WebElement we = this.getMenuItems().get(2);
        we.click();
    }

    @Step(name = "Click calls menu item", description = "Click calls menu item")
    public void clickMobileCallsMenu() {
        WebElement we = this.getMenuItems().get(11);
        we.click();
    }

    @Step(name = "Click calendar menu item", description = "Click calendar menu item")
    public void clickMobileCalendarMenu() {
        WebElement we = this.getMenuItems().get(6);
        we.click();
    }

    @Step(name = "Click contact menu item", description = "Click contact menu item")
    public void clickHomeMenuFromNotHomePage() {
        WebElement we = this.getMenuItems().get(1);
        we.click();
    }

    @Step(name = "Click module button", description = "Click module button")
    public void clickModuleButton() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement we = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector(moduleButtonSelector))
        );
        we.click();
    }

    @Step(name = "Click profile button", description = "Click profile button")
    public void clickProfileButton() {
        WebElement we = driver.findElement(By.id(profileButtonSelector));
        we.click();
    }

    @Step(name = "Click profile link", description = "Click profile link")
    public void clickProfileLink() {
        WebElement profileMenu = driver.findElement(By.cssSelector(profileMenuSelector));
        List<WebElement> lis = profileMenu.findElements(By.tagName("li"));
        WebElement link = lis.get(0).findElement(By.tagName("a"));
        link.click();
    }
}
