package demoPackage;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		int[]	a;
		a = new int[] {1,2,3,4,5};
		for (int i =0; i<a.length; i++) {
			System.out.println("array: "+a[i]);
		}
		
		// TODO Auto-generated method stub
		System.out.println("This is a test");
		
		//This is test program for scanner class
		Scanner myObj = new	Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String name = myObj.nextLine();
		System.out.println("Entered name is "+name);
		myObj.close();
	}

}
