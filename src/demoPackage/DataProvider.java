package demoPackage;

import org.testng.annotations.Test;

public class DataProvider {
	 @Test (dataProvider = "data-provider", dataProviderClass = DP.class)
	    public void myTest (String val) {
	        System.out.println("Passed Parameter Is : " + val);
	    }
}
