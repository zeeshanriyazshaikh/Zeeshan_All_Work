package KhansaCommonLibs.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {

	
	public static Properties readProperties(String filename) throws IOException {
		
		filename=filename.trim();
		InputStream ip = new FileInputStream(filename);
		
		Properties prop = new Properties();
		
		prop.load(ip);
		
		return prop;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
