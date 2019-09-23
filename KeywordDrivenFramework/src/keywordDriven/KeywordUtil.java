package keywordDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordUtil {
	WebDriver driver;

	public String[][] fetchDataFromExcel() throws IOException {
		 Workbook wb;
		String[][] data = null;
		String path = getProperty("KEYWORD_PATH");
		File excel = new File(path);
		FileInputStream file = new FileInputStream(excel);
		System.out.println("File Path :" + path);
		String extension = path.substring(path.indexOf(".") + 1);
		System.out.println(extension);
		if (extension.equals("xlsx")) {
			wb = new XSSFWorkbook(file);
		} 
		else {
			wb = new HSSFWorkbook(file);
		}
		Sheet sheet = wb.getSheet("Sheet1");
		int rownum = sheet.getLastRowNum();
		System.out.println("Row Count :" + rownum);
		int column = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count : " + column);
		data = new String[rownum][column];
		for (int i = 0; i < rownum; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < column; j++) {
				Cell cell = row.getCell(j);
				String value = cell.toString();
				data[i][j] = value;
			}
		}
		return data;
	}

	public String getProperty(String text) {
		Properties prop = new Properties();
		FileInputStream input;
		try {
			input = new FileInputStream(System.getProperty("user.dir")+"/Keyword.properties");
			prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(text);
	}

	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getProperty("URL"));
	}

	public void fillText(String locator, String locatorvalue, String text) {
		switch (locator) {

		case "xpath":
			driver.findElement(By.xpath(locatorvalue)).sendKeys(text);
			break;

		case "name":
			driver.findElement(By.name(locatorvalue)).sendKeys(text);
			break;

		case "id":
			driver.findElement(By.id(locatorvalue)).sendKeys(text);
			break;
		}
	}

	public void clickButton(String locator, String locatorvalue) {

		switch (locator) {

		case "xpath":
			driver.findElement(By.xpath(locatorvalue)).click();
			break;

		case "name":
			driver.findElement(By.name(locatorvalue)).click();
			break;

		case "id":
			driver.findElement(By.id(locatorvalue)).click();
			break;
		}
	}

	public void driverClose() {
		driver.close();
	}
}
