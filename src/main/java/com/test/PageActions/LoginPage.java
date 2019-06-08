package com.test.PageActions;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginPage {

	WebDriver driver=null;
	HomePage HomePage;
	TshirtPage TshirtPage;
	ContactusPage ContactusPage;
	
	
	

	public LoginPage(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Contact Us']")
	WebElement contactus;
	

	@FindBy(css="img[class='logo img-responsive']")
	WebElement logo;
	
	@FindBy(xpath="//input[@id='search_query_top']")
	WebElement serch;
	

	@FindBy(xpath="//button[@name='submit_search']")
	WebElement Submitserch;
	
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement Signin;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement EmailAddress;
	
	
	@FindBy(xpath="//*[@id='passwd']")
	WebElement Password;
	
	@FindBy(xpath="//*[@id='SubmitLogin']")
	WebElement Submit;
	
	@FindBy(xpath="//div[@class='container'] //a[@title='Women']")
	WebElement Women;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[1]")
	WebElement Tshirt1;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	WebElement Tshirt2;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	WebElement Dresses;
	
	@FindBy(xpath="//*[@id='social_block']//ul//li")
	WebElement Socialblock;
	
//	@FindBy(xpath="(//a[@title='Dresses'])[2]")
//	WebElement Dresses;
//	
	
	@FindBy(xpath = ".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;
	
	public ContactusPage contactus() throws InterruptedException
	{   
		Thread.sleep(1000);
		contactus.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		Thread.sleep(1000);
		Set<String> win=driver.getWindowHandles();
		Thread.sleep(1000);
		Iterator<String> it=win.iterator();
		Thread.sleep(1000);
		driver.switchTo().window(it.next());
		return new ContactusPage();
	}
	public HomePage ClickonSignin() throws InterruptedException
	{   
		Thread.sleep(1000);
		Signin.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		Thread.sleep(1000);
		Set<String> win=driver.getWindowHandles();
		Thread.sleep(1000);
		Iterator<String> it=win.iterator();
		Thread.sleep(1000);
		driver.switchTo().window(it.next());
		
		return new HomePage();
	}
	
	public void serch()
	{
		serch.click();
		serch.sendKeys("abcd");
		Submitserch.click();
		
		
		
		
		
	}
	
	
	public String getInvalidLoginText()
	{
		
		return authenticationFailed.getText();
		
	}
	
	public void women() throws InterruptedException
	{
		Actions a=new Actions(driver);
		a.moveToElement(Women).build().perform();
		Thread.sleep(2000);
	}
	public TshirtPage ClickonTshirt()
	{   
		Actions a1=new Actions(driver);
		a1.moveToElement(Tshirt1).click().build().perform();
		return new TshirtPage(driver);
	}
	
	
	
	public  HomePage validateLogin() throws InterruptedException {
		Thread.sleep(2000);
		EmailAddress.sendKeys("ramesh.koela@outlook.com");
		Password.sendKeys("Komal&bhavin88");
		 Submit.click();
		return new HomePage();
		 
	}
	
	public void validateLogin(String Username, String password) {
		Signin.click();
		
		EmailAddress.sendKeys(Username);
	
		Password.sendKeys(password);

		Submit.click();
		
		
	}
	public void validateLogin(String TestCaseID, String Username, String password)
	{
		Signin.click();
		
		EmailAddress.sendKeys(Username);
		
		Password.sendKeys(password);
	
		Submit.click();
	
	}
	public void ValidateWomen_Dresses_Tshirt_Option_onhomepage() throws InterruptedException
	{
		Women.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		Thread.sleep(1000);
		Tshirt2.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		Thread.sleep(1000);
		Dresses.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		
		Thread.sleep(1000);
		Set<String> win=driver.getWindowHandles();
		Thread.sleep(1000);
		Iterator<String> it=win.iterator();
		Thread.sleep(1000);
		
		while(it.hasNext()) {
		driver.switchTo().window(it.next());
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		}
		
	}
	public void SocialLink() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement block=Socialblock;
	    int	totallinl=block.findElements(By.tagName("a")).size();
	    System.out.println(totallinl);
	    
	    for(int i=0; i<totallinl; i++)
	    {
	    	Thread.sleep(2000);
	    	String link=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	block.findElements(By.tagName("a")).get(i).sendKeys(link);
	    	
	    }

		Thread.sleep(1000);
		Set<String> win=driver.getWindowHandles();
		Thread.sleep(1000);
		Iterator<String> it=win.iterator();
		Thread.sleep(1000);
		
		while(it.hasNext()) {
		driver.switchTo().window(it.next());
		
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		}
		
		
	
	}
	
	

}
