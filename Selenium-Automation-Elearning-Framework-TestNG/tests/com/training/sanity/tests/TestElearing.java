package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOMNew;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestElearing {
	
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOMNew LoginPOMNew;
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
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		LoginPOMNew = new LoginPOMNew(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		LoginPOMNew.sendUserName("phanguru");
		LoginPOMNew.sendPassword("phanguru@123");
		LoginPOMNew.clickLoginBtn();
		LoginPOMNew.seleniumnew();
		LoginPOMNew.testlink();
		//LoginPOMNew.seleniumtestclick();
		LoginPOMNew.results();
		Thread.sleep(5000);
		LoginPOMNew.grade();
		LoginPOMNew.sendemail();
		LoginPOMNew.emailsubmit();
		
		String expected ="Validated";
		WebElement actual=driver.findElement(By.xpath("//span[contains (text(),'Validated')]"));
		String act=actual.getText();
		System.out.println(act);

if (actual.isDisplayed() && act.contains("Validated"))
{
System.out.println("Success");	
}
else
{
System.out.println("Failure");	
}

}
}