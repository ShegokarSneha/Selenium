
package scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.AddArticle;
import pompages.HomePage;
import pompages.LoginPage;

@Test
public class TestFundoopush extends BaseTest {
	@SuppressWarnings("static-access")
	public void TestFundoo() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		HomePage HP = new HomePage(driver);
		AddArticle article = new AddArticle(driver);
		String filelocation = "/home/admin1/Downloads/loginfundoo.jpg";

		// Username - 1st Row and 0th Column value
		String un = Lib.getCellValue(EXCEL_PATH, "Sheet1", 1, 0);

		// Password - 1st Row and 1st Column value
		String pw = Lib.getCellValue(EXCEL_PATH, "Sheet1", 1, 1);

		// Calling Methods of LoginPage
		LP.setUsername(un);
		Thread.sleep(1000);
		LP.setPassword(pw);
		Thread.sleep(500);
		LP.clickLogin();
		Thread.sleep(5000);

		// Calling Methods of Homepage
		HP.ClickAddbtn();
		Thread.sleep(2000);
		HP.ClickAddStory();
		Thread.sleep(1000);
		HP.clickCamera();
		Thread.sleep(1000);
		HP.uploadImage(filelocation);
		Thread.sleep(2000);
		HP.clickCropper();
		Thread.sleep(2000);
		int x = HP.getSquare().getLocation().getX();
		int y = HP.getSquare().getLocation().getY();
		System.out.println("X :"+x +" Y :" +y);
		Actions action = new Actions(driver);
		action.clickAndHold(HP.getSquare()).moveByOffset(480, 100).release().build().perform();
		Thread.sleep(2000);
		HP.clickNext();
		Thread.sleep(2000);
		HP.ClickRedirectLink();
		Thread.sleep(10000);
		HP.ClickPost();
		Thread.sleep(10000);
		
		
//		article.clickAdd();
//		Thread.sleep(1000);
//		article.clickAddArticle();
//		Thread.sleep(1000);
//		article.addTitle();
//		Thread.sleep(1000);
//		article.addMedia();
//		Thread.sleep(1000);
//		article.clickLink();
//		Thread.sleep(1000);
//		article.addLink();
//		Thread.sleep(2000);
//		article.uploadRedirectLink();
//		Thread.sleep(1000);
//		article.clickVideoLink();
//		Thread.sleep(1000);
//		article.AddvideoLink();
//		Thread.sleep(1000);
//		article.uploadVideoLink();
//		Thread.sleep(1000);
//		article.addDescription();
//		Thread.sleep(2000);
//		article.clickAddImage();
//		Thread.sleep(1000);
//		article.uploadImage(filelocation);
//		Thread.sleep(2000);
//		article.clickCropper();
//		Thread.sleep(1000);
//		article.uploadButton();
//		Thread.sleep(5000);
	}
}
