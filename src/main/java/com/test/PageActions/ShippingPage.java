package com.test.PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
	

	WebDriver driver=null;
	
	ShippingPage ShippingPage;
	Paymentpage Paymentpage;
	
	
	public ShippingPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[@class='cart_navigation clearfix'] //span")
	WebElement Processtochekoutshipping;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
	
	
	public Paymentpage Processtochekoutshipping() throws InterruptedException
	{
		Thread.sleep(2000);
		checkbox.click();
		Thread.sleep(2000);
		Processtochekoutshipping.click();
		return new Paymentpage(driver);
	}


}
