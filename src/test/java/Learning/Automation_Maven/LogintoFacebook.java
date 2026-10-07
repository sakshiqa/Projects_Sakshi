package Learning.Automation_Maven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogintoFacebook 
{
@Test

public void withvalidcred()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.EntervalidEmailid();
	loginpage.EntervalidPassword();
	loginpage.ClickonLoginbutton();
}
}
