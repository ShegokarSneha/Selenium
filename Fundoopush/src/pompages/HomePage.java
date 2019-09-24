
/**
 * Description : HomePage.java init all webelements and Contains the Methods
 * Author      : Sneha Shegokar
 * Date        : 20/09/2019
 */

package pompages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class HomePage {
	// plus-div
	@FindBy(xpath = "/html/body/app-root/app-dashboard/app-article/div/div[3]/div/mat-icon")
	private WebElement ClickAdd;

	@FindBy(xpath = "//button[contains(text(),'ADD STORY')]")
	private WebElement AddSTORY;

//	@FindBy(id = "mat-input-3")
//	private WebElement ClickRedirectLink;
	
	@FindBy(id = "/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-edit-post-terminal[1]/div[1]/div[2]/div[1]/textarea[1]")
	private WebElement ClickRedirectLink;
	
	
	@FindBy(xpath = "//div[@class='cdk-overlay-container']//img[1]")
	private WebElement camera;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[4]/div[1]/mat-dialog-container[1]/app-upload-image-dialog[1]/div[1]/div[3]/div[2]/img[1]")
	private WebElement cropper;
	
	@FindBy(xpath = "//div[@class='move']")
	private WebElement square;
	
	@FindBy(xpath = "//div[@class='bottom-button']//button[@class='upload-button mat-raised-button']")
	private WebElement next;

	@FindBy(xpath = "//span[contains(text(),'Post')]")
	private WebElement Postbtn;

	// constructor
	public HomePage(WebDriver driver) {
		// Initialization
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public void ClickAddbtn() {
		ClickAdd.click();
	}

	public void ClickAddStory() {
		AddSTORY.click();
	}

	public void ClickRedirectLink() {
		ClickRedirectLink.sendKeys("https://www.bbc.com/news/world-us-canada-49173804");
	}
	
	public void clickCamera() {
		camera.click();
	}
	
	public static void uploadImage(String fileLocation) {
		try {
			StringSelection stringSelection = new StringSelection(fileLocation);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			// native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public WebElement getSquare() {
		return square;
	}
	
	public void clickCropper() {
		cropper.click();
	}
	
	public void clickNext() {
		next.click();
	}

	public void ClickPost() {
		Postbtn.click();
	}

}
