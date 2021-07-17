package week1.day2assignments;

public class CharacterOccur {

	public static void main(String[] args) {
		    // Check number of occurrences of a char (eg 'e') in a String
			// declare and initialize a variable count to store the number of occurrences
			// convert the string into char array
			//get the length of the array
			// traverse from 0 till the array length 
			// Check the char array has the particular char in it 
			// if is has increment the count
			// print the count out of the loop
					String str = "welcome to chennai";
					int count=0,i,j;
					char find='o';
					
					char ch[]=str.toCharArray();
					//ch[i]=str.charAt(i);
				
					
					for(i=0;i<=str.length()-1;i++) {
						if(ch[i]=='o')
						//boolean b=ch.contains(find);
						{
							count++;
						}
							
						}
					System.out.println(+count+ "time occured");	
							
					
}}

		
	


