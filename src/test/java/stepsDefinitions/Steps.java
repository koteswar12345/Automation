package stepsDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("the user is on the nopCommerce login page")
	public void the_user_is_on_the_nop_commerce_login_page() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	   
	}

	@When("the user enters valid credentials \\(username: {string}, password: {string})")
	public void the_user_enters_valid_credentials_username_password(String user, String pwd) {
		//xpath for user name
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("koteswar258@gmail.com");
		//x path for password
		driver.findElement(By.xpath("//input[contains(@name,'Password')]")).sendKeys("koti@1234");
	    
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
		//xpath for login button
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	    
	}

	@Then("the user should be redirected to the My Account page")
	public void the_user_should_be_redirected_to_the_my_account_page() {
		//xpath for my account
		boolean status = driver.findElement(By.xpath("//a[contains(text(),'My account')]")).isDisplayed();
		Assert.assertEquals(status, true);
	    
	}

	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
		boolean welcometxt = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
		Assert.assertEquals(welcometxt, true);
	    
	}




}
