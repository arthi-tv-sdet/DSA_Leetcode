/* 234. Palindrome Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        
        /* Pseudocode: Using Arraylist
         create two lists list 1 and list2
         traverse through the given linked list head
         add each temp val to list1
         reverse traverse list1 and add each element in list 2
         if list1 equals list 2 return true
         else return false
         
         Time: O[N*M] Space: O[N]
        */
        
        ListNode temp=head;
        
        ArrayList<Integer> list1=new ArrayList<>(); //O[N]
        ArrayList<Integer> list2=new ArrayList<>(); // O[N]
        
        while(temp!=null) //O[N]
        {
            list1.add(temp.val); //O[1]
            temp=temp.next;
        }
        
        for(int i=list1.size()-1;i>=0;i--) //O[N]
        {
            list2.add(list1.get(i)); //O[N]
        }
        
        return list1.equals(list2); //O[N]
        
        
        
        
    }
}

*/
