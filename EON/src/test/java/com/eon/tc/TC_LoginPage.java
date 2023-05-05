package com.eon.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eon.po.PO_LoginPage;
import com.eon.utils.BrowserManger;

public class TC_LoginPage extends BrowserManger{

	WebDriver driver;
	PO_LoginPage loginPage;

	@BeforeMethod()
	public void Init() {
		
		driver = BrowserManger.getDriver();
		loginPage = PageFactory.initElements(driver, PO_LoginPage.class);
	}

	@Test(description = "Check the Login")
	public void ValidLogin() {
		loginPage.verifyLogin();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
