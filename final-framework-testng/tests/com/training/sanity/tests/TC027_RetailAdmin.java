package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.TC027_RetailAdminPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC027_RetailAdmin {

	private WebDriver driver;
	private String baseUrl;
	private TC027_RetailAdminPOM retailadmin;
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
		retailadmin = new TC027_RetailAdminPOM(driver); 
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
	@Test
	public void customersOnline() throws InterruptedException {
		retailadmin.sendUserName("admin");
		retailadmin.sendPassword("admin@123");
		screenShot.captureScreenShot("nine");
		retailadmin.clickLoginBtn();
		Thread.sleep(3000);
		screenShot.captureScreenShot("ten");
		retailadmin.Menu();
		screenShot.captureScreenShot("eleven");
		retailadmin.clickReports();
		screenShot.captureScreenShot("twelve");
		retailadmin.clickCustomers();
		screenShot.captureScreenShot("thirteen");
		retailadmin.clickCustomersOnline();
		screenShot.captureScreenShot("fourteen");
		retailadmin.sendCustomerField("manzoor");
		screenShot.captureScreenShot("fifteen");
		retailadmin.clickFilterBtn();
		Thread.sleep(1000);
		screenShot.captureScreenShot("sixteen");
		/*retailadmin.sendCustomerField("guest");
		retailadmin.clickfilter();
		screenShot.captureScreenShot("seven");*/
	}
}