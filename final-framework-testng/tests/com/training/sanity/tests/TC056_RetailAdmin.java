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
import com.training.pom.RetailAdminCatalogPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC056_RetailAdmin {

	private WebDriver driver;
	private String baseUrl;
	private RetailAdminCatalogPOM retailadmin;
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
		retailadmin = new RetailAdminCatalogPOM(driver);
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
	public void addDiscountToExistingProduct() throws InterruptedException {
		retailadmin.sendUserName("admin");
		retailadmin.sendPassword("admin@123");
		retailadmin.clickLoginBtn();
		retailadmin.Menu();
		retailadmin.Catalog();
		screenShot.captureScreenShot("thirtyfour");
		retailadmin.clickProducts();
		screenShot.captureScreenShot("thirtyfive");
		retailadmin.clickEditIcon();
		screenShot.captureScreenShot("thirtysix");
		retailadmin.clickDataTab();
		screenShot.captureScreenShot("thirtyseven");
		retailadmin.sendSEOURL("home2");
		retailadmin.sendquantity("45");
		screenShot.captureScreenShot("thirtyeight");
		retailadmin.clickDiscountTab();
		screenShot.captureScreenShot("thirtynine");
		retailadmin.clickAddDiscount();
		screenShot.captureScreenShot("forty");
		retailadmin.senddiscountQuantity("1");
		retailadmin.senddiscountPrice("50");
		screenShot.captureScreenShot("fortyone");
		retailadmin.clickLinksTab();
		screenShot.captureScreenShot("fortytwo");
		retailadmin.clickAttributeTab();
		screenShot.captureScreenShot("fortythree");
		retailadmin.clickOptionTab();
		screenShot.captureScreenShot("fortyfour");
		retailadmin.clickRecurringTab();
		screenShot.captureScreenShot("fortyfive");
		retailadmin.clickSpecialTab();
		screenShot.captureScreenShot("fortysix");
		retailadmin.clickImageTab();
		screenShot.captureScreenShot("fortyseven");
		retailadmin.clickRewardPointsTab();
		screenShot.captureScreenShot("fortyeight");
		retailadmin.clickDesignTab();
		screenShot.captureScreenShot("fortynine");
		retailadmin.clickSaveBtn();
		
		String Actual="Products";
		String Expected=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/h1")).getText();
		Assert.assertEquals(Actual, Expected);
		screenShot.captureScreenShot("fifty");	
	}
}