package Learning.Automation_Maven;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.BaseTest;

public class LogintoAmazon extends BaseTest
{
	@Test
	
	public void signin()
	{
		Reporter.log("Browser launched successfully");
	Amz_HomePage login=new Amz_HomePage(driver);

	login.HoverOverAccountantList(driver);
	login.ClickonSignin();
	Reporter.log("Click on signin");
	
	Amz_LoginPage login1=new Amz_LoginPage(driver);
	login1.validusername();
	Reporter.log("Enter username");
	
	login1.continuebutton();
	Reporter.log("Click on continue button");
	
	login1.validpassword();
	Reporter.log("Enter Password");

	login1.signinbutton();
	Reporter.log("Click on signin button");
	SoftAssert message=new SoftAssert();
	message.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    message.assertAll();
	}
}
