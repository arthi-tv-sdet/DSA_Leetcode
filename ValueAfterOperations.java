package Array_practise_Leetcode;

import org.junit.Test;

public class ValueAfterOperations {

	
	/*
	 * 2011. Final Value of Variable After Performing Operations
	 * 
	 * There is a programming language with only four operations and one variable X:
	 * 
	 * ++X and X++ increments the value of the variable X by 1. --X and X--
	 * decrements the value of the variable X by 1. Initially, the value of X is 0.
	 * 
	 * Given an array of strings operations containing a list of operations, return
	 * the final value of X after performing all the operations. 
	 * 
	 * Input: operations = ["--X","X++","X++"] Output: 1
	 * 
	 * Input: operations = ["++X","++X","X++"] Output: 3
	 * 
	 * Input: operations = ["X++","++X","--X","X--"] Output: 0
	 * 
	 * Constraints:
	 * 
	 * 1 <= operations.length <= 100 
	 * operations[i] will be either "++X", "X++", "--X", or "X--".
	 * 
	 * 
	 * 
	 * 
	 * Pseudocode:
	 * initialize a string t, output=0
	 * traverse through the array
	 * for each iteration assign nums[i] to t
	 * use two if conditions one for positive and another for negative
	 * increment for positive and decrement for negative
	 * finally return the output
	 */
	
	@Test
	public void test()
	{
		//String operations[]= {"++X","++X","X++"};
		//String operations[]= {"X++","++X","--X","X--"};
		String operations[]= {"--X","X++","X++"};
		valueAfterOps(operations);
	}
	
	

	private void valueAfterOps(String[] operations) {
		
int output=0; String t="";
        
        for(int i=0;i<operations.length;i++)
        {
           t=operations[i];
        
         if(t.contains("++X")||t.contains("X++"))
            {
                output=output+1;
             
            }
        
         if(t.contains("--X")||t.contains("X--"))
            {
                output=output-1;
            }
        }
        System.out.println(output);
		
	}
}
