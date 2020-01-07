package com.ing.pensions.it.stepDefinitions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class EnvironmenStepConfiguration {

    public static WebDriver driver;

    @Before
    public void beforeScenarios() throws MalformedURLException {
        if (System.getProperty("os.name").startsWith("Windows ")) {
            // final String path =
            // EnvironmenStepConfiguration.class.getClassLoader().getResource("phantomjs.exe")
            // .getPath();
            // System.setProperty("phantomjs.binary.path", path);
            // driver = new PhantomJSDriver();

            System.setProperty("webdriver.chrome.driver",
                    EnvironmenStepConfiguration.class.getClassLoader().getResource("chromedriver.exe").getPath());
            final ChromeOptions chromeOpt = new ChromeOptions();
            chromeOpt.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200",
                    "--ignore-certificate-errors");

            driver = new ChromeDriver(chromeOpt);
        } else {
            // final DesiredCapabilities capabilities =
            // DesiredCapabilities.chrome();
            final ChromeOptions chromeOpt = new ChromeOptions();
            chromeOpt.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200",
                    "--ignore-certificate-errors");
            // capabilities.setBrowserName("chrome");
            // capabilities.setPlatform(Platform.LINUX);
            // capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOpt);
            System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/tools/chromedriver/chromedriver");

            driver = new ChromeDriver(chromeOpt);

            // driver = new RemoteWebDriver(new
            // URL("http://10.31.97.167:5566/wd/hub"), capabilities);
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void afterScenarios() {
        if (driver != null) {
            driver.quit();
        }
    }
}
