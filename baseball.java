class Solution {
    public int calPoints(String[] operations) {
        
        // Pseudocode:
        // create a stack
        //     traverse through ops array
        //     push each ops[i] to stack
        //     if ops=c pop from stack store in temp
        //         if ops= D pop element and peek top and double the value and push to stack
        //             if ops=+ pop element store in temp and peek top of stack then push sum of peek and pop
        // finally pop stack till pop=null and add to sum 
      
      //Time: O[N] Space: O[N]
        
        
        
        Stack<Integer> s=new Stack<>();
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
return sum;
    }
}
