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
import com.training.pom.RetailAdminReportsPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC029_RetailAdmin {

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
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void validAdminLogin() throws InterruptedException {
		retailadmin.sendUserName("admin");
		retailadmin.sendPassword("admin@123");
		retailadmin.clickLoginBtn(); 
		Thread.sleep(3000);
		screenShot.captureScreenShot("twentyeight");
		retailadmin.clickLogoutBtn();
		
		String Actual="Please enter your login details.";
		String Expected=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/h1")).getText();
		Assert.assertEquals(Actual, Expected);
		screenShot.captureScreenShot("twentynine");
	}
}