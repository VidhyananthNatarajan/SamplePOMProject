package com.OrangeHRM.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OrangeHRM.CommonMethods.BaseClass;
import com.OrangeHRM.Pages.DashboardPage;
import com.OrangeHRM.Pages.LoginPage;

public class OrgangeHRM extends BaseClass {
	
@BeforeTest
	public void testinputs() {
	
	testcaseName ="Login functionality";
	testcaseDec ="To Validate whether user is able to login";
    author ="Automation Tester";
	category="smoketest";
		
	}


@Test (dataProvider ="getdata")	
public void loginHRM(String username, String password ) {

	LoginPage lp = new LoginPage();
	lp.enterUsername(username);
	lp.enterPassword(password);
	lp.clickbtn();
	
	DashboardPage dp = new DashboardPage();
	dp.clickadminlink();
	
	
} 


}
