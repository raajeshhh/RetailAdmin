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
import com.training.pom.RetailAdminMarketingPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC059_RetailAdmin {

	private WebDriver driver;
	private String baseUrl;
	private RetailAdminMarketingPOM retailadmin;
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
		retailadmin = new RetailAdminMarketingPOM(driver);
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
	public void addAffiliate() throws InterruptedException {
		retailadmin.sendUserName("admin");
		retailadmin.sendPassword("admin@123");
		retailadmin.clickLoginBtn();
		retailadmin.Menu();
		retailadmin.Marketing();
		screenShot.captureScreenShot("seventysix");
		retailadmin.clickAffiliates();
		screenShot.captureScreenShot("seventyseven");
		retailadmin.clickAddNewIcon();
		screenShot.captureScreenShot("seventyeight");
		retailadmin.sendAffiliatesFirstName("manzoor");
		retailadmin.sendAffiliatesLastName("mehadi");
		retailadmin.sendAffiliatesEmail("purposework23@gmail.com");
		retailadmin.sendAffiliatesTelephone("9876543210");
		retailadmin.sendAffiliatePassword("manzoor1");
		retailadmin.sendAffiliateConfirmPassword("manzoor1");
		screenShot.captureScreenShot("sevetynine");
		retailadmin.clickAffiliateAddress1();
		retailadmin.sendAffiliateAddress1("yeshwanthapur");
		retailadmin.sendAffiliateAddress2("bangalore");
		retailadmin.sendAffiliatecity("bangalore");
		retailadmin.sendAffiliatePostcode("560022");
		retailadmin.sendcountry("India");
		Thread.sleep(7000);
		retailadmin.sendregion("Karnataka");
		Thread.sleep(7000);
		screenShot.captureScreenShot("eighty");
		retailadmin.clickPaymentDetailsTab();
		retailadmin.sendcheque("test");
		retailadmin.clickSaveBtn();
		
		String Actual="Affiliates";
		String Expected=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/h1")).getText();
		Assert.assertEquals(Actual, Expected);
		screenShot.captureScreenShot("eightyone");
	}
}