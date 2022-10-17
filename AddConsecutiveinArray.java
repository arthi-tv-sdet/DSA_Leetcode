package DSA;

import java.util.Arrays;

public class AddConsecutiveinArray {

	
	public static void main(String[] args) {
		/*
		 * int[] = {1,2,3,4,5}
				op - {3,5,7,9}*
		 * 
		 * 
		*/
		
		int arr[]={1,2,3,4,5};
		int[] output = new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++)
		{
				arr[i]=arr[i]+arr[i+1];
				output[i]=arr[i];
				
			
		}
		System.out.println(Arrays.toString(output));
	}
	
}
