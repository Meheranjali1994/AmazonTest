package ProjectA.ProjectA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.print(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
	}

}
