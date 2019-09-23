package mouseMovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin1/eclipse-workspace/Selenium/driver/chromedriver");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		Thread.sleep(2000);
		driver.close();
	}
}
