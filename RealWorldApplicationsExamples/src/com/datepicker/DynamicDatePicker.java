package com.datepicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//span[1]/span[@class='rsdc-cell rsdc-day']
public class DynamicDatePicker {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.tripadvisor.in/");
		driver.findElement(By.xpath(
				"//a[@class='brand-quick-links-QuickLinkTileItem__link--1k5lE']//span[contains(text(),'Flights')]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"))
				.click();
		String date = "5-December 2019";
		String split[] = date.split("-");
		String monthyear = split[1];
		String day = split[0];
		System.out.println(monthyear);
		System.out.println(day);
		selectDate(monthyear, day);
//		System.out.println("hi");
//		boolean value = driver.findElement(By.xpath(
//				"/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")).isSelected();
//		if(value) {
//		System.out.println("hello");
//		String returndate = "11-December 2019";
//		String spliter[] = returndate.split("-");
//		String returnmonthyear = spliter[1];
//		String returnday = spliter[0];
//		System.out.println(returnmonthyear);
//		System.out.println(returnday);
//		selectDate(returnmonthyear, returnday);
//		}
		Thread.sleep(2000);
		driver.close();
	}

	public static void selectDate(String monthyear, String day) throws InterruptedException {
		List<WebElement> element = driver.findElements(By.xpath("//div[contains(@class,'rsdc-months')]/span/span[1]"));
		if (element.get(0).getText().equals(monthyear)) {
			for (int i = 0; i < element.size(); i++) {
				System.out.println("Element " + element.get(i).getText());
				if (element.get(i).getText().equals(monthyear)) {
					List<WebElement> daylist = driver
							.findElements(By.xpath("//span[" + i + 1 + "]/span[@class='rsdc-cell rsdc-day']"));
					for (WebElement dayclick : daylist) {
						if (dayclick.getText().equals(day)) {
							dayclick.click();
							System.out
									.println("Selected Date : " + dayclick.getText() + " " + element.get(i).getText());
							return;
						}
					}
				}
			}
		} else {
			driver.findElement(By.xpath("//div[contains(@class,'rsdc-next rsdc-nav ui_icon single-chevron-right')]"))
					.click();
			Thread.sleep(1000);
			selectDate(monthyear, day);
		}
	}
}
