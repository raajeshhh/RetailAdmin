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
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[2]/a")
	private WebElement products;
	
	public void clickProducts() {
		this.products.click();
	}
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[2]/ul/li[2]/a")
	private WebElement purchased;
	
	public void clickPurchased() {
		this.purchased.click();
	}
	
	@FindBy(id="input-status")
	private WebElement orderStatus; 

	public void sendorderStatus(String orderStatus) {
		this.orderStatus.sendKeys(orderStatus);
	}
	
	@FindBy(xpath="//*[@id=\"button-filter\"]/i")
	private WebElement filterbtn;
	
	public void clickFilterBtn() {
		this.filterbtn.click(); 
	}
}