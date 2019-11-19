package com.ing.pensions.it;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumTest {

    static WebDriver            driver;
    private static final String OS_WINDOWS = "windows";

    @BeforeEach
    public void init() throws MalformedURLException {

        final DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        if (System.getProperty("os.name").startsWith(OS_WINDOWS)) {
            capabilities.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL("http://10.116.80.79:5566/wd/hub"), capabilities);
        } else {
            capabilities.setPlatform(Platform.LINUX);
            driver = new RemoteWebDriver(new URL("http://10.116.80.79:5567/wd/hub"), capabilities);
        }
    }

    @AfterEach
    public void end() {
        driver.quit();
    }

    @Test
    public void test() {
        driver.get("https://www.blazemeter.com/selenium");
        final String url = driver.getCurrentUrl();
        Assertions.assertEquals(url, "https://www.blazemeter.com/selenium/");
    }

}
