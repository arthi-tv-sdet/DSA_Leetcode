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
	 * 
	 * convert string to stringbuffer and reverse
	 * store the reversed stringbuffer value in a string
	 * split the string into array of strings using ""
	 * traverse through the array of strings 
	 * print each string from array in reverse 
	 * 	
	 * 
	 * 
	 * 
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
	
	@Test
	public void reverseWordsInput1()
	{
		String in="Let's take LeetCode contest";
		reverseWords(in);
	}
	@Test
	public void reverseWordsInput2()
	{
		String in="God Ding";
		reverseWords(in);
	}
}
