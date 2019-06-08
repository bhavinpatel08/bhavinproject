package com.test.LoginPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.BaseProperties.BaseClass;
import com.test.PageActions.LoginPage;

public class TC003_LoginXLTest extends BaseClass {
	
	LoginPage lp;
	
	@BeforeTest
	public void BrowserSetUp()
	{
		init();	
	}
	
	@DataProvider
	public String [][] getLoginData(){
		
		String [][] dataRecords = getData("Book1.xlsx","LoginData");
		return dataRecords;
		
	}
	@Test(dataProvider="getLoginData")
	public void VerifyLoginTestwithXL(String TestCaseID, String Username, String Password) throws InterruptedException
	{
		lp = new LoginPage(driver);
		lp.validateLogin(TestCaseID, Username, Password);
		Thread.sleep(2000);
		
	}
	@AfterTest
	public void EndTest()
	{
		driver.close();
	}
	

}
