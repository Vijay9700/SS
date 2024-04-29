package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	
	public String readProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata/DWS.properties");
		Properties prob=new Properties();
		prob.load(fis);
		String data = prob.getProperty(key);
		return data;
	}

}
