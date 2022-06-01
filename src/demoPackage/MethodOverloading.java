package demoPackage;

public class MethodOverloading {

	static int AddNumbers(int x, int y)
	{
		int result = x + y;
		return result;
	}
	
	static float AddNumbers(float x, float y)
	{
		float result = x + y;
		return result;
	}
	
	static double AddNumbers(double x, double y)
	{
		double result = x + y;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(AddNumbers(5, 5));
		System.out.println(AddNumbers(5.5, 5.5));
		
	}

}
