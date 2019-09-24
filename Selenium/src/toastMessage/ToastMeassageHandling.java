package toastMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToastMeassageHandling {
	
	@Test
	public void testToastMessage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://codeseven.github.io/toastr/demo.html");
		driver.findElement(By.id("title")).sendKeys("Hello");
		driver.findElement(By.id("message")).sendKeys("Selenium");
		driver.findElement(By.id("showtoast")).click();
		String toasttitle = driver.findElement(By.xpath("//div[@class='toast-title']")).getText();
		String message = driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
		System.out.println("Toast Title : "+toasttitle );
		System.out.println("Toast Message :"+message);
		Assert.assertEquals(toasttitle, "Hello");
		Assert.assertEquals(message, "Selenium");
		Thread.sleep(1000);
		driver.close();
	}

}
