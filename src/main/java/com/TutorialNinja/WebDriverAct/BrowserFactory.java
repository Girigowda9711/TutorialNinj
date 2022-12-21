package com.TutorialNinja.WebDriverAct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	
	public static WebDriver intilizeBrowser(String browserName) {
		
		 WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver=new ChromeDriver(options);
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions foptions = new FirefoxOptions();
			foptions.addArguments("-private");
			driver=new FirefoxDriver(foptions);
		}
		if(browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.edgedriver().setup();
			//InternetExplorerOptions iOptions = new InternetExplorerOptions();
			//iOptions.addCommandSwitches("-private");
			driver=new EdgeDriver();
		}
		
		
		
		return driver;
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
