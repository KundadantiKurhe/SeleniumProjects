package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class RegistationPage extends BaseClass {

	public RegistationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='ico-register']")
	WebElement registerButton;
	
	@FindBy(xpath="//*[@id='gender-female']")
	WebElement radio;
	
	@FindBy(xpath="//*[@id='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id='LastName']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement emailId;
	
	@FindBy(xpath="//*[@name='Password']")
	WebElement password;
	
	@FindBy(xpath="//*[@name='ConfirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//*[@id='register-button']")
	WebElement register;
	
	@FindBy(xpath="(//a[@class='account'])[1]")
	WebElement account;
	
	public void registerUser(String first, String last, String email ) {
		registerButton.click();
		radio.click();
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		emailId.sendKeys(email);
	}
	
	public void userPassword(String pass, String confirmPass) {
		password.sendKeys(pass);
		confirmPassword.sendKeys(confirmPass);
	}
	
	public void confirmRegister() {
		register.click();
	}
	
	public String user() {
		String acc = account.getText();
		return acc;
	}
}
