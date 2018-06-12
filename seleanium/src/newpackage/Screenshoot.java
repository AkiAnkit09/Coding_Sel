package newpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshoot 
{
	@Test (invocationCount = 1)
		public void takescreenshoot() throws IOException
	{
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		d.get("https://www.w3schools.com");
		File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\sumit\\Saved Games\\Desktop\\screen.png");
			FileUtils.copyFile(src, des);
			d.quit();
		}
}
