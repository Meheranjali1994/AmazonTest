package ProjectA.ProjectA;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestAnnotation 
{ 
	static WebDriver driver;
	
  @Test
  public void f()
  {   
	  
	    driver.findElement(By.id("a-autoid-1-announce")).click();
		driver.findElement(By.id("nav-cart-count")).click();
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("a-autoid-2-announce")).click();
		
	  
		
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException 
  {
	  System.out.println("Product Search");
		
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='under 20000']")).click();		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee Mug");

		
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Transcation");
	 
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("Home Page");
	   System.out.print(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		driver.manage().window().minimize();
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass()
  {

	  System.out.println("Assertion");
		String actual="Work hard,Have fun,Make history";
		String expected="smile more";
		Assert.assertEquals(actual, expected);
  }
  

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Sign in");
	    driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7745889342");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("anjali");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("Sign Out")).click();
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Custemor Service");
  }

  @BeforeSuite
  public void beforeSuite() 
  {	
	  System.out.println("Amazon Launch");
	  WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
			driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7745889342");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("anjali");
			driver.findElement(By.id("signInSubmit")).click();
			driver.findElement(By.xpath("Sign Out")).click();
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("Close,Quite");
	  driver.close();
	  driver.quit();
  }

}
