package com.sunlight.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ApplicationProcess {
	WebDriver driver;
	
	public ApplicationProcess(WebDriver driver){
		this.driver=driver;
		
		
	}

	@FindBy(how = How.XPATH, using = "//input[@value='E-MAIL CREDIT APPLICATION']")WebElement email;
	@FindBy(how = How.XPATH, using = "//input[@value='IN-PERSON CREDIT APPLICATION']")WebElement inPerson;

	
	public void setEmail() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",email);
	}
	
	public void setInPerson() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",inPerson);
	}
	
	
	
	
}
