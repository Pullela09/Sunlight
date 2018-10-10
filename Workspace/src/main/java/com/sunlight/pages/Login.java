package com.sunlight.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login
{
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	//Assign Page Factory or Object Repository
	@FindBy(how = How.ID, using = "emailId")
	public WebElement username;
	
	@FindBy(how = How.ID,using="password")WebElement password;
	
	@FindBy(how = How.ID,using="submit")WebElement loginBtn;
	@FindBy(how = How.XPATH,using="//img(contains(@class,' img-responsive center-block'))")WebElement sunlightLogo;
	
	//Method Creation
		
	public void username(String username)
	{
		this.username.sendKeys(username);
	}
	
	public void password(String password)
	{
		this.password.sendKeys(password);
	}
	public void loginBtn() 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",loginBtn);
	}
	
}
