package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNG {
	WebDriver driver;
	
	@Test (priority = 0)
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test (priority = -1)
	public void OpenBrowser() {
		Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/v4/");
	        
	        Reporter.log("The website used was DemoQA for this test", true);
	        String expectedTitle = "Guru99 Bank Home Page";
	        SoftAssert	softAssert = new SoftAssert();
	        String originalTitle = driver.getTitle();
	        softAssert.assertEquals("test", originalTitle);
	        Assert.assertEquals(originalTitle, expectedTitle);
	        softAssert.assertAll();
  }
	
	@Test (priority = -1)
	public void TestElements() {
		Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
	        
	        Reporter.log("The website used was DemoQA for this test", true);
	       
	        boolean value = driver.findElement(By.xpath("//label[contains(text(),'Text Input')]/following-sibling::div/input")).isEnabled();
	        Reporter.log("Value: "+value, true);
  }
}