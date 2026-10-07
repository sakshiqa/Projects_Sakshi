package Learning.Automation_Maven;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utility.BaseTest;
import utility.ListenersLogic;
@Listeners(ListenersLogic.class)
public class EditProfile_Amazon extends BaseTest
{
	@Test
	
	public void search()
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
	
	login.HoverOverAccountantList(driver);
    login.Manage_profile();
	Reporter.log("Click on manage profile");
	
	Amz_Profile profile=new Amz_Profile(driver);
	profile.Accountuser();
	Reporter.log("Select user account");
	
	login.HoverOverAccountantList(driver);
	login.Manage_profile();
	//profile.viewuserpopup();
	//Reporter.log("Click on useraccount view button");
	
	//profile.editicon();
	//Reporter.log("Click on edit icon");
	
    Reporter.log("Test case are pass");
	}
}
