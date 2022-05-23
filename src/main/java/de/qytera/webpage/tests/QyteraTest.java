package de.qytera.webpage.tests;

import de.qytera.qtaf.core.config.annotations.TestFeature;
import de.qytera.webpage.TestContext;
import org.testng.annotations.Test;

import javax.inject.Singleton;

@TestFeature(
        name = "Calls form",
        description = "Create call form"
)
@Singleton
public class QyteraTest extends TestContext {
    @Test(groups = "unit", testName = "QTAF-754", description = "QLOAD WebPageTest")
    public void testCalls() throws InterruptedException {
        //Navigate to calls page
        qLoadPO.goToRootPage();
        qLoadPO.emailAddressInsert();
        qLoadPO.passwordInsert();
        qLoadPO.submitClick();
        upLoadPO.uploadJMeterProject();
        upLoadPO.dragnDrop();
        upLoadPO.uploadClick();
    }
}
