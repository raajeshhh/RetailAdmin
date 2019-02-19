package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC028_RetailAdminPOM {
	private WebDriver driver; 

	public TC028_RetailAdminPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[3]/a")
	private WebElement customers;
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[3]/ul/li[2]/a")
	private WebElement customersactivity;
	
	@FindBy(id="input-customer")
	private WebElement customerfield;

	@FindBy(xpath="//*[@id=\"button-filter\"]")
	private WebElement filter;
	
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
	public void clickCustomers() {
		this.customers.click();
	}
	public void clickCustomersActivity() {
		this.customersactivity.click();
	}
	public void clickcustomerField() {
		this.customerfield.click();
	}
	public void sendCustomerField(String customerfield) {
		this.customerfield.clear();
		this.customerfield.sendKeys(customerfield);
	}
	public void clickfilter() {
		this.filter.click();
	}
}