package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.RetailAdminCustomersPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC088_RetailAdmin {

	private WebDriver driver;
	private String baseUrl;
	private RetailAdminCustomersPOM retailadmin;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		retailadmin = new RetailAdminCustomersPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(dataProvider = "excel-inputs1", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String customerGroupName,String customerGroupDescription,String firstName,String lastName,String eMail,String Telephone,String password,String confirmCustomerPassword) throws InterruptedException {
		retailadmin.sendUserName("admin");
		retailadmin.sendPassword("admin@123");
		retailadmin.clickLoginBtn();
		retailadmin.Menu();
		retailadmin.clickCustomers();
		screenShot.captureScreenShot("108");
		retailadmin.clickCustomerGroups();
		screenShot.captureScreenShot("109");
		retailadmin.clickaddnewIcon();
		screenShot.captureScreenShot("110");
		retailadmin.sendCustomerGroupName(customerGroupName);
		retailadmin.sendCustomerGroupDescription(customerGroupDescription);
		retailadmin.clickApproveNewCustomers();
		screenShot.captureScreenShot("111");
		retailadmin.clickSaveIcon();
		screenShot.captureScreenShot("112");
		retailadmin.clickSubCustomers();
		screenShot.captureScreenShot("113");
		retailadmin.clickaddnewIcon();
		screenShot.captureScreenShot("114");
		
		Select dropdown= new Select(driver.findElement(By.id("input-customer-group")));
		dropdown.selectByVisibleText("privileged customer");
		
		retailadmin.sendFirstName(firstName);
		retailadmin.sendLastName(lastName);
		retailadmin.sendeMail(eMail);
		retailadmin.sendTelephone(Telephone);
		screenShot.captureScreenShot("115");
		retailadmin.sendPassword(password);
		retailadmin.sendConfirmCustomerPassword(confirmCustomerPassword);
		screenShot.captureScreenShot("116");
		retailadmin.clickSaveIcon();
		
		String Actual="Customers";
		String Expected=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/h1")).getText();
		Assert.assertEquals(Actual, Expected);
		screenShot.captureScreenShot("117");
	}
}