package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//launch url
		driver.get("https://demo.opencart.com/");
		//WebElement searchbox = driver.findElement(By.name("search"));
		//searchbox.sendKeys("MacBook");

	}

}
