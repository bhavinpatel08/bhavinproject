package com.test.PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtPage {
	
	WebDriver driver=null;
	ShopingCartPage ShopingCartPage;
	
	public TshirtPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	WebElement image;
	
	@FindBy(xpath="//*[text()='Add to cart']")
	WebElement Add_to_car;
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[2]")
	WebElement chekout;
	
	public void Selectimage() throws InterruptedException
	{   
		Actions a=new Actions(driver);
		a.moveToElement(image).build().perform();
		Thread.sleep(2000);
		
	}
	public ShopingCartPage AddtoCart() throws InterruptedException
	{
		Actions a2=new Actions(driver);
		a2.moveToElement(Add_to_car).click().build().perform();
		Thread.sleep(2000);
		chekout.click();
		return new ShopingCartPage(driver);
		
	}

}
