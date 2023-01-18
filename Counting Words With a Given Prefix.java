//2185. Counting Words With a Given Prefix


class Solution {
    public int prefixCount(String[] words, String pref) {
        /**
        Pseudocode:
        declare a count  variable
         using startswith method
         check if each word in the given words array matches with pref
         if true increment 
         finally return the count 

         Time: O[N] Space: O[1]*/

         int count=0;
         for(String s: words)
         {
             if(s.startsWith(pref)) count++;
         }
         return count;
    }
}
