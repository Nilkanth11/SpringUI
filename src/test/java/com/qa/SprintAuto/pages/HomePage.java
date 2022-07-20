package com.qa.SprintAuto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.*;

public class HomePage {

	@FindBy(how = How.LINK_TEXT, using = "Login")
	public WebElement lnkLogin;

	@FindBy(how = How.LINK_TEXT, using = "Employee List")
	public WebElement lnkEmpList;

	public LoginPage clickLogin() {
		//lnkLogin.click();
		System.out.println("Click login");
		return new LoginPage();
	}

	public void clickEmpList() {
		//lnkEmpList.click();
		System.out.println("Click Emp list");
	}
}
