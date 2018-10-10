package com.sunlight.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.sunlight.base.Common;
import com.sunlight.pages.Login;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageTest extends Common 
{
	@Test
	public void LoginpageTest() throws InterruptedException 
	{
		Login page=PageFactory.initElements(driver, Login.class);		
		page.username("meghaa.1993@gmail.com");
		Thread.sleep(1000);
		page.password("Sunlight@123");
		Thread.sleep(1000);
		page.loginBtn();
		new WebDriverWait(driver,300).until(ExpectedConditions.visibilityOfElementLocated(By.id("add-user")));
		System.out.println("Logged in Successfully");
	}
}
