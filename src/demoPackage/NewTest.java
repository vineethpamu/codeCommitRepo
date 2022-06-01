package demoPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver ;
  @Test
  public void f() {
	  String baseUrl = "https://www.toolsqa.com/";
      
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
      
      System.out.println("Launching Google Chrome browser"); 
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String testTitle = "Tools QA";
      String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
      Set<String> s1 = driver.getWindowHandles();
      Iterator<String> i1 = s1.iterator();
      while(i1.hasNext()) {
    	  String childWindow = i1.next();
    	  driver.switchTo().window(childWindow);
      }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Starting Test On Chrome Browser");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
		System.out.println("Finished Test On Chrome Browser");
  }

}
