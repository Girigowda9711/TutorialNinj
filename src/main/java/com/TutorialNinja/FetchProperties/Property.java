package com.TutorialNinja.FetchProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {
	static Properties prop;
	
	public static String getData(String key) {
		FileInputStream fis=null;
		 prop=new Properties();
		try {
			 fis=new FileInputStream(ProjectConstant.PROPERTY_FILE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return prop.getProperty(key);
	}
	
	
	
	

}
