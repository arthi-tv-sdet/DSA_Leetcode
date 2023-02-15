package Mng_Session;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class IntegertoRom {

	
	/**
	 * https://leetcode.com/problems/integer-to-roman/
	 * 
	 * 
	 * Test data:
	 * num=300 output=CCC
	 * num=2 output=II
	 * num=55 output=LV
	 * 
	 * 
	 * Pseudocode:
	 * create arrays with integer values and corresponding roman digits as separate arrays
	 * traverse through the given integer array
	 * if num is greater than or equal to the value array value
	 * create a stringbuilder and add to it
	 * reduce the value of array from num value
	 * return the string value of stringbuilder formed
	 * 
	 * 
	 * Time: O[N]
	 * space:O[N]
	 */
	
	
	@Test
	public void test()
	{
		int num1=300;
		int num2=2;
		int num3=55;
		System.out.println(convertRom(num1));
		System.out.println(convertRom(num2));
		System.out.println(convertRom(num3));
	}
	
	
	public String convertRom(int num)
	
	 {
		int[] value = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    String[] roman = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    StringBuilder sb = new StringBuilder();
	    
        for(int i = 0; i < value.length; i++){
            while(num >= value[i]) {
                sb.append(roman[i]);
                num -= value[i];
            }
        }   
        return String.valueOf(sb);
		    }
		

	}
