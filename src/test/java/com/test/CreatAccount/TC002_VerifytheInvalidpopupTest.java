package com.test.CreatAccount;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.BaseProperties.BaseClass;
import com.test.PageActions.CreateAccount;

public class TC002_VerifytheInvalidpopupTest extends BaseClass {
	

	CreateAccount c;
  public static Logger log = (Logger) LogManager.getLogger(TC002_VerifytheInvalidpopupTest.class.getName());
	
	
	@BeforeTest
	public void BrowserSetUp() {
		init();
		log.info("Invoke the Browser and launch the Application URL");
	}
	@Test
	public void Verificationtheinvalidemailpopup() throws InterruptedException {
		c=new CreateAccount(driver);
		c.Velidateloginpopup();
		Thread.sleep(2000);
		

	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		log.info("Driver Close");
	}

}
