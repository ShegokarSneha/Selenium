package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/eclipse-workspace/Selenium/driver/chromedriver");
		Date date = new Date();
//		String sdate = date.toString();
//		System.out.println("Simple Date is "+sdate);
		System.out.println("********* TakeScreenShot Method Program ********");
//		String rdate = date.toString().replaceAll(":", "_");
		System.out.println("Replaced Date is "+date);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bridgelabz.com/Home");
		String title = driver.getTitle();
		System.out.println("Current Page Title : "+title);
		String url = driver.getCurrentUrl();
		System.out.println("Current Page Url :"+url);
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File shot = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = 	new File("/home/admin1/eclipse-workspace/Selenium/ScreenShot/"+date+"_BLZPage.png");
		FileUtils.copyFile(shot, destination);
		Thread.sleep(1000);
		driver.close();

	}

}