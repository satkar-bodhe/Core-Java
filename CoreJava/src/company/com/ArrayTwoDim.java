package company.com;

public class ArrayTwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1st writing way of 2 dimensional array 
		
		int num =0;
		
		int a[][] = new int [2][5];
		
		for (int i=0; i<2; i++) {
			
			for (int j=0; j<5; j++) {
				a [i][j]=num;
				num++;
				System.out.print(a[i][j]);
			}
	
		System.out.println();
		}
		
		// 2nd writing way of 2 dimensional array.
		
//		int b[] = {1,2,3,4};
//		int c[] = {3,4,5,6};
//		int d[] = {6,7,8,9};
//		
//		Above arrays we can define like below also
	
		int e[][] = {
						{1,2,3,4},
						{3,4,5,6},
						{6,7,8,9}
				
					};
		System.out.println(e[0][3]); // Only specific number print from array.
		
		
		for (int k=0; k<3; k++)
		{
			for (int l=0; l<4; l++)
			{
				System.out.print(e[k][l]);
			}
				System.out.println();
			
		}
		
		// 3rd writing way of 2 dimensional array enahcned for loop.
		
		for (int m[] : e)
		{
			for (int n: m)
			{
				System.out.print(n);
			}
			System.out.println();
		}
		
		
	}
	
	
	
}
