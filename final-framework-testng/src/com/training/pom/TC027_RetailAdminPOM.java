package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC027_RetailAdminPOM {
	private WebDriver driver; 

	public TC027_RetailAdminPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="input-username")
	private WebElement userName;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	@FindBy(id="input-password")
	private WebElement password;
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password);
	}

	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement loginBtn;
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	@FindBy(xpath="//*[@id=\"button-menu\"]/i")
	private WebElement menu;
	
	public void Menu() {
		this.menu.click(); 
	}
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/a/span")
	private WebElement reports;
	
	public void clickReports() {
		this.reports.click();
	}
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[3]/a")
	private WebElement customers;
	
	public void clickCustomers() {
		this.customers.click();
	}
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[3]/ul/li[1]/a")
	private WebElement customersonline;
	
	public void clickCustomersOnline() {
		this.customersonline.click();
	}
	
	@FindBy(id="input-customer")
	private WebElement customerField;
	
	public void sendCustomerField(String customerField) {
		this.customerField.clear();
		this.customerField.sendKeys(customerField);
	}
	
	@FindBy(xpath="//*[@id=\"button-filter\"]")
	private WebElement filterbtn;
	
	public void clickFilterBtn() {
		this.filterbtn.click(); 
	}
}