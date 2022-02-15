package company.com;

public class ArrayChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Writing ways of array 1st way.
		
		char a []  = new char [8];
		
		 a [0] = 'V';
		 a [1] = 'I';
		 a [2] = 'S';
		 a [3] = 'H';
		 a [4] = 'A';
		 a [5] = 'K';
		 a [6] = 'H';
		 a [7] = 'A';
		 
		 for (int i=0; i<8; i++) 
		 {
			 System.out.print(a[i]);
			 
		 }
		System.out.println();
		 
		// Writing ways of array 2nd way. 
		 
		char b[] = {'S','A','T','K','A','R'};
		
		for (int j=0; j<6; j++)
		{
			System.out.print(b[j]);
		}
		System.out.println();
		
		// Writing ways of array 3rd way with enhanced for loop.
		
		char c[] = {'B','O','D','H','E'};
		
		for (char k : c) 
		{
			System.out.print(k);
			
		}
	}
}
