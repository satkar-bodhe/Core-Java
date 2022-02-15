package company.com;


class Add {
	
	int num1;
	int num2;
	int result;  //instance variable
	
	public Add() 
	{
		
		num1 = 5;
		num2 = 6;
		System.out.println("In constructor");
		
	}
	
	public Add(int i) 
	{
		
		num1 = 5;
		num2 = 6;
		System.out.println("In Parameterised constructor");
		
	}
	
	
}

public class ConstructorDemo {
	
	
	public static void main(String[] args) {
		
		Add obj = new Add(); // Default Constructor or object
		
		
		Add obj1 = new Add(6); // Parameterised constructor
		
	}

}
