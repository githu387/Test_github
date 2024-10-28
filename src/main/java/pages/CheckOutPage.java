package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPage extends TestBase
{
	@FindBy(xpath="//span[text()='Checkout: Your Information']") private WebElement titletxt;
	@FindBy(xpath="//input[@id='first-name']") private WebElement firstnametxt;
	@FindBy(xpath="//input[@id='last-name']") private WebElement lastnametxt;
	@FindBy(xpath="//input[@id='postal-code']") private WebElement postalcodetxt;
	@FindBy(xpath="//input[@id='continue']") private WebElement continuebtn;
	public CheckOutPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String ClickonContinuebtn()
	{
		titletxt.getText();
		firstnametxt.sendKeys("Dhanaji");
		lastnametxt.sendKeys("Jagtap");
		postalcodetxt.sendKeys("416410");
		continuebtn.click();
		return driver.getCurrentUrl();
	}
	

}
