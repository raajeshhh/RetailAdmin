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

public class TC058_RetailAdmin {

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
	public void addDiscountToProduct() throws InterruptedException {
		retailadmin.sendUserName("admin");
		retailadmin.sendPassword("admin@123");
		retailadmin.clickLoginBtn();
		retailadmin.Menu();
		retailadmin.Marketing();
		screenShot.captureScreenShot("seventyone");
		retailadmin.clickCoupons();
		screenShot.captureScreenShot("seventytwo");
		retailadmin.clickAddNewIcon();
		screenShot.captureScreenShot("seventythree");
		retailadmin.sendCouponName("Christm");
		retailadmin.sendCouponCode("coupon2");
		retailadmin.sendcouponDiscount("20");
		retailadmin.sendcouponProduct("Lorem ipsum dolor sit amet");
		screenShot.captureScreenShot("seventyfour");
		retailadmin.clickSaveBtn();
		
		String Actual="Coupons";
		String Expected=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/h1")).getText();
		Assert.assertEquals(Actual, Expected);
		screenShot.captureScreenShot("seventyfive");
	}
}