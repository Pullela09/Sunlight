package com.cg.Sunlight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shmahank\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://waftest.slfportal.com/uiuxQA/#/");
		driver.manage().window().maximize();
		driver.findElement(By.id("emailId")).sendKeys("meghaa.1993@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sunlight@123");
		driver.findElement(By.id("submit")).click();
		WebDriverWait wait = new WebDriverWait(driver, 200);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@id='add-user']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-user")));
		Thread.sleep(7000);
		driver.findElement(By.id("add-user")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("pullelaa");
		driver.findElement(By.name("lastName")).sendKeys("snehaa");
		driver.findElement(By.name("phone")).sendKeys("2125959900");
		driver.findElement(By.name("email")).sendKeys("sneha.pullela@gmail.com");
		driver.findElement(By.id("address1")).sendKeys("queenss street");
		driver.findElement(By.id("city1")).sendKeys("naash");
		Select states = new Select(driver.findElement(By.name("installStateName")));
		states.selectByVisibleText("Texas");
		driver.findElement(By.name("installZipCode")).sendKeys("49878");
		driver.findElement(By.name("referenceNumber")).sendKeys("9123456782");
		driver.findElement(By.xpath("//input[@value='NEXT']")).click();
		
		/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='CREATE NEW ACCOUNT']")));
		driver.findElement(By.xpath("//input[@value='CREATE NEW ACCOUNT']")).click();*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("loanterm")));
		Thread.sleep(7000);
		Select loan = new Select(driver.findElement(By.name("loanterm")));
		loan.selectByIndex(2);
		//driver.findElement(By.xpath("//input[@value='yes']")).click();

		driver.findElement(By.name("loanAmount")).sendKeys("30000");
		driver.findElement(By.name("systemSize")).sendKeys("32");
		driver.findElement(By.xpath("//input[@value='CALCULATE MONTHLY PAYMENT']")).click();
		driver.findElement(By.xpath("//input[@value='RUN CREDIT']")).click();
		
		driver.get("https://cs15.salesforce.com/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		Thread.sleep(7000);
		driver.findElement(By.name("username")).sendKeys("shamkrishna.mahankali@capgemini.com.full");
		driver.findElement(By.name("pw")).sendKeys("Ganesh@123");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(7000);
		driver.findElement(By.name("str")).sendKeys("9123456782");
		driver.findElement(By.id("phSearchButton")).click();
		
		driver.findElement(By.xpath("//td[@class='actionColumn']/a")).click();
		
		
		
		
		/* driver.findElement(By.xpath("//i[@id='add-user']")).click(); */
		// driver.close();

	}
}
