package Maven.Selenium.WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HellowWorldTest {
	
	@Test
	public void Hello(){
		System.out.println("Hellow World");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.com");	
	}
}
