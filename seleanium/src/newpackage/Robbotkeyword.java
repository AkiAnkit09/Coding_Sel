package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robbotkeyword 
{
@Test
public void robbottest()
{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
driver.get("");
}
}
