package de.qytera.webpage.tests;

import de.qytera.qtaf.core.config.annotations.TestFeature;
import de.qytera.webpage.TestContext;
import org.testng.annotations.Test;

import javax.inject.Singleton;
import java.io.IOException;

@TestFeature(
        name = "Calls form",
        description = "Create call form"
)
@Singleton
public class QyteraTest extends TestContext {
    @Test(groups = "unit", testName = "QTAF-754", description = "QLOAD WebPageTest")
    public void testCalls() throws InterruptedException,IOException {
        //Navigate to calls page
        qLoadPO.goToRootPage();
        qLoadPO.emailAddressInsert();
        qLoadPO.passwordInsert();
        qLoadPO.submitClick();

        upLoadQyteraWebsitePO.selectQyteraWebsiteInDropdown();
        upLoadQyteraWebsitePO.uploadJMeterProject();
        upLoadQyteraWebsitePO.dragnDrop();
        upLoadQyteraWebsitePO.verfiyDataOnAWSCloudforQyteraWebsite();
        upLoadQyteraWebsitePO.deleteDataOnAWSCloudforQyteraWebsite();
        upLoadQyteraWebsitePO.createEnviroment();
        upLoadQyteraWebsitePO.printResults();
        upLoadQyteraWebsitePO.destroyEnviroment();
        upLoadQyteraWebsitePO.uploadClick();

        upLoadSuiteCRMPO.selectSuiteCRMInDropdown();
        upLoadSuiteCRMPO.uploadJMeterProject();
        upLoadSuiteCRMPO.dragnDrop();
        upLoadSuiteCRMPO.verfiyDataOnAWSCloudforSuiteCRM();
        upLoadSuiteCRMPO.deleteDataOnAWSCloudforSuiteCRM();
        upLoadSuiteCRMPO.createEnviroment();
        upLoadSuiteCRMPO.printResults();
        upLoadSuiteCRMPO.destroyEnviroment();
        upLoadSuiteCRMPO.uploadClick();
    }
}
