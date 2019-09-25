package com.swiggy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarUtility {
	WebDriver driver;
	JavascriptExecutor javascript;
	
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
	}
	
	public void scrollByPixel() {
		javascript = (JavascriptExecutor) driver;
		javascript.executeScript("window.scrollBy(0,500)");
	}
	
	public void ScrollToVisibleElement() {
		javascript = (JavascriptExecutor) driver;
		WebElement visible = driver.findElement(By.xpath("//div[contains(text(),'Company')]"));
		javascript.executeScript("arguments[0].scrollIntoView();", visible);
	}
	
	public void ScrollToEnd() {
		javascript = (JavascriptExecutor) driver;
		javascript.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void closeApplication() {
		driver.close();
	}

}
