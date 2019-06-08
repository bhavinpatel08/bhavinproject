package com.test.TshirtPage;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.BaseProperties.BaseClass;

import com.test.PageActions.AddressPage;
import com.test.PageActions.LoginPage;
import com.test.PageActions.Paymentpage;
import com.test.PageActions.ShippingPage;
import com.test.PageActions.ShopingCartPage;
import com.test.PageActions.TshirtPage;



public class TC001_TshirtPageTest extends BaseClass  {
	
	TshirtPage TshirtPage;
	LoginPage l;
	ShopingCartPage ShopingCartPage;
	AddressPage AddressPage;
	ShippingPage ShippingPage;
	Paymentpage Paymentpage;
	
//	public static Logger log = LogManager.getLogger(TC001_TshirtPageTest.class.getName());
	@Parameters({"browser"})
	@BeforeTest
	public void BrowserSetUp() {
		
		init();
	//	log.info("Invoke the Browser and launch the Application URL");
	}
	
	@Test 
	public void  BuyTshirt() throws InterruptedException
	{
		l=new LoginPage(driver);
		l.women();
		l.ClickonTshirt();
		TshirtPage=new TshirtPage(driver);
		TshirtPage.Selectimage();
		ShopingCartPage	=TshirtPage.AddtoCart();
		AddressPage=ShopingCartPage.Processtochekout();
		l.validateLogin();
		ShippingPage=AddressPage.Processtochekoutaddress();
		Paymentpage=ShippingPage.Processtochekoutshipping();
		Paymentpage.Paybybank();
		Paymentpage.confirmorder();
		Thread.sleep(2000);
			
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	//	log.info("Driver Close");
	}
	

}
