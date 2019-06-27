package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOMNew;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class GroupElearing {
	
	
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
		LoginPOMNew.grouplink();
		LoginPOMNew.creategroup();
		LoginPOMNew.creategroupsubmit();
		LoginPOMNew.groupname("rockersphani");
		LoginPOMNew.creategroupsubmitbutton();
		LoginPOMNew.groupmembers();
		LoginPOMNew.selectgroupmembers();
		LoginPOMNew.rightSelected();
		LoginPOMNew.savesettings();
		LoginPOMNew.editthisgroup();
		LoginPOMNew.checkbox1();
		LoginPOMNew.checkbox2();
		LoginPOMNew.savesettings();
		
		
		
		String expected ="Group settings modified";
		WebElement actual=driver.findElement(By.xpath("//div[contains (text(),'Group settings modified')]"));
		String act=actual.getText();
		System.out.println(act);

if (actual.isDisplayed() && act.contains("Group settings modified"))
{
System.out.println("Success");	
}
else
{
System.out.println("Failure");	
}

}

}

