
/**
 * Description : Lib.java reads the Path of Excelsheet and Extract the Row and Column value
 * Author      : Sneha Shegokar
 * Date        : 20/09/2019
 */

package generic;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib {
	public static Workbook wb;

	public static String getProperty(String CONFIG_PATH, String key) {
		String property = "";
		Properties prop = new Properties();

		try {
			prop.load(new FileInputStream(CONFIG_PATH));
			property = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return property;
	}

//	public static int getRowCount(String EXCEL_PATH, String sheet) 
//	{
//		int rowCount = 0;
//		try 
//		{
//			wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
//			rowCount = wb.getSheet(sheet).getLastRowNum();
//		} catch (Exception e) 
//		{
//			e.printStackTrace();
//		}
//		return rowCount;
//	}

	public static String getCellValue(String EXCEL_PATH, String sheet, int row, int column) {
		String value = "";
		try {
			wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			value = wb.getSheet(sheet).getRow(row).getCell(column).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}
