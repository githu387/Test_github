package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;
import utility.HandleDropdownlist;

public class InventryPage extends TestBase

{
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-backpack']") private WebElement productBackpack;
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-bike-light']") private WebElement productBikeLight;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement tshirt;
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-fleece-jacket']") private WebElement jacket;
	@FindBy(xpath="//span[@class='title']") private WebElement pageTitle;
	@FindBy(xpath="//a[text()='Twitter']") private WebElement twitterLogo;
	@FindBy(xpath="//a[text()='Facebook']") private WebElement facebooklogo;
	@FindBy(xpath="//a[text()='LinkedIn']") private WebElement linkedinlogo;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement dropDwon;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement cartCount;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement cartIcon;
	public InventryPage()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyPageTitle()
	{
		return pageTitle.getText();	
	}
	public boolean verifyTwitterLogo()
	{
		return twitterLogo.isDisplayed();
	}
	public boolean verifyfacebboklogo()
	{
		return facebooklogo.isDisplayed();
		
	}
	public boolean verifylinkedinlogo()
	{
		return linkedinlogo.isDisplayed();
		
	}
	
	public String add6Products()
	{
		HandleDropdownlist.handleSelect(dropDwon, "Price (low to high)");
		productBackpack.click();
		productBikeLight.click();
		tshirt.click();
		jacket.click();
		return cartIcon.getText();
		
	}
	public String ClickoncartIcon()
	{
		cartIcon.click();
		return driver.getCurrentUrl();
	}
	



}
