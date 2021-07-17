package week1.day1assignments;

public class Factorial 
{
	
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)i implemented the concept with increment and decrement concept and different input values
	 * 2)use of for loop 
	 * 3) keyboard shortcuts ,factorial concept
	 * 
	 */	
	
	public static void main(String[] args) {

		// Declare your input as 5
		int input=5,fact=1;
				
		// Declare an integer variable fact as 1
		for(int i=1;i<=input;i++) {

		// Iterate from 1 to your input (tip: using loop concept)
		
fact=fact*(i);
			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
			

		//End of loop
		

		// Print factorial (fact)
	
	}
System.out.println("the factorial of given number is"  +fact);
}}

