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
import com.training.pom.TC030_RetailUserLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC030_RetailUserLogin {

	private WebDriver driver;
	private String baseUrl1;
	private TC030_RetailUserLoginPOM retailuser;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others2.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		retailuser = new TC030_RetailUserLoginPOM(driver); 
		baseUrl1 = properties.getProperty("baseURL1");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl1);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		//Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validRetailUserLogin() throws InterruptedException {
		retailuser.Account();
		retailuser.email("purposework23@gmail.com");
		retailuser.password("Google@123");
		retailuser.clickLoginBtn();
		screenShot.captureScreenShot("Twentyseven");
		retailuser.clickUserIcon();
		//Thread.sleep(3000);
		retailuser.clickLogoutBtn();
		screenShot.captureScreenShot("Twentyeight");
	}
}