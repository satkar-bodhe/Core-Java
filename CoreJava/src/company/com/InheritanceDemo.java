package company.com;


// Example of Multi level Inheritance 

class Calculator1  // Super Class, Grand father

{

public int Add(int a, int b)

{
	return a+b;
	
}

}

class AdvCalc extends Calculator1  // Sub Class, Father
{
	public int Sub(int c, int d)
	{
		return c-d;
	}
}

class VeryAdvCalc extends AdvCalc  // Sub class of sub class, Child
{
	public int Multi(int e, int f)
	{
		return e*f;
	}
}



public class InheritanceDemo {

	public static void main(String[] args) 
	{
		VeryAdvCalc C1 = new VeryAdvCalc();
		int result1 = C1.Add (4,5);
		int result2 = C1.Sub (8,4);
		int result3 = C1.Multi (4,5);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}

}
