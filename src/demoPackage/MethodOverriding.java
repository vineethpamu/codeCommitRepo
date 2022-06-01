package demoPackage;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child myObj = new Child();
		myObj.display();
		
	}

}


class Parent{
	
	public void display() {
		System.out.println("This is a parent class display");
	}
}

class Child	extends Parent{
	public void display() {
		super.display();
		System.out.println("This is a child class display");
	}
}