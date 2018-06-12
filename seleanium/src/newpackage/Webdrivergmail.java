package newpackage;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Webdrivergmail 
{
	@Test
	public void gmaillogin()
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.id("identifierId")).sendKeys("rameshjha2022@gmail.com");
		//driver.findElement(By.className("RveJvd snByac"));
		act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.name("password")).sendKeys(String.valueOf(9851630502L));
		act.sendKeys(Keys.ENTER).perform();
		
	}

}
