class Solution {
    public int balancedStringSplit(String s) {
        
        
        //1221. Split a String in Balanced Strings

      /** Pseudocode:

      set r to count R , l to count L
      c to counter balanced occurence of R and L
      traverse through the string s
      increment r if charAt is R else increment l
      if both are equal increment c
      finally return c;

      Time: O[N]
      Space: O[1]
      */
      int r=0,l=0,c=0;
      for(int i=0;i<s.length();i++)
      {
          if(s.charAt(i)=='R')
          r++;
          else
          l++;
          if(r==l) c++;
      }
    return c;    
    }
}
