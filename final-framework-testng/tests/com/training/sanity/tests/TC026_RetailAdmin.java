package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RetailAdminReportsPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC026_RetailAdmin {

	private WebDriver driver;
	private String baseUrl;
	private RetailAdminReportsPOM retailadmin;
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
		retailadmin = new RetailAdminReportsPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void purchasedProducts() throws InterruptedException {
		retailadmin.sendUserName("admin");
		retailadmin.sendPassword("admin@123");
		screenShot.captureScreenShot("one");
		retailadmin.clickLoginBtn();
		screenShot.captureScreenShot("two");
		retailadmin.Menu();
		screenShot.captureScreenShot("Three");
		retailadmin.clickReports();
		screenShot.captureScreenShot("four");
		retailadmin.clickProducts();
		screenShot.captureScreenShot("five");
		retailadmin.clickPurchased();
		screenShot.captureScreenShot("six");
		WebElement orderStatus = driver.findElement(By.id("input-status"));
		Select orderStatus_dd = new Select(orderStatus);
		orderStatus_dd.selectByIndex(0);
		screenShot.captureScreenShot("seven");
		retailadmin.clickFilterBtn();
		Thread.sleep(1000);
		
		String Actual="Showing 1 to 10 of 10 (1 Pages)";
		String Expected=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[3]/div[2]")).getText();
		Assert.assertEquals(Actual, Expected);
		screenShot.captureScreenShot("eight");
		}
}