package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
//		WebElement dropdown = driver.findElement(By.id("day"));
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Database Testing");
		Thread.sleep(2000);
		driver.close();
		

	}

}