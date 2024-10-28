package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.InventryPage;
import pages.LoginPage;

public class InventryTestCase extends TestBase
{
	LoginPage login;
	InventryPage invent;
	@BeforeMethod
	public void setUp() throws IOException
	{
		intialization();
		login=new LoginPage();
		invent=new InventryPage();
		login.LoginApplication();
	}
	@Test
	public void verifyTwitterLogoTest()
	{
		boolean result = invent.verifyTwitterLogo();
		Assert.assertEquals(result,true);
		Reporter.log("Twitter Logo is present= "+result);
	}
	@Test
	public void verifyfacebboklogoTest()
	{
		boolean result=invent.verifyfacebboklogo();
		Assert.assertEquals(result, true);
		Reporter.log("Facebook logo is present="+result);
	}
	@Test
	public void verifylinkedinlogoTest()
	{
		boolean result=invent.verifylinkedinlogo();
		Assert.assertEquals(result, true);
		Reporter.log("Linked in logo is present="+result);
	}
	@Test
	public void add6Products()
	{
		String expCount="4";
		String actCount=invent.add6Products();
		Assert.assertEquals(expCount,actCount);
		Reporter.log("Total products add to the cart = "+actCount);
	}
	@Test
	public void verifyPageTitleTest()
	{
		String expTitle="Products";
		String actTitle=invent.verifyPageTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Inventory page title = "+actTitle);
	}
	@Test
	public void ClickoncartIconTest()
	{
		String Expurl="https://www.saucedemo.com/cart.html";
		String Acturl=invent.ClickoncartIcon();
		Assert.assertEquals(Expurl, Acturl);
		Reporter.log("Actual url of ="+Acturl);
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}


	
	
}
