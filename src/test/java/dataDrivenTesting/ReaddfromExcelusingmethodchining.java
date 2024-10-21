package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddfromExcelusingmethodchining {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

FileInputStream fil= new FileInputStream("./src/test/resources/Task03_credentials_manasatirumalasetty.xlsx");

		
		Workbook wb = WorkbookFactory.create(fil);
		double data = wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(data);
		wb.close();
	}

}
