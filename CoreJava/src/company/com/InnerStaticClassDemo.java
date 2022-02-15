package company.com;

class Outer1
{
	static int a;
	
	public static void show()
	{
		System.out.println("Outer Class Show method");
		
	}
	
	static class Inner 
	{
	
		static int b;
		
	public static void display() 
	{
	
	System.out.println("Inner Class Display method");
	
	}
	
	}
	
	
}



public class InnerStaticClassDemo {

	public static void main(String[] args) {
	
	// Outer.show();
		
	Outer1 obj = new Outer1();
		
		obj.show();
		
	Outer1.Inner obj1 = new Outer1.Inner();
		
		obj1.display();
		
		
	
	}

}
