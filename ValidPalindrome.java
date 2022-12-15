package DSA_Practise;

import org.junit.Test;

public class ValidPalindrome {


	//125. Valid Palindrome

	/*Pseudocode

    loop through the string s
    convert the upper case to lower case in s
    loop through lowercase string and add only alphanumeric characters to onlyAN 
    reverse onlyAN and compare with onlyAN string
    if both are equal return true else return false
	 */
	@Test
	public void test1()
	{
		String s="A man, a plan, a canal: Panama";
		System.out.println(validPalindrome_2(s));
	}
	
	private boolean validPalindrome_2(String s) {
		 String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
	        String rev = new StringBuffer(actual).reverse().toString();
	        return actual.equals(rev);
		
	}

	@Test
	public void test2()
	{
		String s="race a car";
		System.out.println(validPalindrome(s));
	}
	private boolean validPalindrome(String s) {
		
		String lower=s.toLowerCase(); 
		String onlyAN="";
	
		for(int i=0;i<lower.length();i++)
		{
			if(Character.isDigit(lower.charAt(i)) || Character.isAlphabetic(lower.charAt(i)))
				onlyAN=onlyAN+lower.charAt(i);
		}
		
		
		String rev="";
		StringBuilder sb=new StringBuilder(onlyAN);
         rev=new String(sb.reverse());
		return false;
	}

	@Test
	public void test3()
	{
		String s=" ";
		System.out.println(validPalindrome_1(s));
	}
	private boolean validPalindrome_1(String s) {
		
		
		String lower=s.toLowerCase(); 
		String onlyAN="";
	
		for(int i=0;i<lower.length();i++)
		{
			if(Character.isDigit(lower.charAt(i)) || Character.isAlphabetic(lower.charAt(i)))
				onlyAN=onlyAN+lower.charAt(i);
		}
		
		
		String rev="";
		
		for(int i=onlyAN.length()-1;i>=0;i--)
			rev=rev+onlyAN.charAt(i);
	
		if(rev.equals(onlyAN))
			return true;
		
			return false;

			
			
	}



}
