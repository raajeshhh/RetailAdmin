package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RetailAdminCustomersPOM {
	private WebDriver driver; 

	public RetailAdminCustomersPOM(WebDriver driver) {
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
	
	//Opening Customers sub menu
	@FindBy(xpath="//*[@id=\"menu-customer\"]/a/span")
	private WebElement customers;
	
	public void clickCustomers() {
		this.customers.click(); 
	}
		
	//Opening List of different sectors in customers section
	@FindBy(xpath="//*[@id=\"menu-customer\"]/ul/li[2]/a")
	private WebElement customerGroups;
	
	public void clickCustomerGroups() {
	this.customerGroups.click();
	}
	
	//Initiation of adding a new product
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a/i")
	private WebElement addnewicon;
	
	public void clickaddnewIcon() {
		this.addnewicon.click();
	}
	
	//Entering customer Group Name for adding a new one or editing the already existing one
	@FindBy(xpath="//*[@id=\"form-customer-group\"]/div[1]/div/div/input")
	private WebElement customerGroupName;
	
	public void sendCustomerGroupName(String customerGroupName) {
		this.customerGroupName.clear();
		this.customerGroupName.sendKeys(customerGroupName);
	}
	
	//Entering customer group description for adding a new one or editing the already existing one
	@FindBy(id="input-description1")
	private WebElement customerGroupDescription;
	
	public void sendCustomerGroupDescription(String customerGroupDescription) {
		this.customerGroupDescription.clear();
		this.customerGroupDescription.sendKeys(customerGroupDescription);
	}
	
	//Selecting New Customers approval as yes
	@FindBy(xpath="//*[@id=\"form-customer-group\"]/div[3]/div/label[1]/input")
	private WebElement approveNewCustomers;

	public void clickApproveNewCustomers() {
	this.approveNewCustomers.click();
	}
	
	//Saving the customer group details
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button/i")
	private WebElement saveIcon;
	
	public void clickSaveIcon() {
		this.saveIcon.click();
	}
	
	//Opening List of different sectors in customers section
	@FindBy(xpath="//*[@id=\"menu-customer\"]/ul/li[1]/a")
	private WebElement subCustomers;
	
	public void clickSubCustomers() {
	this.subCustomers.click();
	}
	
	//Entering first name
	@FindBy(id="input-firstname")
	private WebElement firstName; 

	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}

	//Entering last name
	@FindBy(id="input-lastname")
	private WebElement lastName; 

	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}
	
	//Entering Email
	@FindBy(id="input-email")
	private WebElement eMail; 

	public void sendeMail(String eMail) {
		this.eMail.clear();
		this.eMail.sendKeys(eMail);
	}

	//Entering Telephone details
	@FindBy(id="input-telephone")
	private WebElement telephone; 

	public void sendTelephone(String telephone) {
		this.telephone.clear();
		this.telephone.sendKeys(telephone);
	}
	
	//Entering password
	@FindBy(id="input-confirm")
	private WebElement confirmCustomerPassword; 

	public void sendConfirmCustomerPassword(String confirmCustomerPassword) {
		this.confirmCustomerPassword.clear();
		this.confirmCustomerPassword.sendKeys(confirmCustomerPassword);
	}	
}