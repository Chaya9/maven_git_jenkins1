package mypackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo456 {
	ExtentReports e = new ExtentReports("./ExtentReport/ExtentReport.html");
	@Test
	public void testA(){	
		ExtentTest v = e.startTest("hi");
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Reporter.log("test123", true);
		Reporter.log("testing", true);
		driver.close();
		v.log(LogStatus.PASS, "hi");
		e.endTest(v);
		e.flush();

		
	}
	
	
	@Test
	public void testB(){	

		ExtentTest v = e.startTest("hi");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Reporter.log("test123", true);
		Reporter.log("testing", true);
		driver.close();
		v.log(LogStatus.FAIL, "hi");
		e.endTest(v);
		e.flush();
		
		
	}
}
