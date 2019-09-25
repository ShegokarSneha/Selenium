package com.facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericSelect {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		String elementdate = "//select[@id='day']";
		String dateoption = "#day > option";
		String datevalue = "20";
		Thread.sleep(3000);
		genericDropDown(elementdate, dateoption, datevalue);
		Thread.sleep(3000);
		String monthelement = "//select[@id='month']";
		String monthoption = "#month > option";
		String monthvalue = "Oct";
		genericDropDown(monthelement, monthoption, monthvalue);
		Thread.sleep(3000);
		String yearelement = "//select[@id='year']";
		String yearoption = "#year > option";
		String yearvalue = "1995";
		genericDropDown(yearelement, yearoption, yearvalue);
		Thread.sleep(3000);
		driver.close();
		

	}
	
	public static void genericDropDown(String element, String option, String value) throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath(element));
		dropdown.click();
		List<WebElement> droplist = driver.findElements(By.cssSelector(option));
		for(WebElement drop : droplist) {
			if(drop.getText().equals(value)) {
				drop.click();
				break;
			}
		}
	}

}
