package de.qytera.webpage;

import de.qytera.qtaf.testng.context.QtafTestNGContext;
import de.qytera.webpage.page_objects.*;

import javax.inject.Inject;


public class TestContext extends QtafTestNGContext {


    @Inject
    protected QLoadPO qLoadPO;

    @Inject
    protected UpLoadQyteraWebsitePO upLoadQyteraWebsitePO;

    @Inject
    protected UpLoadSuiteCRMPO upLoadSuiteCRMPO;
}
