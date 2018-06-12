package newpackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asseration
{
	@Test
	
		public void asseration()
		{
			WebDriver driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https://www.javatpoint.com");
		//	driver.get("https://www.javatpoint.com/java-tutorial");
			System.out.println(driver.getTitle());
			Assert.assertEquals("Java Tutorial | Learn Java - javatpoint", driver.getTitle());
			driver.close();
		}
	

}
