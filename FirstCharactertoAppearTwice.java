//2351. First Letter to Appear Twice

class Solution {
    public char repeatedCharacter(String s) {
        
    /**Pseudocode:
        create a  Hashset of characters add from s
    if set.add returns false for charAt(i) return that character

Time: O[N]
Space: O[N]
     */

     HashSet<Character> set=new HashSet<>();
     for(int i=0;i<s.length();i++)
     {
         if(set.add(s.charAt(i))==false) return s.charAt(i);
     }

     return ' ';
    }
}
