package Learning.Automation_Maven;

import org.testng.annotations.Test;
import utility.BaseTest;

public class RegisterNewUser extends BaseTest
{
@Test
public void Registration()
{
	Amz_HomePage home=new Amz_HomePage(driver);
	home.HoverOverAccountantList(driver);
	home.Registration();
	
	Amz_LoginPage login=new Amz_LoginPage(driver);
	Registration register=new Registration(driver);
	register.newusername();
	login.continuebutton();
	register.proceed_createaccount();
	register.Entercutomer_Name();
	register.Verify_Mobileno();
}
}
