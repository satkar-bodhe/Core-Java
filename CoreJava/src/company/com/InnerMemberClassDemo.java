package company.com;

class Outer
{
 
	int a;
	
	public void show ()
	{
	
		System.out.println("Outer Class");
	 	
	}
	
	class Inner 
	{
		int b;
		
		public void display ()
		{
			
			System.out.println("Inner Class");
		}
		
	}
	
}




public class InnerMemberClassDemo {

	public static void main(String[] args) {

		
		Outer obj = new Outer();
		
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner();
		
		obj1.display();
		
		
	}

}
