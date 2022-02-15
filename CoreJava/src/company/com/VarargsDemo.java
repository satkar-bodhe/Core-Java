package company.com;

// Variable Length Arguments

class Calculator 
{
	
	public int add (int ... n)
	
	{
		int sum = 0;
		
		for (int i : n)
		{
			sum = sum + i;
		}
		
		return sum;	
	}
}



public class VarargsDemo {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		
		System.out.println(obj.add(5,6,5,7,8,9,6));
		
	}

}
