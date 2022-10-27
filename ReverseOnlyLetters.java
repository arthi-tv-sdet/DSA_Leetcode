package DSA_String;

import java.util.Arrays;

import org.junit.Test;

public class ReverseOnlyLetters {

	/*917. Reverse Only Letters
	 * 
	 * Given a string s, reverse the string according to the following rules:

		All the characters that are not English letters remain in the same position.
		All the English letters (lowercase or uppercase) should be reversed.
		Return s after reversing it.
		Example 1:

			Input: s = "ab-cd" Output: "dc-ba"
	
		Example 2:
			
			Input: s = "a-bC-dEf-ghIj" Output: "j-Ih-gfE-dCba"

		Example 3:

			Input: s = "Test1ng-Leet=code-Q!" Output: "Qedo1ct-eeLg=ntse-T!"
			
		PSEUDOCODE: 2 pointer
		
		1. p1= index 0 of string p2=last index of string  and traverse through the given string using while loop
		2. while p1 less than p2
		3. if character at p1 and p2 are alphabetic then swap with temp
		 temp=p1, p1=p2, p2=temp
		4. else increment p1 and decrement p2
		 
	*/
	
	private void reverseOnlyLetters(String s) {
		
		//1. traverse through char array after converting the given string to array using for loop
		//2. p1= index 0 of string p2=last index of string
		char arr[]=s.toCharArray();
		int p1=0;
		int p2=arr.length-1;
	
			while(p1<p2) //while p1 less than p2
			{
			 if(Character.isAlphabetic(arr[p1]) && Character.isAlphabetic(arr[p2])) 
			{
				
						
			//if character at p1 and p2 are alphabetic then swap
			 
							char temp=arr[p1];
							arr[p1]=arr[p2];
							arr[p2]=temp;
							p1++;
							p2--;
			 			
			}
			 else if(!(Character.isAlphabetic(arr[p1]))) 	
				 
			 {
				 p1++;
			 }
			 else if(!(Character.isAlphabetic(arr[p2]))) 	
				 
			 {
				 p2--;
			 }
			 //if(p1=p2)
				 
				 }System.out.println(new String(arr));
		
	}
	
	@Test
	public void Test1()
	{
		String s="ab-cd";
		String s1="a-bC-dEf-ghIj";
		String s2="Test1ng-Leet=code-Q!";
		reverseOnlyLetters(s);
		reverseOnlyLetters(s1);
		reverseOnlyLetters(s2);
	}
}
