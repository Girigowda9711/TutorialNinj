package com.TutorialNinja.BaseScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.TutorialNinja.FetchProperties.Property;
import com.TutorialNinja.WebDriverAct.BrowserFactory;
import com.TutorialNinja.WebDriverAct.DriverFactory;

public class BaseClass {
	
	public WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
		String browser = Property.getData("browser");
		String url=Property.getData("url");
		WebDriver BrowserInstance = BrowserFactory.intilizeBrowser(browser);
		DriverFactory.getInstance().setDriver(BrowserInstance);
		 driver = DriverFactory.getInstance().getDriver();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get(url);
		
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		//DriverFactory.getInstance().getDriver().quit();
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
