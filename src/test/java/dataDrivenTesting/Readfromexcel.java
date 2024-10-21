package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readfromexcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fil= new FileInputStream("/src/test/resources/Task03_credentials_manasatirumalasetty.xlsx");

		
		Workbook wb = WorkbookFactory.create(fil);
		wb.getSheet("Sheet1");
	}

}
