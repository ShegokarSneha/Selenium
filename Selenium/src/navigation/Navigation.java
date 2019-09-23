package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("********** Navigation Program *******");
		System.setProperty("webdriver.gecko.driver", "/home/admin1/eclipse-workspace/Selenium/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Opening Google");
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		System.out.println("Navigate To BLZ Page");
		driver.navigate().to("https://www.bridgelabz.com/Home");
		Thread.sleep(2000);
		System.out.println("Navigate To Google Back");
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("Navigate To BLZ Page Again");
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println("Refreshing BLZ page");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	}

}