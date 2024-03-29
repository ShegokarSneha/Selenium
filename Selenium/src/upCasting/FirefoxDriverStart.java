package upCasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverStart {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "/home/admin1/eclipse-workspace/Selenium/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println("****** FireFox Started *******");
		String title = driver.getTitle();
		System.out.println("\nCurrent Page Title : "+title);
		String url = driver.getCurrentUrl();
		System.out.println("Current Page Url :"+url);
//		String pageSource = driver.getPageSource();
//		System.out.println("Current Page Source : " + pageSource);
		Thread.sleep(2000);
		System.out.println("\n****** FireFox Closed *******");
		driver.close();
	}
	}
