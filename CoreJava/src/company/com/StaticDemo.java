package company.com;


class Emp{
	
	int eid;
	int salary;
	static String CEO;
	


public void Show() {
	
	System.out.println(eid+" : " +salary+ " : " +CEO );
}

}


public class StaticDemo {	
	
	public static void main(String[] args) { // We dont need to create object to call static main method
		
		Emp Satkar = new Emp();
		Satkar.eid = 4 ;
		Satkar.salary = 5000;
		Emp.CEO = "Franck";
		
		Emp Sushant = new Emp();
		Sushant.eid = 3;
		Sushant.salary = 6000;
		Emp.CEO = "Franck"; // We dont need to create object to call static variable 

		Satkar.Show();
		Sushant.Show();
		
		
	}

}
