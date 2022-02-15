package company.com;

public class ArrayJagged {

	public static void main(String[] args) {
		
		// 1st writing way with normal for loop 
	int a[][] = {
					{1,2,3,4},
					{1,2,3},
					{3,4,5,6}
				};
			for (int i=0; i<a.length; i++)
			{
				for (int j=0; j<a[i].length; j++)
				{
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			// 2nd writing way with enhanced for loop
			
			for (int k[] : a )
			{
				for (int l : k)
				{
					System.out.print(l);
				}
				System.out.println();
			}
		
	}

}
