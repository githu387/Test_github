package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import base.TestBase;
import pages.LoginPage;

public class Multiple_Credentials_TestCase extends TestBase
{
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException
	{
		intialization();
		login=new LoginPage();
		
	}
	@DataProvider(name="Validation")
	public Object[][] testdata()
	{
		return new Object[][]
				{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
			{"error_user","secret_sauce"},
			{"visual_user","secret_sauce"},
			{"dhanji_Qa","dhanaji@123"}
				};
	}
	
	@Test(dataProvider="Validation")
	public void VerifymultiplecredentialsTest(String username,String pass)
	{
		SoftAssert s=new SoftAssert();
		String Expurl="https://www.saucedemo.com/inventory.html";
		String Acturl=login.Verifymultiplecredentials(username, pass);
		s.assertEquals(Expurl, Acturl);
		s.assertAll();
				
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
