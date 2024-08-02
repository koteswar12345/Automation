package day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildBrowser {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String mainwindow_Tit = driver.getTitle();
		System.out.println(mainwindow_Tit);
		driver.findElement(By.xpath("//div[text()='Motorola g64 5G (Pearl Blue, 128 GB)']")).click();
	    Set<String> allwin = driver.getWindowHandles();
	    for(String win1:allwin)
	    {
	    	driver.switchTo().window(win1);
	    }
	    String childwin = driver.getTitle();
	    System.out.println(childwin);
	}

}
