package com.sunlight.testdata;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
//import static tests.BaseTest.testDataExcelFileName;
 
public class ExcelUtility {
	
	public ExcelUtility(String path,String sheetName) throws IOException
	{
	FileInputStream fis = new FileInputStream(path);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheet(sheetName);
	int rowcont = sh.getLastRowNum();
	System.out.println("EmailFlow");
    }
}
