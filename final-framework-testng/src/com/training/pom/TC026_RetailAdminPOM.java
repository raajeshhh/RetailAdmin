package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC026_RetailAdminPOM {
	private WebDriver driver; 

	public TC026_RetailAdminPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="input-username")
	private WebElement userName; 

	@FindBy(id="input-password")
	private WebElement password;

	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"button-menu\"]/i")
	private WebElement menu; 
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/a/span")
	private WebElement reports;
	
	@FindBy(xpath="<a class=\"parent\">Products</a>")
	private WebElement products;
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[2]/ul/li[2]/a")
	private WebElement purchased;
	
	@FindBy(xpath="//*[@id=\"input-status\"]")
	private WebElement orderstatus;
	
	/*@FindBy(id="input-customer")
	private WebElement customerfield;
	
	@FindBy(xpath="//*[@id=\"button-filter\"]")
	private WebElement filter;*/
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}

	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void Menu() {
		this.menu.click(); 
	}
	public void clickReports() {
		this.reports.click(); 
	}
	public void clickProducts() {
		this.products.click();
	}
	public void clickPurchased() {
		this.purchased.click();
	}
	public void clickOrderStatus() {
		this.orderstatus.click();
	}
	/*public void sendCustomerField(String customerfield) {
		this.customerfield.clear();
		this.customerfield.sendKeys(customerfield);
	}
	public void clickfilter() {
		this.filter.click();
	}*/
}