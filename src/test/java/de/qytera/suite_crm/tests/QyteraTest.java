package de.qytera.suite_crm.tests;

import de.qytera.qtaf.core.config.annotations.TestFeature;
import de.qytera.suite_crm.TestContext;
import org.testng.annotations.Test;

import javax.inject.Singleton;

@TestFeature(
        name = "Calls form",
        description = "Create call form"
)
@Singleton
public class QyteraTest extends TestContext {
    @Test(groups = "unit", testName = "QTAF-754", description = "Calls Test")
    public void testCalls() throws InterruptedException {
        //Navigate to calls page
        qyteraPO.goToRootPage();
        qyteraPO.acceptCoookieButton();
        qyteraPO.goToSolutions();
        qyteraPO.selectTestautomatisation();
        qyteraTestautomationPO.goToTestautomationTraining();
        qyteraTestautomationRegistrationOptionsPO.goToTestautomationRegistration();
        eventbritePO.acceptCoookieButton();
        eventbritePO.goToTestautomationTraining();
        eventbriteNumberOptionPO.eventbriteNumberOption();
        eventbriteRegisterPO.fillFirstnameField();
        eventbriteRegisterPO.fillLastnameField();
        eventbriteRegisterPO.fillEmailField();
        eventbriteRegisterPO.fillEmailConfirmField();
        eventbriteRegisterPO.cancel();
        cancelPO.cancel();
    }
}
