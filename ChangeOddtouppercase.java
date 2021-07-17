package week1.day2assignments;

public class ChangeOddtouppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		 
		 * String test1 = "changeme";
		  	
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		 String test1 = "pavithrajuno";
		 String []str2=test1.split("");
		 for(int i=0;i<str2.length-1;++i) {
			// System.out.println(str2[i]+ " ");
		 			 	 	 if(i%2==1) {
			 	 		 char[] temp = str2[i].toCharArray();
			                for (int j = temp.length-1; j >= 0; --j) {
			                   
			                	System.out.print(Character.toUpperCase(temp[j]));
			                }
			               System.out.print(" ");
			            } else {
			                System.out.print(str2[i] );
			            }
			        }
	}}