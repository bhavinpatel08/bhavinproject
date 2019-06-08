package com.test.PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage {
	

	WebDriver driver=null;
	
	
	
	public Paymentpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="a[class='bankwire']")
	WebElement Paybybank;
	
	@FindBy(xpath="//button[@type='submit']//span[text()='I confirm my order']")
	WebElement confirmorder;
	
	
	
	public void Paybybank() throws InterruptedException
	{
		Thread.sleep(2000);
		Paybybank.click();
	}

	public void confirmorder() throws InterruptedException
	{
		Thread.sleep(2000);
		confirmorder.click();
	}




}
