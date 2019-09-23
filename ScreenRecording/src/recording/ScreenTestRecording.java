package recording;

import static org.testng.Assert.assertEquals;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class ScreenTestRecording {
	WebDriver driver;
	ATUTestRecorder recorder;
	
	@BeforeTest
	public void setupDriver() throws ATUTestRecorderException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Date date = new Date();
		recorder = new ATUTestRecorder("./test-result/", "Recording_"+date, false);
		recorder.start();
	}
	
	@Test
	public void executingTest() {
		driver.get("https://www.google.com");
		System.out.println("Chrome is opening the Url:");
		String actual = driver.getTitle();
		System.out.println("Actual Title : "+ driver.getTitle());
		String expected = "Google";
		System.out.println("Expected Title : "+ expected);
		assertEquals(actual, expected);
		Reporter.log("Google Site is open");
		System.out.println("Google Opens Sucessfully");
	}
	
	@AfterTest
	public void endTest() throws ATUTestRecorderException, InterruptedException {
		driver.close();
		Thread.sleep(1000);
		recorder.stop();
	}

}
