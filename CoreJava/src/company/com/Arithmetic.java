package company.com;

// This is the master class for arithmetic operations. 

public class Arithmetic {

	public static void main(String[] args) {
		
	Addition addObj = new Addition(); 	//  Created object 
	addObj.addition(12, 30); 			// Provided parameters and call addition method.
	
	Subtraction subObj = new Subtraction(); //  Created object
	subObj.subtraction(45, 24); 			// Provided parameters and call subtraction method.
	
	Multiplication multiObj = new Multiplication(); //  Created object
	multiObj.multiplication(25, 25);				// Provided parameters and call multiplication method.
	
	Division divObj = new Division(); 	//  Created object
	divObj.division(625, 25);			// Provided parameters and call division method.
	
	Quotient quoObj = new Quotient(); 	//  Created object
	quoObj.quotient(21, 2); 			// Provided parameters and call quotient method.
    
	}

}
