package parallelexe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class B {
	@Test
	public void TC2()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
	}

}
