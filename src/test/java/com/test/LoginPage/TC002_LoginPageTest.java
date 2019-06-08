package com.test.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.BaseProperties.BaseClass;
import com.test.PageActions.LoginPage;

public class TC002_LoginPageTest extends BaseClass{
	

	LoginPage lp;
	@BeforeTest
	public void BrowserSetUp() {
		init();
	}
	@Parameters({"Username","password"})
	@Test
	public void LoginVerification(String  Username, String password) throws InterruptedException {
		lp = new LoginPage(driver);
		lp.validateLogin(Username,password);
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
