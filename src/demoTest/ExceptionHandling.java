package demoTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import	java.lang.Exception;

public class ExceptionHandling {
	

	  public static void main(String[] args) throws FileNotFoundException  {
		  FileReader fr = new FileReader("D:\\\\testout.txt");
//		  fr.close();
	  }
	}