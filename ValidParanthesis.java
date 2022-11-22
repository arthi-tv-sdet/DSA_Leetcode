/*
20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Input:1 s = "()"
Output: true

Input 2: s = "()[]{}"
Output: true

Input 3: s = "(]"
Output: false

 // Pseudocode:
        // create a stack
        //   traverse through s
      // if charAt is open bracket and if close bracket type is already present pop if stack is not empty
        // else push charAt(i)
        //return if stack is empty or not
          
          Time: O[N] Space: O[N]
          
*/

 public boolean isValid(String s) {
    
         Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(!st.isEmpty() && ((s.charAt(i)=='}' && st.peek()=='{')
                                || (s.charAt(i)==']' && st.peek()=='[')
                                    || (s.charAt(i)==')' && st.peek()=='(' )))
                                   
                
              st.pop();
            
            else
                st.push(s.charAt(i));
            
        }
     return st.isEmpty();
    }
