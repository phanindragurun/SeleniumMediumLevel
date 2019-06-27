package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMNew {

	private WebDriver driver; 
	String expmsg= "An e-mail has been sent to remind you of your login and password";
	String expmsg1= "Hello Phani n and welcome,";
	
	public LoginPOMNew(WebDriver driver) {
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
	
	
	@FindBy(xpath="//a[contains(@href,'Password')]")
	private WebElement lostpwd;
	
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
	
	@FindBy(id="lost_password_user")
	private WebElement lostpassword;
	
	@FindBy(id="lost_password_submit")
	private WebElement lostpasswordsubmit;
	
	@FindBy(id="registration_phone")
	private WebElement phone; 
	/*
	@FindBy(id="registration_language")
			private WebElement lang; */
	
	
	
	@FindBy(xpath="//p[contains(text(),'Teach')]")
	private WebElement radio;
	
	
	
	
	@FindBy(xpath="//a[contains (text(),'SeleniumNew')]")
	private WebElement seleniumnew;
	
	@FindBy(xpath="//input[contains (@name,'group_0_name')]")
	private WebElement groupname;
	
	

	@FindBy(xpath="//img[contains (@alt,'Results and feedback')]")
	private WebElement results;
	
	
	@FindBy(xpath="//img[contains (@alt,'Grade activity')]")
	private WebElement grade;
	
	
	
	@FindBy(id="tooltip_19")
	private WebElement seleniumtestclick;
	
		
	
	@FindBy(id="form-email_submit")
	private WebElement emailsubmit;
	
	
	
	@FindBy(id="toolimage_2286")
	private WebElement testlink; 
	
	
	@FindBy(id="toolimage_2291")
	private WebElement grouplink; 
	
	
	
	@FindBy(id="registration_submit")
	private WebElement register;
	
	@FindBy(id="create_groups_submit")
	private WebElement creategroupsubmit;
	
	
	
	
	@FindBy(id="create_groups_step2_submit")
	private WebElement creategroupsubmitbutton;
	
	
	
	@FindBy(id="group_members_rightSelected")
	private WebElement rightSelected;
	
	
	
	
	

	@FindBy(id="group_edit_submit")
	private WebElement savesettings;
	
	
	
	@FindBy(xpath="//input[contains (@name,'send_notification')]")
	private WebElement sendemail;
	
	@FindBy(xpath="//img[contains (@title,'Create new group(s)')]")
	private WebElement creategroup;
	
	
	@FindBy(xpath="//p[contains(text(),'An e-mail has been sent to remind you of your login and password.')]")
	private WebElement actmsg;
	//String text=actmsg.getText();
	
	
	
	@FindBy(xpath="//strong[contains(text(),'Phani n')]")
	private WebElement actmsg1;
	
	
	
	@FindBy(xpath="//img[contains (@title,'Group members')]")
	private WebElement groupmembers;
	
	
	
	

	@FindBy(xpath="//option[contains (text(),'Phani n (phani) - PHANI')]")
	private WebElement selectgroupmembers;
	
	

	@FindBy(xpath="//img[contains(@title,'Edit this group')]")
	private WebElement editthisgroup;
	
	
	

	@FindBy(xpath="//label[contains(text(),' Learners are allowed to self-register in groups')]/input")
	private WebElement checkbox1;
	
	
	

	@FindBy(xpath="//label[contains(text(),' Learners are allowed to unregister themselves from groups')]/input")
	private WebElement checkbox2;
	
	
	
	
	public void seleniumnew() {
		this.seleniumnew.click(); 
	}	
	
	public void checkbox1() {
		this.checkbox1.click(); 
	}	
	
	public void checkbox2() {
		this.checkbox2.click(); 
	}	
	
	
	public void editthisgroup() {
		this.editthisgroup.click(); 
	}
	
	public void selectgroupmembers() {
		this.selectgroupmembers.click(); 
	}
	
	
	public void groupmembers() {
		this.groupmembers.click(); 
	}	
	
	
	
	
	public void creategroupsubmit() {
		this.creategroupsubmit.click(); 
	}	
	
	
	public void rightSelected() {
		this.rightSelected.click(); 
	}
	
	
	
	
	public void savesettings() {
		this.savesettings.click(); 
	}
	
	public void creategroupsubmitbutton() {
		this.creategroupsubmitbutton.click(); 
	}	
	
	
	
	
	
	public void creategroup() {
		this.creategroup.click(); 
	
	}
	public void emailsubmit() {
		this.emailsubmit.click(); 
	}	
	public void results() {
		this.results.click(); 
	}
	
	public void grade() {
		this.grade.click(); 
	}
	
	public void testlink() {
		//this.firstname.clear();
		this.testlink.click();
	}
	
	public void grouplink() {
		//this.firstname.clear();
		this.grouplink.click();
	}
	
	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	
	
	
	
	public void groupname(String groupname) {
		this.groupname.clear();
		this.groupname.sendKeys(groupname);
	}
	
	
	
	public void lostpassword(String lostpassword) {
		this.lostpassword.clear(); 
		this.lostpassword.sendKeys(lostpassword); 
	}
	
	public void seleniumtestclick() {
		
		this.seleniumtestclick.click(); 
	}
	
	public void lostpasswordsubmit() {
		this.lostpasswordsubmit.click(); 
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void lostpwd() {
		this.lostpwd.click(); 
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
							
							public void sendemail() {
								//this.firstname.clear();
								this.sendemail.click();
								
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

	
	
	

