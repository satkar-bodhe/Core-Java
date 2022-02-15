package company.com;

import java.util.HashSet;

public class CollectionsHashSet {
	
	// When we want to store group of elements as a single entity where duplicates are not allowed and 
	// insertion order is not preserved then we will use set.
	
	// Do not store duplicate elements and do not preserve insertion order.
	

	public static void main(String[] args) {
		
		
		HashSet<String> obj = new HashSet<String>();
		obj.add("Satkar");
		obj.add("Pune");
		obj.add("QA");
		obj.add("Satkar");
		obj.add("Pune");
		System.out.println(obj);
		
	}

}
