package com.sunlight.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InPerson {

	WebDriver driver;

	public InPerson(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//input[@style='width:7% !important;margin-left:0px;margin-bottom:0px;']")WebElement mailAddress;
	@FindBy(how = How.NAME, using = "dateOfBirth")WebElement dob;
	@FindBy(how = How.NAME, using = "ssn")WebElement ssn;
	@FindBy(how = How.NAME, using = "annualIncome")WebElement annualInc; 
	@FindBy(how = How.NAME, using = "employerName")WebElement empName;
	@FindBy(how = How.NAME, using = "jobTitle")WebElement position;
	@FindBy(how = How.NAME, using = "otherPhone")WebElement workph;
	@FindBy(how = How.NAME, using = "employmentYears")WebElement years;
	@FindBy(how = How.NAME, using = "employmentMonth")WebElement months;
	@FindBy(how = How.ID, using = "yes")WebElement yes;
	@FindBy(how = How.ID, using = "no")WebElement no;
	@FindBy(how = How.XPATH, using = "//input[@style='margin-left: 0px; margin-bottom: 0px; width: 7% !important;']")WebElement submit;

	
	public void setMailAddress() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",mailAddress);
	}
	
	public void setDob(String dob) {
		this.dob.sendKeys(dob);
	}
	
	public void setSsn(String ssn) {
		this.ssn.sendKeys(ssn);
	}
	
	public void setAnnualInc(String annualInc) {
		this.annualInc.sendKeys(annualInc);
	}
	
	public void setEmpName(String empName) {
		this.empName.sendKeys(empName);
	}
	
	public void setPosition(String position) {
		this.position.sendKeys(position);
	}
	
	public void setWorkph(String workph) {
		this.workph.sendKeys(workph);
	}
	
	public void setYears(String years) {
		this.years.sendKeys(years);
	}
	
	public void setMonths(String months) {
		this.months.sendKeys(months);
	}
	
	public void setYes() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",yes);
	}
	
	public void setNo() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",no);
	}
	
	public void setSubmit() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",submit);
	}
	
	
	
	
	
	
	

	
	
	

}
