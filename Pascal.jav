//https://leetcode.com/problems/pascals-triangle-ii/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        /**
        Pseudocode:
        Create an arraylist
        iterate from 0 to row count
        use another for loop to add center values
        finally return list
        
        Time: O[N^2]
        Space: O[N]
         */

         ArrayList <Integer> list=new ArrayList<>();
         for(int i=0;i<=rowIndex;i++)
         {
             list.add(1);
             for(int j=i-1;j>0;j--)
             {
                list.set(j,list.get(j)+list.get(j-1));
             }

             
         }
return list;






    }
}
