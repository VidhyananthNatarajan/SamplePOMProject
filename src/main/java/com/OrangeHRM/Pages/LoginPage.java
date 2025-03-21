package com.OrangeHRM.Pages;

import org.openqa.selenium.By;

import com.OrangeHRM.CommonMethods.BaseClass;

public class LoginPage extends BaseClass {
	
public LoginPage enterUsername(String username) {
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username); 
	return this;

 }	
 
 public LoginPage enterPassword(String password) {
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	 return this;

 }
 
public DashboardPage clickbtn() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
    return new DashboardPage();
 }
	
	
	  
}
