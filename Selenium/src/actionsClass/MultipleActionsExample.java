package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleActionsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Wait For Page To Load
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize Window
		driver.manage().window().maximize();

		// Go to URL
		driver.get("http://www.facebook.com/");

		// get the reference for Web Element Email
		WebElement userName = driver.findElement(By.id("email"));

		// Handling Multiple Actions
		Actions action = new Actions(driver);
		action.moveToElement(userName).click().keyDown(userName, Keys.SHIFT).sendKeys(userName, "hello");
		Thread.sleep(1000);
		Action seriesOfActions = action.keyUp(userName, Keys.SHIFT).build();
		Thread.sleep(1000);
		seriesOfActions.perform();
		Thread.sleep(1000);

		// Closing current driver window
		driver.close();
	}
}
