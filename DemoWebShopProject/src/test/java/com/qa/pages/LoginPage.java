package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//*[@class='ico-login']")
	WebElement logInButton;
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement userId;
	
	@FindBy(xpath="//*[@id='Password']")
	WebElement password;

	@FindBy(xpath="//*[@class='button-1 login-button']")
	WebElement loginContinue;
	
	@FindBy(xpath="(//a[@class='account'])[1]")
	WebElement account;
	
	public void logInCredentials(String id, String pass) {
		logInButton.click();
		userId.sendKeys(id);
		password.sendKeys(pass);
	}
	
	public void logInButton() {
		loginContinue.click();
	}
	
	public String accountVerify() {
		String acc = account.getText();
		return acc;
	}
}
