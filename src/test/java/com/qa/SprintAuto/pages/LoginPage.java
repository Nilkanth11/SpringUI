package com.qa.SprintAuto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	@FindBy(how = How.NAME, using = "UserName")
	public WebElement txtUserName;
	@FindBy(how = How.NAME, using = "Password")
	public WebElement txtPassword;
	@FindBy(how = How.CSS, using = ".btn-default")
	public WebElement btnLogin;
	
	public void doLogin(String userName, String password) {
		//txtUserName.sendKeys(userName);
		//txtPassword.sendKeys(password);
		
		System.out.println("Send : " + userName + " and Password : " +password);
	}
	
	public void doClick() {
		//btnLogin.click();
		
		System.out.println("Click on Login button");
	}

}
