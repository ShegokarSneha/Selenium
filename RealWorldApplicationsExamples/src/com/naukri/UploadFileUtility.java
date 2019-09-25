package com.naukri;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileUtility {

	WebDriver driver;

	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.naukri.com/account/createaccount");
	}

	public void clickFresher() {
		driver.findElement(By.xpath("//button[contains(text(),'I am a Fresher')]")).click();
	}

	public void uploadFile(String filelocation) {
		driver.findElement(By.name("uploadCV")).click();
		StringSelection stringSelection = new StringSelection(filelocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		// native key strokes for CTRL, V and ENTER keys
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickCopy() {
		driver.findElement(By.xpath("//a[contains(text(),'copy-paste your resume here')]")).click();
	}

	public void closeApplication() {
		driver.close();
	}

}
