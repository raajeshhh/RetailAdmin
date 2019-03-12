package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RetailUserDetailsPOM {
	private WebDriver driver; 

	public RetailUserDetailsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//Entering into User Login page of the site
	@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/ul/li[1]/a/span")
	private WebElement login;
	
	public void login() {
		this.login.click();
	}
	
	//Entering user email
	@FindBy(id="input-email")
	private WebElement email;
	
	public void email(String email) {
			this.email.clear();
			this.email.sendKeys(email);
		}

	//Entering user password
	@FindBy(id="input-password")
	private WebElement password;
	public void password(String password) {
			this.password.clear();
			this.password.sendKeys(password);
		}

	//Clicking Login Button
	@FindBy(xpath="//*[@id=\"System_nyHsmShk\"]/div/div[2]/div/form/div/div[2]/input")
	private WebElement loginBtn;
	
	public void clickLoginBtn() {
			this.loginBtn.click();
		}
	
	@FindBy(xpath="//*[@id=\"menu_all_categories_Menu_VIfWm2LT_Ytne9\"]/ul/li[2]/a/span")
	private WebElement ethnicLink;
	
	public void clickEthnicLink() {
			this.ethnicLink.click();
		}
	
	@FindBy(xpath="//*[@id=\"ProductsSystem_QQI8r357\"]/div[1]/div[1]/div/div[2]/div[1]/a/span/span/img")
	private WebElement integerVitaeIaculisMassa;
	
	public void clickIntegerVitaeIaculisMassa() {
			this.integerVitaeIaculisMassa.click();
		}
	
	@FindBy(id="button-cart")
	private WebElement addToCart;
	
	public void clickAddToCart() {
			this.addToCart.click();
		}
	
	
	//Clicking user Button for menu
	@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a/span/span/i")
	private WebElement userIcon;
	
	public void clickUserIcon() {
			this.userIcon.click();
		}
	
	//Logging out from the session
	@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/ul/li[4]/a/span")
	private WebElement LogoutBtn;
	
	public void clickLogoutBtn() {
			this.LogoutBtn.click();
		}
}