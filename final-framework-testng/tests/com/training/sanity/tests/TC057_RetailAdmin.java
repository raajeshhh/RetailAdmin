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

public class TC057_RetailAdmin {

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
	public void addProductWithDiscount() throws InterruptedException {
		retailadmin.sendUserName("admin");
		retailadmin.sendPassword("admin@123");
		retailadmin.clickLoginBtn();
		retailadmin.Menu();
		retailadmin.Catalog();
		screenShot.captureScreenShot("fiftyone");
		retailadmin.clickProducts();
		screenShot.captureScreenShot("fiftytwo");
		retailadmin.clickaddnewIcon();
		screenShot.captureScreenShot("fiftythree");
		retailadmin.sendProductName("Finger Ring");
		retailadmin.sendmetaTagTitle("Finger Ring for ladies");
		screenShot.captureScreenShot("fiftyfour");
		retailadmin.clickDataTab();
		screenShot.captureScreenShot("fiftyfive");
		retailadmin.sendModel("SKU-012");
		retailadmin.sendPrice("500");
		retailadmin.sendquantity("50");
		screenShot.captureScreenShot("fiftysix");
		retailadmin.clickLinksTab();
		retailadmin.clickCategories();
		screenShot.captureScreenShot("fiftyseven");
		retailadmin.clickDiscountTab();
		screenShot.captureScreenShot("fiftynine");
		retailadmin.clickAddDiscount();
		screenShot.captureScreenShot("sixty");
		retailadmin.senddiscountQuantity("1");
		retailadmin.senddiscountPrice("50");
		screenShot.captureScreenShot("sixtyone");
		retailadmin.clickAttributeTab();
		screenShot.captureScreenShot("sixtytwo");
		retailadmin.clickOptionTab();
		screenShot.captureScreenShot("sixtythree");
		retailadmin.clickRecurringTab();
		screenShot.captureScreenShot("sixtyfour");
		retailadmin.clickSpecialTab();
		screenShot.captureScreenShot("sixtyfive");
		retailadmin.clickImageTab();
		screenShot.captureScreenShot("sixtysix");
		retailadmin.clickRewardPointsTab();
		screenShot.captureScreenShot("sixtyseven");
		retailadmin.clickDesignTab();
		screenShot.captureScreenShot("sixtyeight");
		retailadmin.clickSaveBtn();
		screenShot.captureScreenShot("sixtynine");
		
		String Actual="Products";
		String Expected=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/h1")).getText();
		Assert.assertEquals(Actual, Expected);
		screenShot.captureScreenShot("seventy");
	}
}