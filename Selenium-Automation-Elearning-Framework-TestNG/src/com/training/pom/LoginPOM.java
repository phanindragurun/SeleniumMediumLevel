package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPOM {
	private WebDriver driver; 
	String expmsg= "An e-mail has been sent to remind you of your login and password";
	String expmsg1= "Hello Phani n and welcome,";
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[contains(text(),'Sign')]")
	private WebElement signup;
	
	@FindBy(id="registration_firstname")
	private WebElement firstname; 
	
	@FindBy(id="registration_lastname")
	private WebElement lastname; 
	
	@FindBy(id="registration_email")
	private WebElement email; 
	
	@FindBy(id="username")
	private WebElement un; 
	
	@FindBy(id="pass1")
	private WebElement pass; 
	
	@FindBy(id="pass2")
	private WebElement confirmpass; 
	
	@FindBy(id="registration_phone")
	private WebElement phone; 
	/*
	@FindBy(id="registration_language")
			private WebElement lang; */
	
	
	
	@FindBy(xpath="//p[contains(text(),'Teach')]")
	private WebElement radio;
	
	
	
	@FindBy(id="registration_submit")
	private WebElement register;
	
	
	@FindBy(xpath="//p[contains(text(),'An e-mail has been sent to remind you of your login and password.')]")
	private WebElement actmsg;
	//String text=actmsg.getText();
	
	
	
	@FindBy(xpath="//strong[contains(text(),'Phani n')]")
	private WebElement actmsg1;
	
	
			
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void signup() {
		this.signup.click(); 
	}
	
	public void firstname(String firstname) {
		//this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}
		
		public void lastname(String lastname) {
			//this.firstname.clear();
			this.lastname.sendKeys(lastname);
		}
			
			public void email(String email) {
				//this.firstname.clear();
				this.email.sendKeys(email);
			}
				
				public void un(String un) {
					//this.firstname.clear();
					this.un.sendKeys(un);
				}
					
					public void pass(String pass) {
						//this.firstname.clear();
						this.pass.sendKeys(pass);
					}
					public void confirmpass(String confirmpass) {
						//this.firstname.clear();
						this.confirmpass.sendKeys(confirmpass);
						
					}
					
					public void phone(String phone) {
						//this.firstname.clear();
						this.phone.sendKeys(phone);
					}
						
						/*public void language() {
							//this.firstname.clear();
							//this.phone.sendKeys(phone);
							Select lang1=new Select(lang);
							lang1.selectByValue("English");
						}*/
						
						public void ratiobtn(boolean radio) {
							//this.firstname.clear();
							this.radio.click();
						}
							
							public void register() {
								//this.firstname.clear();
								this.register.click();
								
							}
							
							public void message1() {
								if (actmsg1.equals(expmsg1))
								{
								System.out.println("PASSED");	
								}
								else
								{
									System.out.println("FAILED");
								}
								}
							
							
							public void message() {
								if (actmsg.equals(expmsg))
								{
								System.out.println("PASSED");	
								}
								else
								{
									System.out.println("FAILED");
								}
								}
						
			
			
	
	
}
