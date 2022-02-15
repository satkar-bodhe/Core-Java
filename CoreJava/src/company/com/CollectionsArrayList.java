package company.com;

import java.util.ArrayList;

public class CollectionsArrayList {
	
	
	// List : When we want to store group of elements as a single entity where duplicates are allowed and insertion order is preserved then we will use list.
	
	// List : store duplicate elements and insertion order should be preserved.
	
	// Array List implements random access interface

	// Array list can access any element at any index with same speed.

	// When your frequent operation is retrieval then we will use array-list

	// When frequent operation is updation and deletion then array list is not preferred.
	
	// ArrayList and Linked List are identical. 

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Pune");
		obj.add("Pranav");
		obj.add("FIS");
		obj.add("Pune");

		System.out.println(obj);
		
		ArrayList<String> obj1 = new ArrayList<String>();
		obj1.add("Senior Tester");
		obj1.add("Satkar");
		obj1.add("Bodhe");
		obj1.add("Michelin");
		obj1.add("Pune");
		System.out.println(obj1);
		
		
	}

}
