package com.OrangeHRM.Pages;

import com.OrangeHRM.CommonMethods.BaseClass;

public class DashboardPage extends BaseClass {
	
	public AdminPage clickadminlink() {
		driver.findElementByLinkText("Admin").click();
		return new AdminPage();
		
	}

}
