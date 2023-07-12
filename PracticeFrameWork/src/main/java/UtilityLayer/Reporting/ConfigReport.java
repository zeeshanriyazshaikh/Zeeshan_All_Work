package UtilityLayer.Reporting;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReport {

	public static Properties readproperty(String fileName) throws IOException {
		fileName=fileName.trim();
		InputStream input = new FileInputStream(fileName);
		Properties property = new Properties();
		property.load(input);
		return property;
	}
}
