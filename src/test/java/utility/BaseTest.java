package utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest extends ListenersLogic
{
@BeforeMethod
@Parameters("Browser")
public void LaunchBrowser(String nameofbrowser)
{
	if(nameofbrowser.equalsIgnoreCase("chrome"));
	{
	driver=new ChromeDriver();
	}
 if(nameofbrowser.equalsIgnoreCase("Edge"))
 {
	 driver=new EdgeDriver();
 }
 
	driver.get("https://www.amazon.in");
driver.manage().window().maximize(); 
}
@AfterMethod
public void quitbrowser()
{
	//driver.quit();
}
}

