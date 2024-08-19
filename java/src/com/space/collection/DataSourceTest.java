package com.space.collection;

import java.io.FileReader;
import java.util.Properties;

public class DataSourceTest {

	private static final String DRIVER, USERNAME;
	
	static {
		
		Properties properties = new Properties();
		
		try (FileReader fileReader 
				= new FileReader("src/app.properties")) {
			
			properties.load(fileReader);
			//properties.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
			//properties.setProperty("username", "space");
			
			//fileReader.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		DRIVER = properties.getProperty("driver");
		USERNAME = properties.getProperty("username");		
	}
	
	public static void main(String[] args) {
		
		System.out.println(DataSourceTest.DRIVER);
		System.out.println(DataSourceTest.USERNAME);
	}
}
















