//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        /**
        Pseudocode:
        split the given sentenec to string array
        using the starts with method check if the searchword is prefixof each word in string array
        finally return the i+1 value
        else return -1 
        
        Time: O[N2]
        Space: O[N]*/

        String[]arr=sentence.split(" ");
        int index=-1;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].startsWith(searchWord)) return i+1;
        }

return index;
    }
}
