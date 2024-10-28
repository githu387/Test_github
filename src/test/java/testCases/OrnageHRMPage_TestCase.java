package testCases;

import java.io.IOException;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.OrnageHRM_Page;

public class OrnageHRMPage_TestCase extends TestBase
{
	OrnageHRM_Page HRM;
	@BeforeMethod
	public void setup() throws IOException
	{
		intialization();
		HRM=new OrnageHRM_Page();
		
	}
	@Test
	public void LoginAppTest() throws IOException
	{
		String ExpURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String ActURL=HRM.LoginApp();
		Assert.assertEquals(ExpURL, ActURL);
	}
	@AfterMethod
	public void Closebrowser()
	{
		driver.close();
	}

}
