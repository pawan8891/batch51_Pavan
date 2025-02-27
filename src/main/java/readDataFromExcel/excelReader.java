package readDataFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {
	 public static String readTestDataFromExcel(String path,String sheetName,int rowNo,int colNo) throws FileNotFoundException
	 {
		 File file=new File(path);
		 FileInputStream stream=new FileInputStream(file);
		 XSSFWorkbook wb=new XSSFWorkbook(stream);
		 XSSFSheet sheet=wb,getSheet(sheetName);
		 String data=sheet.getRow(rowNo).getCell(colNo).getStringCellValue();
		 return data;
		 
	 }

}
