package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TC030_RetailUserLoginPOM {
	private WebDriver driver; 

	public TC030_RetailUserLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a/span/span/i")
	private WebElement user;
	
	public void Account() {
		this.user.click();
	}
	
	/*@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/ul/li[1]/a/span")
	private WebElement login;
	
	public void login() {
		this.login.click();
	}*/
	
	@FindBy(id="input-email")
	private WebElement email;
	
	public void email(String email) {
			this.email.clear();
			this.email.sendKeys(email);
		}

	@FindBy(id="input-password")
	private WebElement password;
	public void password(String password) {
			this.password.clear();
			this.password.sendKeys(password);
		}

	@FindBy(xpath="//*[@id=\"System_nyHsmShk\"]/div/div[2]/div/form/div/div[2]/input")
	private WebElement loginBtn;
	
	public void clickLoginBtn() {
			this.loginBtn.click();
		}
	
	@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a/span/span/i")
	private WebElement userIcon;
	
	public void clickUserIcon() {
			this.userIcon.click();
		}
	
	@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/ul/li[4]/a/span")
	private WebElement LogoutBtn;
	
	public void clickLogoutBtn() {
			this.LogoutBtn.click();
		}
}