package week1.day1assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


/*
 * Goal: To find whether a number is a Prime number or not
 * 
 * input: 13
 * output: 13 is a Prime Number
 * 
 * Shortcuts:
 * 1) Print : type: syso, followed by: ctrl + space + enter
 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
 *   
 * What are my learnings from this code?
 * 1)for loop and misplaced braces{} in for loop may affect the result
 * 2)shotrcuts and concept of prime number,breaking the loop with break keyword.
 * 3) booelen values cannot be assigned as 0,1 and if condition checked simply boolean value (if(flag)
 * 
 */
		// Declare an int Input and assign a value 13

	int prime=13;
	
		// Declare a boolean variable flag as false

		boolean flag=false;

		// Iterate from 2 to half of the input

		for(int i=2;i<=prime/2;i++) {
			
		

			// Divide the input with each for loop variable and check the remainder

			

			// Set the flag as true when there is no remainder
if(prime%i==0) {
	flag=true;

				
			// break the iterator
			}
break;
		}
			if(flag) {
			System.out.println("the given  is not a prime");

}

		// Check the flag (Provide a condition)
	
else	{		// Print 'Not a Prime' when the condition doesn't match 
					System.out.println("the given number is  prime");
   }


		}
		}
