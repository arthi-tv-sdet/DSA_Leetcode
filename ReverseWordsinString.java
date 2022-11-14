  package DSA_String;

import java.util.Iterator;

import org.junit.Test;

public class ReverseWordsinString {

	/*557. Reverse Words in a String III
	 * Given a string s, reverse the order of characters in each word within a 
	 * sentence while still preserving whitespace and initial word order.
	 * 
	 * Example 1:

		Input: s = "Let's take LeetCode contest"
		Output: "s'teL ekat edoCteeL tsetnoc"	
	 * 
	 * Pseudocode- Using String buffer
	 * convert string to stringbuffer and reverse
	 * store the reversed stringbuffer value in a string
	 * split the string into array of strings using ""
	 * traverse through the array of strings 
	 * print each string from array in reverse 
	 * 	
	 * 
	 * Pseudocode- Using 2 Pointer (Optimised)
	 * split the sentence to string array
	 * traverse through each word of array
	 *in a separate method reverse the charaters of each word using 2 pointers left and right , temp to swap
	 *increment left, decrement right after each swap
	 *reversed string is appended to temp string
	 *finally trim temp and return
	*/
	
	private String reverseWords(String in)
	{
		
		StringBuffer res=new StringBuffer(in);
		StringBuffer rev=res.reverse();
		String str=rev.toString();
		String[] output=str.split("\\s");
		String finalResult="";
	for(int i =output.length-1;i>=0;i--)
	{
		finalResult=finalResult+" "+output[i];
	}
	System.out.print(finalResult);
	return finalResult.trim();
}
	  public String reverseWords_2P(String s) {
        
        String arr[]=s.split(" ");
        String temp="";
       
        for(int i=0;i<arr.length;i++)
        {
          int len=arr[i].length()-1;  
            temp=temp+reverse(arr[i],0,len)+" ";
        }
        
        return temp.trim();
    }
    
    public String reverse(String temp, int left,int right)
    {
        char arr[]=temp.toCharArray();
        
        while(left<right)
        {
            char t=arr[left];
            arr[left++]=arr[right];
            arr[right--]=t;
          //  right--;
          //  left++;
        }
        return String.valueOf(arr);
    }
	@Test
	public void reverseWordsInput1()
	{
		String in="Let's take LeetCode contest";
		reverseWords(in);
		reverseWords_2P(in);
	}
	@Test
	public void reverseWordsInput2()
	{
		String in="God Ding";
		reverseWords(in);
		reverseWords_2P(in);
	}
}
