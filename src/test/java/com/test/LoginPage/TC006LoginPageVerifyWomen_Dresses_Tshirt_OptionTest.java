package com.test.LoginPage;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.BaseProperties.BaseClass;
import com.test.PageActions.ContactusPage;
import com.test.PageActions.HomePage;
import com.test.PageActions.LoginPage;

public class TC006LoginPageVerifyWomen_Dresses_Tshirt_OptionTest extends BaseClass {
	

	LoginPage LoginPage1;
	ContactusPage ContactusPage;
	HomePage HomePage;
 public static Logger log = (Logger) LogManager.getLogger(TC006LoginPageVerifyWomen_Dresses_Tshirt_OptionTest.class.getName());
	
	
	@BeforeTest
	public void BrowserSetUp() {
		init();
		log.info("Invoke the Browser and launch the Application URL");
	}
	@Test
	public void ValidateSerchOption() throws InterruptedException 
	{
		 LoginPage1=new  LoginPage(driver);
		 LoginPage1.ValidateWomen_Dresses_Tshirt_Option_onhomepage();
		 Thread.sleep(2000);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		log.info("Driver Close");
	}


}
