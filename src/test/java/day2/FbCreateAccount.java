package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbCreateAccount {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//click on create account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//first name
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("koteswararao");
		//last name
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("makk");
		//mobile number
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("9999999999");
		//new password
		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("koti1234ap");
		Thread.sleep(5000);
		//select drop down
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select birthday1=new Select(day);
		birthday1.selectByValue("9");
		//selecy by month
		Thread.sleep(5000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select mon=new Select(month);
		mon.selectByVisibleText("Aug");
		//selecy by Year
		Thread.sleep(5000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select year1=new Select(year);
		year1.selectByVisibleText("1988");
		//gender
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		//click on sign_up button
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
	}

}
