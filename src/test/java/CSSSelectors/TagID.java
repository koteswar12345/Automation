package CSSSelectors;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TagID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//tag&attribute
		//WebElement search_ele = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder=\\'Search store\\']")));
		driver.findElement(By.cssSelector("input[placeholder=\'Search store\']")).sendKeys("T-shirts");
		//search_ele.sendKeys("T-shirts");

	}

}
