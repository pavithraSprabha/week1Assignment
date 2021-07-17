package week1.day2assignments;
import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	// Here is the input
		// Sort the array	
				//int l=(arr.length)-1;
		int arr[] = {1,2,3,4,7,6,8,5,10};
 Arrays.sort(arr);
		
		int i,l=0;

		// loop through the array (start i from arr[0] till the length of the array)
for(i=0;i<=(arr.length)-1;i++) {
	l++;
	if(l!=arr[i]) {
	//continue;
	
	
	// check if the iterator variable is not equal to the array values respectively
System.out.println(+l+ "is the missed number in array");

break;		
	}				// print the number
				
				// once printed break the iteration
					
				
}
}

	}

