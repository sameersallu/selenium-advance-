package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readfromexcelusingdataformat {

	
	public static void main(String[] args) throws IOException {
FileInputStream fil= new FileInputStream("./src/test/resources/Task03_credentials_manasatirumalasetty.xlsx");

		
		Workbook wb = WorkbookFactory.create(fil);
		 DataFormatter df = new DataFormatter();
		 String data = df.formatCellValue(wb.getSheet("Sheet1").getRow(2).getCell(1));
		System.out.println(data);
		wb.close();
	}
}
