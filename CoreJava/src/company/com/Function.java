package company.com;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//called non parameterized function
		
		nonparameterized();
		
		//called parameterised function
		
		parameterized(5,6);
		
		
	}
		public static void nonparameterized () {
			
			System.out.println("This is Non Parameterized Function");
			
		}

		public static void parameterized (int a, int b) {
			
			System.out.println(a+b);
			
		}
	}


