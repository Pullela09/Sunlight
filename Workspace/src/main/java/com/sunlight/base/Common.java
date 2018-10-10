package com.sunlight.base;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.sunlight.testdata.ExcelUtility;

public class Common  {
	public static WebDriver driver;
	public static JavascriptExecutor js = (JavascriptExecutor) driver;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	
	@BeforeSuite
	public  void Initialization() throws InterruptedException, IOException
	{	
		try{
			BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
	    System.out.println("Enter data sheet path:");
	    String path = reader.readLine();
	    FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("TestData");
		int rowcont = sh.getLastRowNum();
		System.out.println("EmailFlow");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(sh.getRow(1).getCell(1).getStringCellValue());	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	    }catch(org.openqa.selenium.WebDriverException e)
		{
		e.printStackTrace();
		}
	}
	@AfterSuite
	public void close()
	{
		System.out.println("Completed");
		driver.close();
	}
}
