package com.bSel.unique.BrowserPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by beatriceotugo on 24/10/2017.
 */
    public class BrowserManager {


        private WebDriver driver;

        public WebDriver maximizeBrowserAndDrivers() {
            String chromePath = System.getProperty("user.dir") + "/Drivers/chrome/chromedriver";
            System.setProperty("webdriver.chrome.driver", chromePath);

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            this.driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;

        }

        public void visitURL(String URL){
            driver.navigate().to(URL);
        }


        public void quitBrowser() {
            if(driver!= null) {
                driver.quit();
            }
        }
    }

