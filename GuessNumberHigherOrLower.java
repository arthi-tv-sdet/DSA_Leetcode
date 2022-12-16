/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

//Pseudocode:
/**Using binary serach approach
set pointers left=1,right=n
calculate mid value
if guess returns -1  set right=mid-1 
if guess returns 1 set left=mid+1
if guess returns 0 return mid value
else return left value
break the while loop when left is less than or equal to right

Time: O[Log N]
Space: O[1]*/

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
    int left=1,right=n;
    while(left<=right)
    {
        int mid=left+(right-left)/2;

        // 1 2 3 4 5 6 7 8 9 10

        if(guess(mid)==1)
        {
            left=mid+1;
        }
     else   if(guess(mid)==-1)
        {
            right=mid-1;
        }
       else if(guess(mid)==0)
       return mid;
       
    }
return left;
    }
}
