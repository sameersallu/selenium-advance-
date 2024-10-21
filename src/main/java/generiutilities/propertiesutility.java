package generiutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesutility {
	
	/** 
	 * the class contains reusable methods to read from properties file
	 * @author salman
	 */
	Properties property;
	/**
	 *this method is initilisation for properties file 
	 * @param filepath
	 */
	
	
	public void propertiesInit(String filepath)
	{
		FileInputStream fil=null;
		
		try {
			fil=new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		property = new Properties();
		
		try {
			property.load(fil);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	/**
	 * This method fetches data from properties file
	 * @param Key
	 * @return
	 */
	 public String getDataFromProperties(String Key)
	 {
		 return property.getProperty(Key);
	 }

	

}
