package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CartPage extends TestBase
{
	@FindBy(xpath="//span[text()='Your Cart']") private WebElement title;
	@FindBy(xpath="//div[text()='QTY']") private WebElement qtyword;
	@FindBy(xpath="//div[text()='Description']") private WebElement Descripword;
	@FindBy(xpath="//div[@class='footer_copy']") private WebElement footername;
	@FindBy(xpath="//button[@id='checkout']") private WebElement checkoutpage;
	
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String VerifyCartpageUrl()
	{
		return driver.getCurrentUrl();
		
	}
	public String VerifyTitleofPage()
	{
		return title.getText();
	}
	public String Verifyqtyword()
	{
		return qtyword.getText();
		
	}
	public String VerifyDescripword()
	{
		return Descripword.getText();
		
	}
	public String VerifyfooterName()
	{
		return footername.getText();
		
	}
	public String Verifycheckoutpage()
	{
		checkoutpage.click();
		return driver.getCurrentUrl();
		
	}
	
	

}
