package de.qytera.webpage;

import de.qytera.qtaf.testng.context.QtafTestNGContext;
import de.qytera.webpage.page_objects.*;
import foo.PageObject;

import javax.inject.Inject;

@PageObject
public class TestContext extends QtafTestNGContext {


    @Inject
    protected QyteraPO qyteraPO;

    @Inject
    protected QyteraTestautomationPO qyteraTestautomationPO;

    /*@Inject
    protected QyteraTestmanagmentPO qyteraTestmanagmentPO;
*/
    @Inject
    protected QyteraTestautomationRegistrationOptionsPO qyteraTestautomationRegistrationOptionsPO;

    @Inject
    protected  EventbritePO eventbritePO;

    @Inject
    protected  EventbriteNumberOptionPO eventbriteNumberOptionPO;

    @Inject
    protected  EventbriteRegisterPO eventbriteRegisterPO;

    @Inject
    protected  CancelPO cancelPO;

}
