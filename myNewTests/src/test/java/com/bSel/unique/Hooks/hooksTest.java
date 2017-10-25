package com.bSel.unique.Hooks;

import com.bSel.unique.BrowserPage.BrowserManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

/**
 * Created by beatriceotugo on 24/10/2017.
 */
public class hooksTest {

    protected WebDriver driver;
    protected BrowserManager browserManager = new BrowserManager();


    @Before
    public void setUp() {
        this.driver = browserManager.maximizeBrowserAndDrivers();
    }


    @After
    public void cleanUp() {
        browserManager.quitBrowser();
    }
}

