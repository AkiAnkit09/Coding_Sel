package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Launchbrowser
{
	WebDriver d=new FirefoxDriver();

	 @Test
	 
	 public void Testtesng(){
		 d.get("https://dzone.com/articles/program-find-prime-numbers");
		 d.close();
	 }
		
	

}
