package popupHandling;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	public static String getProperty(String filepath, String key) {
		String property = "";
		Properties prop = new Properties();

		try {
			prop.load(new FileInputStream(filepath));
			property = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return property;
	}

}
