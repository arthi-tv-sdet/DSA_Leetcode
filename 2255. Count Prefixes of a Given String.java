//https://leetcode.com/problems/count-prefixes-of-a-given-string/description/

class Solution {
    public int countPrefixes(String[] words, String s) {
        

        /**Pseudocode:
        use startsWith method and check  if each words[i] is prefix of s
        if true increment count 
        finally return count

        Time: O[N]
        Space: O[1]
         */

         int count=0;
         for(int i=0;i<words.length;i++)
         {
             if(s.startsWith(words[i])) count++;
         }
         return count;
    }
}
