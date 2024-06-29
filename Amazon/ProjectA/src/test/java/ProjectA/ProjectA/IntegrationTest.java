package ProjectA.ProjectA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IntegrationTest 
{
	@Test 
	public void AmazonTest() throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.print(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		driver.manage().window().minimize();
		driver.manage().window().maximize();
	//	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	//	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7745889342");
	//	driver.findElement(By.id("continue")).click();
	//	driver.findElement(By.id("ap_password")).sendKeys("anjali");
//		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='under 20000']")).click();
		driver.findElement(By.id("a-autoid-1-announce")).click();
		driver.findElement(By.id("nav-cart-count")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee Mug");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("a-autoid-2-announce")).click();
		
}
}
