package Array_practise_Leetcode;

import org.junit.Test;

import com.graphbuilder.struc.Stack;

public class BaseballGame {

	
	/*
	 * 682. Baseball Game
	 * 
	 * Input1: ops = ["5","2","C","D","+"] Output: 30
	 * 
	 * Input2: ops = ["5","-2","4","C","D","9","+","+"] Output: 27
	 * 
	 * 
	 * Input3: ops = ["1","C"] Output: 0
	 * 
	 * Constraints: 1 <= operations.length <= 1000 operations[i] is "C", "D", "+",
	 * or a string representing an integer in the range [-3 * 104, 3 * 104]. For
	 * operation "+", there will always be at least two previous scores on the
	 * record
	 * 
	 * For operations "C" and "D", there will always be at least one previous score
	 * on the record.
	 * 
	 * 
	 * Pseudocode: 
	 * create a stack traverse through ops array push each ops[i] to stack
	 *  if ops=c pop from stack store in temp 
	 *  if ops= D pop element and peek top and double the value and push to stack 
	 * if ops=+ pop element store in temp and peek top of stack then push sum of peek and pop
	 *  finally pop stack till pop=null and add to sum
	 * 
	 * Time: O[N]
	 * Space: O[N]
	 */
	
	@Test
	public void test()
	{
		String[] operations= {"5","2","C","D","+"};
		baseBallScore(operations);
	}
	
	void baseBallScore(String [] operations)
	{
		Stack s=new Stack();
        int sum=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("C"))
            {
               s.pop();
            }
            
            if(operations[i].equals("D"))
            {
                int t1=s.peek();
                s.push(2*t1);
            }
            
            if(operations[i].equals("+"))
            {
              int temp=s.pop();
               int temp1= s.peek();
               int temp3=temp+temp1;
                s.push(temp);
                  s.push(temp3);
                
            }
              if(!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+"))
              {
                  s.push(Integer.parseInt(operations[i]));
              }
            }
            while(!s.isEmpty())
            {
                int temp=s.pop();
               sum =temp+sum;
            }

	System.out.println( sum);
	    }
	}
	
	
	

