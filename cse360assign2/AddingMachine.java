/**
* @author  Somesh Singh
* @classId 85141
* @Assignment No. 2
* 
* The AddingMachine.java file represents an adding machine  
* which  adds, subtracts and gets total of the operands.
* It also returns the history of the transactions(add, subtract) as applied 
* to the operands using the toString method
* 
*/

package cse360assign2;

public class AddingMachine {

	private int total;
	private String history = "0"; // to store the history of the operations
	
	/**
	 * This is a constructor of the AddingMachine.java class which 
	 * initializes the total to 0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This method returns the total
	 */
	public int getTotal () {
		return total; //returns the total
	}
	
	/**
	 * This method is responsible for the addition of the operands
	 */
	public void add (int value) {
		total = total + value; // adding value to the total
		history = history + " + " + value;
	}
	
	/**
	 * This method performs the subtraction 
	 */
	public void subtract (int value) {
		total = total - value; //subtracting value from the total
		history = history + " - " + value;
	}
	
	/**
	 * This method gives a history of the all the operands and operations 
	 * performed
	 */
	public String toString () {
		return history;
	}
    
	/**
	 * This method is used to reset total and history
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
	
}
