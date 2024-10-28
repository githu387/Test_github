package testCases;

import java.awt.Checkbox;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.CheckOutPage;
import pages.InventryPage;
import pages.LoginPage;

public class CheckOutPage_TestCase extends TestBase
{
	LoginPage login;
	InventryPage Invent;
	CartPage Cart;
	CheckOutPage Check;
	@BeforeMethod
	public void setup() throws IOException
	{
		intialization();
		login=new LoginPage();
		Invent=new InventryPage();
		Cart=new CartPage();
		Check=new CheckOutPage();
		login.LoginApplication();
		Invent.add6Products();
		Invent.ClickoncartIcon();
		Cart.Verifycheckoutpage();
	}
	@Test
	public void ClickonContinuebtnTest()
	{
		String Expurl="https://www.saucedemo.com/checkout-step-two.html";
		String Acturl=Check.ClickonContinuebtn();
		Assert.assertEquals(Expurl, Acturl);
	}
	@AfterMethod
	public void Closebrowser()
	{
		driver.close();
	}
	

}
