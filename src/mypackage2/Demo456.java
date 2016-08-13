package mypackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo456 {
	@Test
	public void testA(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Reporter.log("test123", true);
		Reporter.log("testing", true);
		driver.close();
	}

}
