package popupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		String filepath = "./Facebook.properties";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
		String url = PropertyFile.getProperty(filepath, "Url");
		driver.get(url);
		String email = PropertyFile.getProperty(filepath, "Email");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		String password = PropertyFile.getProperty(filepath, "Password");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}