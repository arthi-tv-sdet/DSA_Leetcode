package DSA_Practise;

import java.util.HashMap;

import org.junit.Test;

public class FindTownJudge {

	
	/*
	 * 997. Find the Town Judge Input: n = 2, trust = [[1,2]] Output: 2
	 * 
	 * Input: 1 n = 3, trust = [[1,3],[2,3]] Output: 3
	 * 
	 * Input:2 n = 3, trust =[[1,3],[2,3],[3,1]] Output: -1
	 * 
	 * constraints: 
	 * 1 <= n <= 1000 
	 * 0 <= trust.length <= 104 
	 * trust[i].length == 2 
	 * All the pairs of trust are unique.
	 *  ai != bi 1 <= ai, bi <= n
	 *  
	 *  Pseudocode:
	 *  create a hashmap
	 *  traverse through trust array and add key[a] and value[b]
	 *  if already in map then increment for b and decrement for a
	 *  in another for loop traverse through map
	 *  if value is = n-1 
	 *  return the key
	 *  else return -1
	 *  
	 *  Time: O[N]
	 *  Space: O[N]
	 * 
	 */
	
	public int findJudge(int n, int[][] trust) {
        
	       
        HashMap <Integer,Integer> hmap=new HashMap<>();
          for(int i=0;i<trust.length;i++){  
        
              hmap.put(trust[i][0],hmap.getOrDefault(trust[i][0],0)-1);
               hmap.put(trust[i][1],hmap.getOrDefault(trust[i][1],0)+1);
             
          }
        for(int j=1;j<=n;j++)
        {
           if( hmap.getOrDefault(j,0)==n-1)
           {
               return j;
           }
        }
            
          return -1;  
    }
	
	@Test
	public void test()
	{
		int n = 3, trust [][]= {{1,3},{2,3}};
		findJudge(n,trust);
	}
}
