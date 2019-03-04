package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailAdminCatalogPOM {
	private WebDriver driver; 

	public RetailAdminCatalogPOM(WebDriver driver) {
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
	
	//Displaying catalog sub options
	@FindBy(xpath="//*[@id=\"menu-catalog\"]/a/span")
	private WebElement catalog;
	
	public void Catalog() {
		this.catalog.click(); 
	}
	
	//Opening Products Window
	@FindBy(xpath="//*[@id=\"menu-catalog\"]/ul/li[2]/a")
	private WebElement products;
	
	public void clickProducts() {
		this.products.click(); 
	}
	
	//Initiation of adding a new product
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a/i")
	private WebElement addnewicon;
	
	public void clickaddnewIcon() {
		this.addnewicon.click();
	}
	
	//Editing one of the already existing product
	@FindBy(xpath="//*[@id=\"form-product\"]/div/table/tbody/tr[1]/td[8]/a/i")
	private WebElement editicon;
	
	public void clickEditIcon() {
		this.editicon.click();
	}
	
	//Entering product Name for adding a new one or editing the already existing one
	@FindBy(id="input-name1")
	private WebElement productName;
	
	public void sendProductName(String productName) {
		this.productName.clear();
		this.productName.sendKeys(productName);
	}
	
	//Entering meta tag title
	@FindBy(id="input-meta-title1")
	private WebElement metaTagTitle;
	
	public void sendmetaTagTitle(String metaTagTitle) {
		this.metaTagTitle.clear();
		this.metaTagTitle.sendKeys(metaTagTitle);
	}
	
	//Opening Data tab
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[2]/a")
	private WebElement DataTab;
	
	public void clickDataTab() {
		this.DataTab.click();
	}
	
	//Filling Product Model text box
	@FindBy(id="input-model")
	private WebElement model;
	
	public void sendModel(String model) {
		this.model.clear();
		this.model.sendKeys(model);
	}
	
	//Entering Product Price
	@FindBy(id="input-price")
	private WebElement price;
	
	public void sendPrice(String price) {
		this.price.clear();
		this.price.sendKeys(price);
	}
	
	//Product Quantity
	@FindBy(id="input-quantity")
	private WebElement quantity;
	
	public void sendquantity(String quantity) {
		this.quantity.clear();
		this.quantity.sendKeys(quantity);
	}
	
	//Product SEOURL
	@FindBy(id="input-keyword")
	private WebElement SEOURL;
	
	public void sendSEOURL(String SEOURL) {
		this.SEOURL.clear();
		this.SEOURL.sendKeys(SEOURL);
	}
	
	//Opening Product Discount tab
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[7]/a")
	private WebElement DiscountTab;
		
	public void clickDiscountTab() {
		this.DiscountTab.click();
	}
	
	//Initiation of adding a new discount for the product
	@FindBy(xpath="//*[@id=\"discount\"]/tfoot/tr/td[2]/button/i")
	private WebElement AddDiscount;
	
	public void clickAddDiscount() {
		this.AddDiscount.click();
	}
	
	//Mentioning the no. of discounts
	@FindBy(name="product_discount[0][quantity]")
	private WebElement discountQuantity;
	
	public void senddiscountQuantity(String discountQuantity) {
		this.discountQuantity.sendKeys(discountQuantity);
	}
	
	//Describing discount price
	@FindBy(name="product_discount[0][price]")
	private WebElement discountPrice;
	
	public void senddiscountPrice(String discountPrice) {
		this.discountPrice.sendKeys(discountPrice);
	}
	
	//Opening Product Links tab	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[3]/a")
	private WebElement LinksTab;
	
	public void clickLinksTab() {
		this.LinksTab.click();
	}
	
	//Entering into categories field
	@FindBy(id="input-category")
	private WebElement categories;
	
	public void clickCategories() {
		this.categories.click();
	}
	
	//Entering different categories' values
	/*@FindBy(id="input-category")
	private WebElement categories;
	
	public void sendCategories(String categories) {
		this.categories.clear();
		this.categories.sendKeys(categories);
	}*/
	
	//Opening products attributes tab
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[4]/a")
	private WebElement AttributeTab;
	
	public void clickAttributeTab() {
		this.AttributeTab.click();
	}
	
	//Opening Options tab
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[5]/a")
	private WebElement OptionTab;
	
	public void clickOptionTab() {
		this.OptionTab.click();
	}
	
	//Opening Products Recurring tab
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[6]/a")
	private WebElement RecurringTab;
	
	public void clickRecurringTab() {
		this.RecurringTab.click();
	}
	
	//Opening Products Special tab
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[8]/a")
	private WebElement SpecialTab;
	
	public void clickSpecialTab() {
		this.SpecialTab.click();
	}
	
	//Opening Products Image Tab
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[9]/a")
	private WebElement ImageTab;
	
	public void clickImageTab() {
		this.ImageTab.click();
	}
	
	//Opening Products Reward Points tab
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[10]/a")
	private WebElement RewardPointsTab;
	
	public void clickRewardPointsTab() {
		this.RewardPointsTab.click();
	}

	//Opening Design tab
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[11]/a")
	private WebElement DesignTab;
	
	public void clickDesignTab() {
		this.DesignTab.click();
	}
	
	//Saving the changes of the details of the products
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button/i")
	private WebElement saveBtn;
	
	public void clickSaveBtn() {
		this.saveBtn.click(); 
	}
}