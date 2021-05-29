package com.OrangeHRM.Pages;

import com.OrangeHRM.CommonMethods.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage enterusername(String username) {
		driver.findElementById("txtUsername").sendKeys(username);
		return this;
		
	}
	
	public LoginPage enterpassword(String password) {
		driver.findElementById("txtPassword").sendKeys(password);
		return this;
		
	}
	public AdminPage clickbtn() {
	driver.findElementById("btnLogin").click();
	return new AdminPage();
	}
}
