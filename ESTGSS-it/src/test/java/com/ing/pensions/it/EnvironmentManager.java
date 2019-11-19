package com.ing.pensions.it;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnvironmentManager {

    private static final String OS_WINDOWS = "windows";

    public static WebDriver initWebDriver() {

        if (System.getProperty("os.name").startsWith(OS_WINDOWS)) {
            System.setProperty("webdriver.gecko.driver",
                    EnvironmentManager.class.getResource("/geckodriver.exe").getPath());
        } else {
        }

        final WebDriver driver = new FirefoxDriver();

        return driver;
    }

}
