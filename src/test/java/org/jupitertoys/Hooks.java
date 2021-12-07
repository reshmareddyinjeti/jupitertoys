package org.jupitertoys;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.jupitertoys.driver.DriverFactory;

public class Hooks {
    //creating object for driverFactory
    private DriverFactory driverFactory = new DriverFactory();
    @Before
    //to set up the browser
    public void setUp() {
        //open browser
        driverFactory.openBrowser("chrome");
        //enter url
        driverFactory.setUrl("http://jupiter.cloud.planittesting.com/");
        //maximize browser
        driverFactory.maximize();
        //deleting cookies
        driverFactory.deleteCookies();
        //pageload timeout
        driverFactory.pageLoadTimeOut();
        //to wait for the each locator
        driverFactory.implicitWait();
    }

    @After
    //To close the browser
    public void tearDown() {
        //closing the browser
        driverFactory.closeBrowser();
    }
}


