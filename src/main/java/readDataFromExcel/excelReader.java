package readDataFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {
	 public static String readTestDataFromExcel(String path,String sheetName,int rowNo,int colNo) throws IOException
	 {
		 String rootDirectory=System.getProperty("user.dir");
		 File file=new File(rootDirectory+path);
		 FileInputStream stream=new FileInputStream(file);
		 XSSFWorkbook wb=new XSSFWorkbook(stream);
		 XSSFSheet sheet=wb.getSheet(sheetName);
		 String data=sheet.getRow(rowNo).getCell(colNo).getStringCellValue();
		 return data;
		 
	 }

}
