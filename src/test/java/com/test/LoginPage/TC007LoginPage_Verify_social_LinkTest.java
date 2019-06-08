package com.test.LoginPage;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.BaseProperties.BaseClass;
import com.test.PageActions.LoginPage;

public class TC007LoginPage_Verify_social_LinkTest extends BaseClass {
	
	LoginPage LoginPage1;
	
public static Logger log = (Logger) LogManager.getLogger(TC007LoginPage_Verify_social_LinkTest.class.getName());
	
	
	@BeforeTest
	public void BrowserSetUp() {
		init();
	    log.info("Invoke the Browser and launch the Application URL");
	}
	@Test
	public void VelidateSocialLink() throws InterruptedException
	{
		LoginPage1=new LoginPage(driver);
		LoginPage1.SocialLink();
		System.out.println("ab");
		
		
		
	}	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		log.info("Driver Close");
	}

}
