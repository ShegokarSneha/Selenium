package upCasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverStart {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("****** Chrome Started *******");
		String title = driver.getTitle();
		System.out.println("\nCurrent Page Title : "+title);
		String url = driver.getCurrentUrl();
		System.out.println("Current Page Url :"+url);
//		String pageSource = driver.getPageSource();
//		System.out.println("Current Page Source : " + pageSource);
		Thread.sleep(2000);
		System.out.println("\n****** Chrome Closed *******");
		driver.close();
	}

}
