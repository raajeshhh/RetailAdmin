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

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.RetailAdminCatalogPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC090_RetailAdmin {

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
	
	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String productName,String metaTagTitle,String model,String price,String quantity,String categories,String discountQuantity,String discountPrice,String rewardPoints) throws InterruptedException {
		retailadmin.sendUserName("admin");
		retailadmin.sendPassword("admin@123");
		retailadmin.clickLoginBtn();
		retailadmin.Menu();
		retailadmin.Catalog();
		screenShot.captureScreenShot("119");
		retailadmin.clickProducts();
		screenShot.captureScreenShot("120");
		retailadmin.clickaddnewIcon();
		screenShot.captureScreenShot("121");
		retailadmin.sendProductName(productName);
		screenShot.captureScreenShot("122");
		retailadmin.sendmetaTagTitle(metaTagTitle);
		screenShot.captureScreenShot("123");
		retailadmin.clickDataTab();
		screenShot.captureScreenShot("124");
		retailadmin.sendModel(model);
		retailadmin.sendPrice(price);
		retailadmin.sendquantity(quantity);
		screenShot.captureScreenShot("125");
		retailadmin.clickLinksTab();
		screenShot.captureScreenShot("126");
		retailadmin.clickCategories();
		retailadmin.sendCategories(categories);
		screenShot.captureScreenShot("127");
		retailadmin.clickDiscountTab();
		screenShot.captureScreenShot("128");
		retailadmin.clickAddDiscount();
		screenShot.captureScreenShot("129");
		retailadmin.senddiscountQuantity(discountQuantity);
		retailadmin.senddiscountPrice(discountPrice);
		screenShot.captureScreenShot("130");
		retailadmin.clickRewardPointsTab();
		screenShot.captureScreenShot("131");
		retailadmin.sendRewardPoints(rewardPoints);
		screenShot.captureScreenShot("132");
		retailadmin.clickAttributeTab();
		screenShot.captureScreenShot("133");
		retailadmin.clickOptionTab();
		screenShot.captureScreenShot("134");
		retailadmin.clickRecurringTab();
		screenShot.captureScreenShot("135");
		retailadmin.clickSpecialTab();
		screenShot.captureScreenShot("136");
		retailadmin.clickImageTab();
		screenShot.captureScreenShot("137");
		retailadmin.clickDesignTab();
		screenShot.captureScreenShot("138");
		retailadmin.clickSaveBtn();
		
		String Actual="Products";
		String Expected=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/h1")).getText();
		Assert.assertEquals(Actual, Expected);
		screenShot.captureScreenShot("139");
	}
}