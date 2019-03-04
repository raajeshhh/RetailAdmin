package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailAdminMarketingPOM {
	private WebDriver driver; 

	public RetailAdminMarketingPOM(WebDriver driver) {
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
	
	//Opening Marketing sub menu
	@FindBy(xpath="//*[@id=\"menu-marketing\"]/a/span")
	private WebElement marketing;
	
	public void Marketing() {
		this.marketing.click(); 
	}
	
	//Opening Coupons window
	@FindBy(xpath="//*[@id=\"menu-marketing\"]/ul/li[3]/a")
	private WebElement coupons;
	
	public void clickCoupons() {
		this.coupons.click(); 
	}

	//Adding a new coupon
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a/i")
	private WebElement addnewicon;
	
	public void clickAddNewIcon() {
		this.addnewicon.click();
	}
	
	//Entering coupon name details
	@FindBy(id="input-name")
	private WebElement couponName;
	
	public void sendCouponName(String couponName) {
		this.couponName.clear();
		this.couponName.sendKeys(couponName);
	}
	
	//Entering coupon code details
	@FindBy(id="input-code")
	private WebElement couponCode;
	
	public void sendCouponCode(String couponCode) {
		this.couponCode.clear();
		this.couponCode.sendKeys(couponCode);
	}
	
	//Entering coupon discount details
	@FindBy(id="input-discount")
	private WebElement couponDiscount;
	
	public void sendcouponDiscount(String couponDiscount) {
		this.couponDiscount.clear();
		this.couponDiscount.sendKeys(couponDiscount);
	}
	
	//Entering coupon product details
	@FindBy(id="input-product")
	private WebElement couponProduct;
	
	public void sendcouponProduct(String couponProduct) {
		this.couponProduct.clear();
		this.couponProduct.sendKeys(couponProduct);
	}
	
	//Opening Affiliates window
	@FindBy(xpath="//*[@id=\"menu-marketing\"]/ul/li[2]/a")
	private WebElement affiliates;
	
	public void clickAffiliates() {
		this.affiliates.click(); 
	}
	
	//Entering affiliates firstname
	@FindBy(id="input-firstname")
	private WebElement affiliatesFirstName;
	
	public void sendAffiliatesFirstName(String affiliatesFirstName) {
		this.affiliatesFirstName.clear();
		this.affiliatesFirstName.sendKeys(affiliatesFirstName);
	}
	
	//Entering affiliates lastname
	@FindBy(id="input-lastname")
	private WebElement affiliatesLastName;
	
	public void sendAffiliatesLastName(String affiliatesLastName) {
		this.affiliatesLastName.clear();
		this.affiliatesLastName.sendKeys(affiliatesLastName);
	}
	
	////Entering affiliates Email
	@FindBy(id="input-email")
	private WebElement affiliatesEmail;
	
	public void sendAffiliatesEmail(String affiliatesEmail) {
		this.affiliatesEmail.clear();
		this.affiliatesEmail.sendKeys(affiliatesEmail);
	}
	
	//Entering affiliates telephone number
	@FindBy(id="input-telephone")
	private WebElement affiliatesTelephone;
	
	public void sendAffiliatesTelephone(String affiliatesTelephone) {
		this.affiliatesTelephone.clear();
		this.affiliatesTelephone.sendKeys(affiliatesTelephone);
	}
	
	//Entering affiliates password
	@FindBy(id="input-password")
	private WebElement affiliatePassword;
	
	public void sendAffiliatePassword(String affiliatePassword) {
		this.affiliatePassword.clear();
		this.affiliatePassword.sendKeys(affiliatePassword);
	}
	
	//Confirming affiliates password
	@FindBy(id="input-confirm")
	private WebElement affiliateConfirmPassword;
	
	public void sendAffiliateConfirmPassword(String affiliateConfirmPassword) {
		this.affiliateConfirmPassword.clear();
		this.affiliateConfirmPassword.sendKeys(affiliateConfirmPassword);
	}
	
	//Entering into affiliates Address1 field
	@FindBy(xpath="//*[@id=\"input-address-1\"]")
	private WebElement affiliateAddress1;
	
	public void clickAffiliateAddress1() {
		this.affiliateAddress1.click();
	}
	
	//Entering value in affiliates address1
	@FindBy(id="input-address-1")
	private WebElement enterAffiliateAddress1;
	
	public void sendAffiliateAddress1(String enterAffiliateAddress1) {
		this.enterAffiliateAddress1.clear();
		this.enterAffiliateAddress1.sendKeys(enterAffiliateAddress1);
	}
	
	//Entering value in affiliates address2
	@FindBy(id="input-address-2")
	private WebElement enterAffiliateAddress2;
	
	public void sendAffiliateAddress2(String enterAffiliateAddress2) {
		this.enterAffiliateAddress2.clear();
		this.enterAffiliateAddress2.sendKeys(enterAffiliateAddress2);
	}
	
	//Entering value in affiliates city
	@FindBy(id="input-city")
	private WebElement affiliateCity;
	
	public void sendAffiliatecity(String affiliateCity) {
		this.affiliateCity.clear();
		this.affiliateCity.sendKeys(affiliateCity);
	}
	
	//Entering value in affiliates postcode
	@FindBy(id="input-postcode")
	private WebElement affiliatePostcode;
	
	public void sendAffiliatePostcode(String affiliatePostcode) {
		this.affiliatePostcode.clear();
		this.affiliatePostcode.sendKeys(affiliatePostcode);
	}
	
	//Selecting valid value from affiliates country drop down
	@FindBy(id="input-country")
	private WebElement country; 

	public void sendcountry(String country) {
		this.country.sendKeys(country);
	}
	
	//Entering valid value in affiliates region/state drop down
	@FindBy(id="input-zone")
	private WebElement region; 

	public void sendregion(String region) {
		this.region.sendKeys(region);
	}
	
	//Entering into payment details tab	
	@FindBy(xpath="//*[@id=\"form-affiliate\"]/ul/li[2]/a")
	private WebElement PaymentDetailsTab;
	
	public void clickPaymentDetailsTab() {
		this.PaymentDetailsTab.click();
	}
	
	//Entering cheque details in cheque field
	@FindBy(id="input-cheque")
	private WebElement cheque;
	
	public void sendcheque(String cheque) {
		this.cheque.clear();
		this.cheque.sendKeys(cheque);
	}
	
	//Saving the edited details
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button/i")
	private WebElement saveBtn;
	
	public void clickSaveBtn() {
		this.saveBtn.click();
	}
	
	//Opening Mail window
	@FindBy(xpath="//*[@id=\"menu-marketing\"]/ul/li[4]/a")
	private WebElement mail;
	
	public void clickMail() {
		this.mail.click(); 
	}
	
	//Entering the recipient list details in toMail field
	@FindBy(id="input-to")
	private WebElement toMail; 

	public void sendToMail(String toMail) {
		this.toMail.sendKeys(toMail);
	}
	
	//Entering the mail subject in mail subject field
	@FindBy(id="input-subject-1")
	private WebElement mailSubject;
	
	public void sendMailSubject(String mailSubject) {
		this.mailSubject.clear();
		this.mailSubject.sendKeys(mailSubject);
	}
	
	//Enter valid text message to be sent to recipient
	@FindBy(xpath="//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]")
	private WebElement mailMessage;
	
	public void sendMailMessage(String mailMessage) {
		this.mailMessage.clear();
		this.mailMessage.sendKeys(mailMessage);
	}
	
	//Send the mail
	@FindBy(xpath="//*[@id=\"button-send\"]/i")
	private WebElement mailSendBtn;
	
	public void clickMailSendBtn() {
		this.mailSendBtn.click();
	}
}