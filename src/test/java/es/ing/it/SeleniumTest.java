package es.ing.it;

import java.net.MalformedURLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import es.ing.example.SeleniumConfiguration;

/**
 * Unit test for simple App.
 */
public class SeleniumTest {

	static WebDriver driver;

	@BeforeEach
	public void init() throws MalformedURLException {
		driver = SeleniumConfiguration.returnDriver();
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
