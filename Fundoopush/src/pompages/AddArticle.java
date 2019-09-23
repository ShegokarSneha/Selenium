package pompages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class AddArticle {

	@FindBy(xpath = "/html/body/app-root/app-dashboard/app-article/div/div[3]/div/mat-icon")
	private WebElement add;

	@FindBy(xpath = "//button[contains(text(),'ADD ARTICLE')]")
	private WebElement AddArticle;

	@FindBy(xpath = "/html/body/app-root/app-add-article-dialog/div/div/div[1]/div[2]/img")
	private WebElement uploadimage;

	@FindBy(xpath = "//textarea[@placeholder='Title']")
	private WebElement title;

	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	private WebElement description;

	@FindBy(xpath = "//img[@class='addMedia']")
	private WebElement AddMedia;

	@FindBy(xpath = "//span[contains(text(),'video')]")
	private WebElement uploadvideo;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-add-article-dialog[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	private WebElement videolink;

	@FindBy(xpath = "//input[@id='mat-input-3']")
	private WebElement RedirectLink;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	private WebElement redirectdone;

	@FindBy(xpath = "/html/body/app-root/app-add-article-dialog/div/div/div[2]/i")
	private WebElement upload;

	@FindBy(xpath = "//div[4]//img[1]")
	private WebElement clickRedirect;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	private WebElement videoDone;

	public AddArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickAdd() {
		add.click();
	}

	public void clickAddArticle() {
		AddArticle.click();
	}

	public void addTitle() {
		title.sendKeys("BBC News");
	}

	public void addDescription() {
		description.sendKeys("Redirect Link For BBC News");
	}

	public void clickAddImage() {
		uploadimage.click();
	}

	public void addMedia() {
		AddMedia.click();
	}

	public void clickLink() {
		clickRedirect.click();
	}

	public void addLink() {
		RedirectLink.sendKeys("https://www.bbc.com/news/world-us-canada-49173804");
	}

	public void uploadRedirectLink() {
		redirectdone.click();
	}

	public void clickVideoLink() {
		uploadvideo.click();
	}

	public void AddvideoLink() {
		videolink.sendKeys("https://www.youtube.com/watch?v=vwOWrc2_HDI");
	}

	public void uploadVideoLink() {
		videoDone.click();
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

	public void uploadButton() {
		upload.click();
	}

}