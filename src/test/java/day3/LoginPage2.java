package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	//constructor
	//locators
	//Action methods
	WebDriver driver;
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators
	//By  txt_username_loc=By.xpath("//input[@id='user-name']");
	//By  txt_password_loc=By.xpath("//input[@id='password']");
	//By  btn_login_loc=By.xpath("//input[@id='login-button']");
	
	@FindBy(xpath="//input[@id='user-name']") WebElement txt_username;
	@FindBy(xpath="//input[@id='password']") WebElement txt_password;
	@FindBy(xpath="//input[@id='login-button']") WebElement btn_login;
	 
	 //Actions method
	 public void setUserName(String user)
	 {
		 txt_username.sendKeys(user);
	 }
	 
	 public void setPassword(String pwd)
	 {
		 txt_password.sendKeys(pwd);
	 }
	 
	 public void clickLogin()
	 {
		 btn_login.click();
	 }

}
