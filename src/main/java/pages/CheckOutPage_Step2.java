package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPage_Step2 extends TestBase
{
	@FindBy(xpath="//span[text()='Checkout: Overview']") private WebElement step2title;
	
	@FindBy(xpath="//button[@name='finish']") private WebElement finishbutton;
	
	public CheckOutPage_Step2()
	{
		PageFactory.initElements(driver, this);
	}

	
	public String ClickOnFinishbtn()
	{
		
		finishbutton.click();
		return driver.getCurrentUrl();
		
		
	}

}
