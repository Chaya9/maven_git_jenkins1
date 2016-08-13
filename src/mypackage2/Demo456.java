package mypackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo456 {
	@Test
	public void testA(){
		ExtentReports e = new ExtentReports("./ExtentReport.html");
		ExtentTest v = e.startTest("hi");
		v.log(LogStatus.PASS, "hi");
		e.endTest(v);
		e.flush();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Reporter.log("test123", true);
		Reporter.log("testing", true);
		driver.close();
		
	}

}
