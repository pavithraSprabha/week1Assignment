package week1.day1assignments;

public class Armstrong {
	
		/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)shortcuts for syso for loop,and if
	 * 2)concept of if
	p * 3) about armstrong number
	 * 
	 */

	public static void main(String[] args) {

		

		// Declare your input
int	original,calculated=0,remainder,quotient;	
// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
	original=370;
	// Assign input into variable original
	// Use loop to calculate: use while loop to set condition until the number greater than 0

		while(calculated!=0) {
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)

			remainder=original%10;
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)

			quotient=original/10;	
			// Within loop: Add calculated with the cube of remainder & assign it to calculated

			calculated=calculated+remainder*remainder*remainder;
			
		}// Check whether calculated and original are same
			if(calculated==original)
			{
				System.out.println("the given no is armstrong number");
				}
				
			}
		}

			
			

			
			

		
			
