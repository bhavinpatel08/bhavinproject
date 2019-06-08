package com.test.CreatAccount;






import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.BaseProperties.BaseClass;

import com.test.PageActions.CreateAccount;

public class TC001_CreatAccountTest extends BaseClass{
	
	
	CreateAccount c;
	public static Logger log = (Logger) LogManager.getLogger(TC001_CreatAccountTest.class.getName());
	
	@BeforeTest
	public void BrowserSetUp() {
		init();
		log.info("Invoke the Browser and launch the Application URL");
	}
	@Test
	public void CreatAccountVerification() throws InterruptedException {
		c=new CreateAccount(driver);
		c.get_registerData("bp08081992@gmail.com","bhavin", "patel", "king121212", "8", "8", "1992");
		c.getaddress("mycompany", "9551 tapok dr", "Manassas","Virginia" , "20110","United States","5713598558","5713599696");
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		//slog.info("Driver Close");
	}


}
