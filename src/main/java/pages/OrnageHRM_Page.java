package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.ReadData;

public class OrnageHRM_Page extends TestBase
{
	@FindBy(xpath="//label[text()='Username']") private WebElement username;
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']") private WebElement loginbtn;
	public OrnageHRM_Page()
	{
		PageFactory.initElements(driver, this);
	}
	public String LoginApp() throws IOException
	{
		username.sendKeys(ReadData.valueproperties("username"));
		password.sendKeys(ReadData.valueproperties("password"));
		loginbtn.click();
		return driver.getCurrentUrl();
		
	}
	

}
