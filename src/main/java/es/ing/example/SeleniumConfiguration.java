package es.ing.example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumConfiguration {

	public static WebDriver returnDriver() throws MalformedURLException {
		final DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		return new RemoteWebDriver(new URL("http://172.10.3.83:5566/wd/hub"), capabilities);
	}
}
