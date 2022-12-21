package com.TutorialNinja.TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TutorialNinja.BaseScript.BaseClass;
import com.TutorialNinja.WebDriverAct.DriverFactory;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement lnk_MyAccount;
	@FindBy(xpath="//a[text()='Login']")
	private WebElement lnk_Login;
	@FindBy(xpath="//input[@name='email']")
	private WebElement txt_Emailfield;
	@FindBy(xpath="//input[@name='password']")
	private WebElement txt_passwordfield;
	@FindBy(xpath="//input[@value='Login']")
	private WebElement Btn_Login;
	
	
	
	
	public LoginPage() {
		PageFactory.initElements(DriverFactory.getInstance().getDriver(),this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
