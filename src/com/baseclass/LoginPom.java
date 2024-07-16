package com.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom extends BaseClass {
	
	public LoginPom() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "username")
	private WebElement username;

	public WebElement getName() {
		return username;
	}
	@FindBy(name = "password" )
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	
		private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(id ="email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	@FindBy(id="pass")
	private WebElement passwords;

	public WebElement getPasswords() {
		return passwords;
	}
	@FindBy(id = "loginbutton")
	private WebElement loginButon;

	public WebElement getLoginButon() {
		return loginButon;
	}
	// letcode
	@FindBy(name = "email")
	private WebElement letEmail;

	public WebElement getlEmail() {
		return letEmail;
	}
	@FindBy(name = "password")
	private WebElement letpass;

	public WebElement getIpass() {
		return letpass;
	}
	@FindBy(xpath = "(//button[@class='button is-primary'])[1]")
	private WebElement letlogin;

	public WebElement getLlogin() {
		return letlogin;
	}
	
	
	}
	
    

