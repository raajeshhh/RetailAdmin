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

import com.training.generics.ScreenShot;
import com.training.pom.RetailAdminCustomersPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC086_RetailAdmin {

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
	
	@Test
	public void loginDBTest() throws InterruptedException {
		retailadmin.sendUserName("admin");
		retailadmin.sendPassword("admin@123");
		retailadmin.clickLoginBtn();
		retailadmin.Menu();
		retailadmin.clickCustomers();
		screenShot.captureScreenShot("87");
		retailadmin.clickCustomerGroups();
		screenShot.captureScreenShot("88");
		retailadmin.clickaddnewIcon();
		screenShot.captureScreenShot("89");
		retailadmin.sendCustomerGroupName("privileged customer");
		retailadmin.sendCustomerGroupDescription("privileged customer");
		retailadmin.clickApproveNewCustomers();
		screenShot.captureScreenShot("90");
		retailadmin.clickSaveIcon();
		screenShot.captureScreenShot("91");
		retailadmin.clickSubCustomers();
		screenShot.captureScreenShot("92");
		retailadmin.clickaddnewIcon();
		screenShot.captureScreenShot("93");
		
		Select dropdown= new Select(driver.findElement(By.id("input-customer-group")));
		dropdown.selectByVisibleText("privileged customer");
		
		retailadmin.sendFirstName("manzoor");
		retailadmin.sendLastName("mehadi");
		retailadmin.sendeMail("manzoor@gmail.com");
		retailadmin.sendTelephone("9876543210");
		screenShot.captureScreenShot("94");
		retailadmin.sendPassword("manzoor1");
		retailadmin.sendConfirmCustomerPassword("manzoor1");
		screenShot.captureScreenShot("95");
		retailadmin.clickSaveIcon();
		
		String Actual="Customers";
		String Expected=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/h1")).getText();
		Assert.assertEquals(Actual, Expected);
		screenShot.captureScreenShot("96");
	}
}