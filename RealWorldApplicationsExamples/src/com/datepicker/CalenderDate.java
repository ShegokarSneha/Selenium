package com.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
//		driver.findElement(By.name("checkin")).click();
//		Thread.sleep(1000);
		driver.close();
		

	}

}
