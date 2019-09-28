package com.filedownload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFile {

	public static void main(String[] args) {
//		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
		FirefoxProfile profile = new FirefoxProfile();

		// Set preferences for file type
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");

		// Open browser with profile
		FirefoxDriver driver = new FirefoxDriver(profile);

		// Set implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Maximize window
		driver.manage().window().maximize();

		// Open APP to download application
		driver.get("http://www.filehippo.com/download_adobe_reader");

		// Click on download
		driver.findElement(By.xpath(".//*[@id='program-header']/div[4]/a[1]")).click();

	}

}
