package pages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.TestBase;
import utility.ReadData;

public class LoginPage extends TestBase
{ 
	@FindBy(xpath="//input[@id='user-name']") private WebElement userTxtBox;
	@FindBy(xpath="//input[@id='password']") private WebElement passWordTxtBox;
	@FindBy(xpath="//input[@id='login-button']") private WebElement loginBtn;

	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String LoginApplication() throws IOException
	{
		userTxtBox.sendKeys("standard_user");
		passWordTxtBox.sendKeys("secret_sauce");
		loginBtn.click();
		return driver.getCurrentUrl();
		
	}
	public String Verifymultiplecredentials(String user,String pass)
	{
		userTxtBox.sendKeys(user);
		passWordTxtBox.sendKeys(pass);
		loginBtn.click();
		return driver.getCurrentUrl();
	}
	
	
	
}
