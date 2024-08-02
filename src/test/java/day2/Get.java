package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.support.ui.WebDriverWait;

public class Get {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		//Get Url
		//Thread.sleep(5000);
		driver.get("https://www.google.com");
		
		//driver.close();
		
		
	}

}
