package keywordDriven;

import java.io.IOException;

public class KeywordRunner {

	public static void main(String[] args) throws IOException {
		KeywordUtil util = new KeywordUtil();
		String[][] data = util.fetchDataFromExcel();
		int row = data.length;
		int column = data[0].length;
		String TC_Name = data[0][0];
		String Step_No = data[0][1];
		String Step_Name = data[0][2];
		String function = data[0][3];
		String locator = data[0][4];
		String locator_vlue = data[0][5];
		String parameter = data[0][6];
		String execute = data[0][7];
		
		for(int counter = 1; counter < row; counter++) {
			String function_name = data[counter][3];
			String locatorby = data[counter][4];
			String locator_element = util.getProperty(data[counter][5]);
			String param = data[counter][6];
			
			System.out.println(function_name +"\t"+locatorby+"\t"+locator_element+"\t"+param);
			switch(function_name) {
			case "openApplication":
				util.openApplication();
				break;
				
			case "fillText":
				util.fillText(locatorby, locator_element, param);
				break;
				
			case "clickButton":
				util.clickButton(locatorby, locator_element);
			}
		}
		util.driverClose();

	}
	

}
