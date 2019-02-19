package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC030_RetailUserLoginPOM {
	private WebDriver driver; 

	public TC030_RetailUserLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a/span/span/i")
	private WebElement user;
	
	@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/ul/li[1]/a/span")
	private WebElement login;
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	private WebElement email;

	@FindBy(id="input-password")
	private WebElement password;

	@FindBy(xpath="//*[@id=\"System_nyHsmShk\"]/div/div[2]/div/form/div/div[2]/input")
	private WebElement loginBtn;

   
	public void Account() {
		this.user.click(); 
	}
	public void login() {
		this.login.click(); 
	}

	public void email(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	public void password(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}