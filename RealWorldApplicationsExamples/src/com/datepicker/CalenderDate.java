package com.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String datevalue = "30/12";
		selectDateByJavaScript(driver, date, datevalue);
		Thread.sleep(3000);
		driver.close();
	}
	
	public static void selectDateByJavaScript(WebDriver driver, WebElement date, String datevalue) {
		JavascriptExecutor java  = (JavascriptExecutor)driver;
		java.executeScript("arguments[0].setAttribute('value','"+datevalue+"');", date);
	}

}
