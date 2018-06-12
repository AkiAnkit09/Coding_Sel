package newpackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scroolupanddownbyjavascrpit 
{
 @Test
 public void scroolupanddown()
 {
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
	 driver.get("https://www.guru99.com/execute-javascript-selenium-webdriver.html");
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,700)");
	 driver.close();
}
}