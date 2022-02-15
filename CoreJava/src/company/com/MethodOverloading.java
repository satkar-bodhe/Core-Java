package company.com;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int l =10;
		int w =20;
		float r=1.5f;
		
		int rectangle_area = area(l,w);
		float circle_area = area(r);
		
		System.out.println("Area of rectanlge is " +rectangle_area);
		System.out.println("Area of circle is " +circle_area);


	}

	public static int area (int n1, int n2) {
		
		int result = n1*n2;
		
		
		return result;
			
	}
	
	public static float area (float n) {
		
		float result = 3.14f*n*n;
		
		return result;
		
	}
	
}
