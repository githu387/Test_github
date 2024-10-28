package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import base.TestBase;
import pages.LoginPage;
import utility.ReadData;
import utility.Screenshots;

public class LoginPage_TestCase extends TestBase
{
	LoginPage login;
	@BeforeMethod
	
	public void setup() throws IOException
	{
		intialization();
		login=new LoginPage();
	}
	@Test
	public void LoginApplicationTest() throws EncryptedDocumentException, IOException
	{
		String ExpURL="https://www.saucedemo.com/inventory.html";
		String ActURL=login.LoginApplication();
		Assert.assertEquals(ExpURL, ActURL);
	}
	@AfterMethod
	public void CloseBrowser() 
	{
		
		driver.close();
	}
}