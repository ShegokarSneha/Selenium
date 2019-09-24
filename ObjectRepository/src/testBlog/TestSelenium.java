package testBlog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium {
	WebDriver driver;
	ConfigReader reader;

	@BeforeTest
	public void setupTest() {
		reader = new ConfigReader();
		System.setProperty("webdriver.chrome.driver", reader.getChromePath());
	}

	@Test
	public void testChrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(reader.getApplicationUrl());
		driver.close();
	}
}
