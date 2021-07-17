package week1.day2assignments;

import java.util.Arrays;
import java.util.Iterator;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1 = "stops";
		String text2 = "spots";
		int i,j;
		//String[] temp1=text1.split("");
		//String[] temp2=text2.split("");
		//for (int k = 0; k < temp1.length; k++) {
			char[] arr1 = text1.toCharArray();
			char[] arr2 = text2.toCharArray();
			if(arr1.length==arr2.length) {
				System.out.println("they are of samelength");
			}
				else {
					System.out.println("The given strings are not Anagram");
						}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(i=0;i<=arr1.length-1;i++) {
				for(j=0;j<=arr2.length-1;j++) {
			
		//boolean bb= arr1.equals(arr2);
		if(arr1[i]==arr2[j]) 
		{
	 	System.err.println("the given strings are Anagram");		
			
		//	else
		
		}break;
		
	}
			}
			}		
	
	
	}

