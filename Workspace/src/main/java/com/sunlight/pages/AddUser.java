package com.sunlight.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddUser {
	WebDriver driver;
	
	public AddUser(WebDriver driver)
	{
		this.driver=driver;		
	}
	//Assign Page Factory or Object Repository
	@FindBy(how = How.ID, using = "add-user")WebElement adduserLink;
	@FindBy(how = How.ID, using = "firstName" )WebElement firstName;
	@FindBy(how = How.NAME, using ="lastName" )WebElement lastName;
	@FindBy(how = How.ID, using ="phoneNumber" )WebElement phone;
	@FindBy(how = How.ID, using ="emailAddress" )WebElement Email;
	@FindBy(how = How.NAME, using ="installStreet")WebElement installStreet;
	@FindBy(how = How.NAME, using ="installCity")WebElement installCity;
	@FindBy(how = How.NAME, using ="installStateName ")WebElement installStateName ;
	@FindBy(how = How.NAME, using ="installZipCode ")WebElement installZipCode;
	@FindBy(how = How.NAME, using ="referenceNumber ")WebElement referenceNumber;
	
	public void adduserLink() 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",adduserLink);
		
	}
	
	public void userFirstName()
	{
		
	}
	
	public void userLastName()
	{
		
	}
}
