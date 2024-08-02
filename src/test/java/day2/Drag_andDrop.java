package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_andDrop {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		Thread.sleep(5000);
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		Thread.sleep(5000);
		WebElement srcele = driver.findElement(By.xpath("//div[@id='div1']"));
		Thread.sleep(5000);
		WebElement desele = driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(srcele, desele).perform();
	}

}
