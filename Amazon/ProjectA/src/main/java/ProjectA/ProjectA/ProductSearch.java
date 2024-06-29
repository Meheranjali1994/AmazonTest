package ProjectA.ProjectA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductSearch {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.print(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		Thread.sleep(5000);
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
