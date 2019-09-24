package testBlog;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	Properties prop;

	public ConfigReader() {
		File source = new File("./config.properties");
		FileInputStream file;
		try {
			file = new FileInputStream(source);
			prop = new Properties();
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getChromePath() {
		String path = prop.getProperty("ChromeDriver");
		return path;
	}
	
	public String getApplicationUrl() {
		String url = prop.getProperty("URL");
		return url;
	}

}
