package com.test.LoginPage;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.BaseProperties.BaseClass;
import com.test.PageActions.ContactusPage;
import com.test.PageActions.HomePage;
import com.test.PageActions.LoginPage;


public class TC004_LoginPageVerifytitlebarlinksTest extends BaseClass  {
	LoginPage LoginPage1;
	ContactusPage ContactusPage;
	HomePage HomePage;
public static Logger log = (Logger) LogManager.getLogger(TC004_LoginPageVerifytitlebarlinksTest.class.getName());
	
	
	@BeforeTest
	public void BrowserSetUp() {
		init();
		log.info("Invoke the Browser and launch the Application URL");
	}
	@Test
	public void VelidatetitleBarlinks() throws InterruptedException 
	{
		
		LoginPage1=new LoginPage(driver);
		ContactusPage=LoginPage1.contactus();
		log.info("open the contact us page in new window ");
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "My Store");
	    log.info("chek the title ");
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		HomePage=LoginPage1.ClickonSignin();
		log.info("open the singin page in new window ");
		
		Assert.assertEquals(driver.getTitle(), "My Store");
		log.info("chek the title ");
		Thread.sleep(2000);
		
		
		
		
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		log.info("Driver Close");
	}


}
