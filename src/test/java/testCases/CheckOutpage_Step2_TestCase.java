package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.CheckOutPage;
import pages.CheckOutPage_Step2;
import pages.InventryPage;
import pages.LoginPage;

public class CheckOutpage_Step2_TestCase extends TestBase
{
	LoginPage login;
	InventryPage Invent;
	CartPage Cart;
	CheckOutPage Check;
	CheckOutPage_Step2 Checkstep2;
	@BeforeMethod
	public void setup() throws IOException
	{
		intialization();
		login=new LoginPage();
		Invent=new InventryPage();
		Cart=new CartPage();
		Check=new CheckOutPage();
		Checkstep2=new CheckOutPage_Step2();
		login.LoginApplication();
		Invent.add6Products();
		Invent.ClickoncartIcon();
		Cart.Verifycheckoutpage();
		Check.ClickonContinuebtn();
		
		
	}
	
	@Test
	public void ClickOnFinishbtnTest()
	{
		String Expurl="https://www.saucedemo.com/checkout-complete.html";
		String Acturl=Checkstep2.ClickOnFinishbtn();
		Assert.assertEquals(Expurl, Acturl);
		Reporter.log("Completed URL="+Acturl);
		
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

	
}
