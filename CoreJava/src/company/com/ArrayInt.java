package company.com;

public class ArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Writing ways of array 1st way.
		
		int a [] = new int[10];
	
		for (int i=0; i<10; i++) 
		{
		
			a [i]=i;
	
			System.out.print(a[i]);
	
		}System.out.println();

		// Writing ways of array 2nd way.
		
		int b[] = {4,5,6,7,8,9};
		
		for (int i=0; i<6; i++) 
		{
			
			System.out.print(b[i]);
		}
		System.out.println();
		
		
		// Writing ways of array 3rd way with enhanced loop.
		
		int c[] = {12,34,45,56,67,21};
		
		for (int k : c)
		{
			System.out.print(k);
			System.out.print("\t");
		}
		
	}

}
