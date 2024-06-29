package ProjectA.ProjectA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertion 
{
	@Test
	public void assertDemo() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String actual="Work hard,Have fun,Make history";
		String expected="smile more";
		Assert.assertEquals(actual, expected);
}
}