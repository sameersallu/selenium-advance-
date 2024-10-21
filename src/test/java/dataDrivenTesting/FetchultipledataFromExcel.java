package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchultipledataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fil= new FileInputStream("./src/test/resources/Task03_credentials_manasatirumalasetty.xlsx");

	
	 Workbook wb = WorkbookFactory.create(fil);
	 Sheet sheet = wb.getSheet("Sheet1");
	DataFormatter df = new DataFormatter();
	List<String> list=new ArrayList<String>();
	for(int i=0;i<=sheet.getLastRowNum();i++)
	{
		 String data = df.formatCellValue(sheet.getRow(i).getCell(1));
	list.add(data);
	}
	System.out.println(list);
	wb.getSheet("Sheet1");
}
}