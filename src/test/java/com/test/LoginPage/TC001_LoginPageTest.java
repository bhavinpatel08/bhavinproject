package com.test.LoginPage;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.BaseProperties.BaseClass;
import com.test.PageActions.LoginPage;

import junit.framework.Assert;



public class TC001_LoginPageTest extends BaseClass {
	
	public static Logger log = (Logger) LogManager.getLogger(TC001_LoginPageTest.class.getName());
	
	LoginPage lp;
	@BeforeTest
	public void BrowserSetUp() {
		init();
		log.info("Invoke the Browser and launch the Application URL");
	}
	@Test
	public void LoginVerification() throws InterruptedException 
	{
		lp = new LoginPage(driver);
		log.info("Start TestCase Execution");
		lp.validateLogin("ramesh@gmail.com ","123s");
		Assert.assertEquals(lp.getInvalidLoginText(), "Invalid password.");
		log.info("Verify the Alert message");
		log.info("End TestCase Execution");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		log.info("Driver Close");
	}

}
