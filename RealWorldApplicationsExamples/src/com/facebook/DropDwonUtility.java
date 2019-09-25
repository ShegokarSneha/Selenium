package com.facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDwonUtility {
	
	WebDriver driver;
	
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
	}
	
	public void selectDayByIndex() {
		WebElement day = driver.findElement(By.id("day"));
		Select daylist = new Select(day);
		daylist.selectByIndex(20);
	}
	
	public void selectDayByValue() {
		WebElement day = driver.findElement(By.id("day"));
		Select daylist = new Select(day);
		daylist.selectByValue("20");
	}
	
	public void selectDayByVisibleText() {
		WebElement day = driver.findElement(By.id("day"));
		Select daylist = new Select(day);
		daylist.selectByVisibleText("30");
	}
	
	public void selectMonthByIndex() {
		WebElement day = driver.findElement(By.id("month"));
		Select monthlist = new Select(day);
		monthlist.selectByIndex(12);
	}
	
	public void selectMonthByValue() {
		WebElement day = driver.findElement(By.id("month"));
		Select monthlist = new Select(day);
		monthlist.selectByValue("10");
	}
	
	public void selectMonthByVisibleText() {
		WebElement day = driver.findElement(By.id("month"));
		Select monthlist = new Select(day);
		monthlist.selectByVisibleText("Oct");
	}
	
	public void selectYearByIndex() {
		WebElement day = driver.findElement(By.id("year"));
		Select yearlist = new Select(day);
		yearlist.selectByIndex(15);
	}
	
	public void selectYearByValue() {
		WebElement day = driver.findElement(By.id("year"));
		Select yearlist = new Select(day);
		yearlist.selectByValue("2001");
	}
	
	public void selectYearByVisibleText() {
		WebElement day = driver.findElement(By.id("year"));
		Select yearlist = new Select(day);
		yearlist.selectByVisibleText("1995");
	}
	
	public void withoutSelect() {
		WebElement date = driver.findElement(By.id("day"));
		date.click();
		List<WebElement> dates = driver.findElements(By.cssSelector("#day > option"));
		for(WebElement day : dates) {
			if(day.getText().equals("20")) {
				day.click();
				break;
			}
		}
	}
	
	public void closeApplication() {
		driver.close();
	}

}
