package day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenShot1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		TakesScreenshot ts=(TakesScreenshot) driver;
		/*File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\kotes\\OneDrive\\Desktop\\Screenshots\\gg.png");
		Files.copy(src, des);*/
		WebElement ele = driver.findElement(By.xpath("//div[@class='_8ice']"));
		//File src = ts.getScreenshotAs(OutputType.FILE);
		File src = ele.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\kotes\\OneDrive\\Desktop\\Screenshots\\ele.png");
		Files.copy(src, des);
	}

}
