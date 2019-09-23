
/**
 * Description : IAutoConstant.java Interface Contains the Path of Config ,Excel and Drivers
 * Author      : Sneha Shegokar
 * Date        : 20/09/2019
 */

package generic;

public interface IAutoConstant {
	String CONFIG_PATH = "./config.properties";
	String EXCEL_PATH = "./testdata/data.xlsx";
	String GECKO_KEY = "webdriver.gecko.driver";
	String GECKO_VALUE = "driver/geckodriver";
	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_VALUE = "driver/chromedriver";
}