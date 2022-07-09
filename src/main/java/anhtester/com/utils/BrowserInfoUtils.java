/*
 * Copyright (c) 2022 Anh Tester
 * Automation Framework Selenium
 */

package anhtester.com.utils;

import org.testng.Reporter;

import static anhtester.com.constants.FrameworkConstants.BROWSER;

public final class BrowserInfoUtils {

    private BrowserInfoUtils() {
    }

    public static String getBrowserInfo() {
        String browser = "";
        if (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser") == null) {
            browser = BROWSER.toUpperCase();
        } else {
            browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser").trim().toUpperCase();
        }
        return browser;
    }

    public static String getOSInfo() {
        return System.getProperty("os.name").replace(" ", " ");
    }

}
