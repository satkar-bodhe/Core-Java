package company.com;

// Master class for Iteration statements 

public class MasterIteration {

	public static void main(String[] args) {
		
		ForLoop obj = new ForLoop(); 		// Created object of the For Loop class 
		obj.forLoop (9);					// Called for loop method by providing parameters
		
		WhileLoop obj1 = new WhileLoop(); 	// Created object of While loop class
		obj1.whileLoop (8);					// Called while loop method by providing parameters. 
		
		DoWhileLoop obj2 = new DoWhileLoop();	// Created object of Do while loop.
		obj2.doWhileLoop (7);					// Called do while loop by providing parameters. 
	}

}
