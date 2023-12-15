package com.OrangeHRM.Pages;

import com.OrangeHRM.CommonMethods.BaseClass;

public class LoginPage extends BaseClass {
	
	
	public LoginPage enterusername(String username) {
		
	  driver.findElementByXPath("//input[@placeholder='Username']").sendKeys(username);	
	  return this;
	}
	
	
	public LoginPage enterpassword(String password) {
		driver.findElementByXPath("//input[@placeholder='Password']").sendKeys(password);
		return this;
		
	}
	public DashboardPage clickbtn() {
	driver.findElementByXPath("//button[text()=' Login ']").click();
	return new DashboardPage();
	
	
	}
	
		
}
