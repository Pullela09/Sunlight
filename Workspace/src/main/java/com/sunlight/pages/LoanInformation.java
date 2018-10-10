package com.sunlight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoanInformation {
	
	WebDriver driver;
	
	public LoanInformation(WebDriver driver){
		this.driver=driver;
		
	}
	
	@FindBy(how = How.NAME, using = "loanterm")WebElement loantrm;
	@FindBy(how = How.NAME, using = "loanAmount")WebElement loanamt;
	@FindBy(how = How.NAME, using = "systemSize")WebElement size;
	@FindBy(how = How.XPATH, using = "//input[@value='CALCULATE MONTHLY PAYMENT']")WebElement monthly;
	@FindBy(how = How.XPATH, using = "//input[@value='RUN CREDIT']")WebElement runcredit;

	
	
	public void setLoantem() {
		  Select term=new Select(loantrm);
		 // term.selectByIndex(1);
		  
		
	}
	
	public void setLoanamt(String loanamt) {
		this.loanamt.sendKeys(loanamt);
	}
	
	public void setSize(String size) {
		this.size.sendKeys(size);
	}
	
	public void setMonthly() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",monthly);
	}
	
	public void setRuncredit() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",runcredit);
	}
	
	
	
	
	
	
	
	
	
	
}

