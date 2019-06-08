package com.test.PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopingCartPage {


	WebDriver driver=null;
	AddressPage AddressPage;
	
	
	public ShopingCartPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[@class='cart_navigation clearfix'] //span")
	WebElement Processtochekout;
	
	
	
	public AddressPage Processtochekout() throws InterruptedException 
	{
		Thread.sleep(2000);
		Processtochekout.click();
		return new AddressPage(driver);
	}
	
	
	
}
