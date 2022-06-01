package demoPackage;

import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test (dependsOnMethods = { "OpenBrowser" })
  public void SignIn() {
	  System.out.println("This will execute second (SignIn)");
  }

  @Test (priority=1, groups = {"OpenBrowser"})
  public void OpenBrowser() {
	  System.out.println("This will execute first (Open Browser)");
  }
  
  @Test (priority=1, groups = {"OpenBrowser"})
  public void LogTest() {
	  System.out.println("This will Log a statement");
  }
}
