package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//constructor
	//locators
	//Action methods
	WebDriver driver;
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	By  txt_username_loc=By.xpath("//input[@id='user-name']");
	By  txt_password_loc=By.xpath("//input[@id='password']");
	By  btn_login_loc=By.xpath("//input[@id='login-button']");
	 
	 //Actions method
	 public void setUserName(String user)
	 {
		 driver.findElement(txt_username_loc).sendKeys(user);
	 }
	 
	 public void setPassword(String pwd)
	 {
		 driver.findElement(txt_password_loc).sendKeys(pwd);
	 }
	 
	 public void clickLogin()
	 {
		 driver.findElement(btn_login_loc).click();
	 }

}
