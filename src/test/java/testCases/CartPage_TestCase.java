package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import base.TestBase;
import pages.CartPage;
import pages.InventryPage;
import pages.LoginPage;
import utility.ReadData;
import utility.Screenshots;

public class CartPage_TestCase extends TestBase
{
	LoginPage login;
	InventryPage Invent;
	CartPage Cart;
	@BeforeMethod
	public void setup() throws IOException
	{
		intialization();
		login=new LoginPage();
		Invent=new InventryPage();
		Cart=new CartPage();
		login.LoginApplication();
		Invent.add6Products();
		Invent.ClickoncartIcon();
			
	}
	@Test
	public void VerifyCartpageUrlTest() throws EncryptedDocumentException, IOException
	{
		String ExpUrl="https://www.saucedemo.com/cart.html";
		String ActUrl=Cart.VerifyCartpageUrl();
		Assert.assertEquals(ExpUrl, ActUrl);
		Reporter.log("CartPage Actual URL="+ActUrl);
	}
	@Test
	public void VerifyTitleofPageTest() throws EncryptedDocumentException, IOException
	{
		String ExpTitle="Your Cart";
		String ActTitle=Cart.VerifyTitleofPage();
		Assert.assertEquals(ExpTitle, ActTitle);
		Reporter.log("Actual title of cartpage="+ActTitle);
	}
	@Test
	public void VerifyqtywordTest() throws EncryptedDocumentException, IOException
	{
		String ExpWord="QTY";
		String ActWord=Cart.Verifyqtyword();
		Assert.assertEquals(ExpWord, ActWord);
		Reporter.log("Actual word of="+ActWord);
	}
	@Test
	public void VerifyDescripwordTest() throws EncryptedDocumentException, IOException
	{
		String Expdword="Description";
		String Actdword=Cart.VerifyDescripword();
		Assert.assertEquals(Expdword, Actdword);
		Reporter.log("Actual word of d="+Actdword);
				
	}
	@Test
	public void VerifyfooterNameTest() throws EncryptedDocumentException, IOException
	{
		String Expfooter="© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
		String Actfooter=Cart.VerifyfooterName();
		Assert.assertEquals(Expfooter, Actfooter);
		Reporter.log("Actual footer of application="+Actfooter);
	}
	@Test
	public void VerifycheckoutpageTest() throws EncryptedDocumentException, IOException
	{
		String Expurl="https://www.saucedemo.com/checkout-step-one.html";
		String Acturl=Cart.Verifycheckoutpage();
		Assert.assertEquals(Expurl, Acturl);
		Reporter.log("Actual Checkoutpage URL="+Acturl);
	}
	@AfterMethod
	public void Closedriver()
	{
		
		driver.close();
		
	}

}
