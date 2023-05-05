package com.eon.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_LoginPage {
	
	WebDriver driver;
	
	@FindBy(how = How.ID, using="id_username")
	private WebElement emailAddress;
	
	@FindBy(how = How.ID, using="id_password")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using="//input[@type='submit']")
	private WebElement logInButton;
	
	public PO_LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Methods
	
	public void enterEmailAddress()
	{
		emailAddress.sendKeys("yugensys.eon+qa@eongroup.co");
	}
	public void enterPassword()
	{
		password.sendKeys("Test@1234");
	}
	public void clickLogInButton()
	{
		logInButton.click();
	}
	
	//Bussiness Logic
	
	public void verifyLogin()
	{
		enterEmailAddress();
		enterPassword();
		clickLogInButton();
	}
	
}
