package com.test.BaseProperties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;

import com.test.ExcelReader.ExcelReader;

public class BaseClass {
	
	
	
	private static final String True = null;
	public static  WebDriver driver;
	ExcelReader excel;
	
	String url = "http://automationpractice.com/index.php";
	String browser ="chrome";
	
	public void init()
	{
		SelectBrowser(browser);
		getUrl(url);
	}
	
	private void getUrl(String  url) 
	 {
		//log.info("navigating to url:" + url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	 }
	
	public void SelectBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src/main/java/com/test/WebDrivers/geckodriver.exe");
			//log.info("Creating Object of" + browser);
			driver = new FirefoxDriver();
		}
				//  System.setProperty("webdriver.ie.driver", "D://IEDriverServer.exe");
		if(browser.equalsIgnoreCase("chrome"))
		{
			DesiredCapabilities d=new DesiredCapabilities();
			d.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, True);
			d.setCapability(CapabilityType.ACCEPT_SSL_CERTS, True);
			ChromeOptions c=new ChromeOptions();
			c.merge(d);
			System.setProperty("webdriver.chrome.driver", "src/main/java/com/test/WebDrivers/chromedriver.exe");
			//log.info("Creating Object of" + browser);
			driver = new ChromeDriver(c);
		}
		
		if(browser.equalsIgnoreCase("InternetExplorer"))
		{
			System.setProperty("webdriver.ie.driver", "E:\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		//	log.info("Creating Object of" + browser);
			driver = new InternetExplorerDriver();
		}
	
	}
	

	public String[][] getData(String ExcelName, String sheetName)
	{ 
		// /uiAutoframework/src/main/java/com/test/Autoframework/uiAutoframework/data/TestData.xlsx
		String path = System.getProperty("user.dir")+ "/src/main/java/com/test/DataSources/"+ ExcelName;
		excel = new ExcelReader(path);
	    String[][] data = excel.getDataFromSheet(sheetName, ExcelName);
	    return data;
	}


}
