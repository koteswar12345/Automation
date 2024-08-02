package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Id {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com");
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(5000);
		String exp_Title="Swag Labs";
	    String act_Title = driver.getTitle();
	    if(exp_Title.equals(act_Title))
	    {
	    	System.out.println("Test case is passed");
	    }
	    else
	    {
	    	System.out.println("Test case is failed");
	    }
		driver.close();
	}

}
