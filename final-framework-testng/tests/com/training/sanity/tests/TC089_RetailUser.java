package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RetailUserDetailsPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC089_RetailUser {

	private WebDriver driver;
	private String baseUrl1;
	private RetailUserDetailsPOM retailuser;
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
		retailuser = new RetailUserDetailsPOM(driver); 
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
		//retailuser.Account();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"menu_all_categories_Menu_VIfWm2LT_Ytne9\"]/a/span"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		retailuser.clickEthnicLink();
		retailuser.clickIntegerVitaeIaculisMassa();
		retailuser.clickAddToCart();
		screenShot.captureScreenShot("118");
		Thread.sleep(3000);
		
		/*
		 * String URL = driver.getCurrentUrl(); Assert.assertEquals(URL,
		 * "http://retail.upskills.in/account/logout" );
		 * screenShot.captureScreenShot("thirtythree");
		 */
	}
}