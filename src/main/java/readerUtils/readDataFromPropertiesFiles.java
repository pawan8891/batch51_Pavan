package readerUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readDataFromPropertiesFiles {
	
	public static String readDataFromORProperties(String path,String keyData) throws IOException
	{
		String rootDirectory=System.getProperty("user.dir");
		File file=new File(rootDirectory+path);
		FileInputStream input=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(input);
		String keyValue=prop.getProperty(keyData);
		return keyValue;
	}

}

