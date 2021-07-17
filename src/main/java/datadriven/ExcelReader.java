package datadriven;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	
	public static void readExcelData() throws IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\PRASHANTHI\\MyJavaWorkSpace\\SeleniumJuneSessions\\TestdataExcels\\LoginTestData.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		  XSSFSheet sheet = workbook.getSheet("LoginSheet");
		   XSSFRow row = sheet.getRow(1); 
		   XSSFCell cell = row.getCell(1);
		   
		   System.out.println(cell.toString());
		   
		   
		   
		
		
	}
	
public static String readExcelData1() throws IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\PRASHANTHI\\MyJavaWorkSpace\\SeleniumJuneSessions\\TestdataExcels\\LoginTestData.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		  XSSFSheet sheet = workbook.getSheet("LoginSheet");
		  
		  
		  int rowCount =   sheet.getLastRowNum();
		   
		  String value = "";
		  
		  for(int i = 1; i<=rowCount; i++) {
			  
			  XSSFRow row = sheet.getRow(i); 
			  
			  int colCount = row.getLastCellNum();
			  
			  for(int j = 0; j<colCount; j++) {
			   XSSFCell cell = row.getCell(j);
			    value = cell.toString();
			  }
		  }
		return value;
		  
		  
		   
		   
		   
		   
		
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		readExcelData1();
	}

	
	
}
