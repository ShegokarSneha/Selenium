package com.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://redbus.in/");
		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]/tbody/tr[7]/td[6]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
