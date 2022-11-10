class Solution {
    public int findJudge(int n, int[][] trust) {
        
       
        HashMap <Integer,Integer> hmap=new HashMap<>();
          for(int i=0;i<trust.length;i++){  
         //int temp[][]
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
}
