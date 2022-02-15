package company.com;

public class SwappingNo {

	public static void main(String[] args) 
	{

	int a =10;
	int b =20;
	
	Swap(a,b);
		
		
	}
		
		public static void Swap(int num1, int num2) 
		{
			
			System.out.println("Values Before Swapping are a :"+num1+ " b:"+num2);
			int c = num1;
			num1 = num2;
			num2 = c;
			
			System.out.println("Values After Swapping are a :"+num1 +" b :"+num2 );
			
			
		}
		
	}

