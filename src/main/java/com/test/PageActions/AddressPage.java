package com.test.PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {


	WebDriver driver=null;
	AddressPage AddressPage;
	ShippingPage ShippingPage;
	
	
	public AddressPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[@class='cart_navigation clearfix']//span[text()='Proceed to checkout']")
	WebElement Processtochekoutaddress;
	
	
	public ShippingPage Processtochekoutaddress() throws InterruptedException
	{
		Thread.sleep(2000);
		Processtochekoutaddress.click();
		return new ShippingPage(driver);
	}

}
