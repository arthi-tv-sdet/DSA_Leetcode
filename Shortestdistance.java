package DSA_Array;

import java.util.Arrays;

import org.junit.Test;

public class ShortestdisChar {

	//821. Shortest Distance to a Character
	

				@Test
				public void test()
				{	String s="loveleetcode"; char c='e';
					
					System.out.println(shortestdisEFC(s,c));
				}
//[7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4]

				private String shortestdisEFC(String s, char c) {
					
					  int output[]=new int [s.length()];

				      int len=s.length();

				      int left=0,right=0;
					
					for(int i=0;i<len;i++)
					{  
						left=i-1;
						right=i+1;
						while(left>=0 || right< len)
						{
							if(s.charAt(i)==c)
							{
								output[i]=0;
								break;
								
							}
							if(left>=0)
							{
								if(s.charAt(left)==c)
								{
									output[i]=Math.abs(i-left);
									break;
								}
								else left--;
							}
							
							if(right<len)
							{
								if(s.charAt(right)==c)
								{
									output[i]=Math.abs(right-i);
									break;
								}
								else right++;
							}
						}
					}
					return Arrays.toString(output);
}
}
