package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RetailAdminReportsPOM {
	private WebDriver driver; 

	public RetailAdminReportsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	//Entering admin username
	@FindBy(id="input-username")
	private WebElement userName; 

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	//Entering admin password
	@FindBy(id="input-password")
	private WebElement password;

	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	//Clicking Login Button
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement loginBtn;
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	//Displaying Menu options
	@FindBy(xpath="//*[@id=\"button-menu\"]/i")
	private WebElement menu;
	
	public void Menu() {
		this.menu.click(); 
	}
	
	//Opening Reports sub menu
	@FindBy(xpath="//*[@id=\"menu-report\"]/a/span")
	private WebElement reports;
	
	public void clickReports() {
		this.reports.click(); 
	}
	
	//Opening List of different types of product reports
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[2]/a")
	private WebElement products;
	
	public void clickProducts() {
		this.products.click();
	}
	
	//Viewing the details of the Purchased products
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[2]/ul/li[2]/a")
	private WebElement purchased;
	
	public void clickPurchased() {
		this.purchased.click();
	}
	
	//Viewing the different categories of the customers reports
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[3]/a")
	private WebElement customers;
	
	public void clickCustomers() {
		this.customers.click();
	}
	
	//Customers online reports
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[3]/ul/li[1]/a")
	private WebElement customersonline;
	
	public void clickCustomersOnline() {
		this.customersonline.click();
	}
	
	//Report List of activities of the customers
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[3]/ul/li[2]/a")
	private WebElement customersactivity;
	
	public void clickCustomersActivity() {
		this.customersactivity.click();
	}
	
	//Entering details of the customer
	@FindBy(id="input-customer")
	private WebElement customerField;
	
	public void sendCustomerField(String customerField) {
		this.customerField.clear();
		this.customerField.sendKeys(customerField);
	}
	
	//Filtering the reports based on entered criteria
	@FindBy(xpath="//*[@id=\"button-filter\"]/i")
	private WebElement filterbtn;
	
	public void clickFilterBtn() {
		this.filterbtn.click(); 
	}
	
	//Logging out from the session
	@FindBy(xpath="//*[@id=\"header\"]/ul/li[4]/a/span")
    private WebElement logoutBtn;
	
	public void clickLogoutBtn() {
		this.logoutBtn.click(); 
	}
}