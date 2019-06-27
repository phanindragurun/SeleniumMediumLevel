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
import com.training.pom.LoginPOM;
import com.training.pom.LoginPOMNew;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LostPassword {
	
	
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
	public void validLoginTest() {
		LoginPOMNew.lostpwd();
		LoginPOMNew.lostpassword("phani.n1012@gmail.com");
		LoginPOMNew.lostpasswordsubmit();
		String expected="Your password has been emailed to you";
		
		WebElement actual=driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div[1]/div/div"));
		String act=actual.getText();
		System.out.println(act);
		/*
		Assert.assertEquals(act,expected);
		System.out.println("Not matching");
		*/
		Assert.assertTrue(isAT(expected,act));
		/*{
			
			if (act.equals(expected))
			{
				System.out.println("True");
		}
			else
			{
				System.out.println("Raise a defect");
			}
		}*/
	
		
		
	}

	private boolean isAT(String expected, String act) {
		// TODO Auto-generated method stub
		if(act.equals(expected))
		{
			return true;
		}
		else {
		return false;
	}

	

}
}