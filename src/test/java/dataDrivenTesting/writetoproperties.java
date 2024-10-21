package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writetoproperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("./src/test/resources/data.properties");
		Properties property = new Properties();
		property.load(file);
		
		property.put("browser2", "edge");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/data.properties");
		property.store(fos, "updated successfully");

	}

}
