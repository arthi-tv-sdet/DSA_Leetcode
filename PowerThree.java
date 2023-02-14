    public boolean isPowerOfThree(int n) {
        
        /**test dat1: 9- true
        test data2: 81- true
        test data3: 0- false
        test data4: -10 - false
        
        Pseudocode:
        if given n is 0 return false
        multiply 3 till it is equal to n 
        if equal to n return true
        if the value is greater than or less than n return false

        Time: O[n]
        space: O[1]
        
         */

         if(n==0) return false;
//    int x=1;
//    for(int i=1;i<n;i++)
//    {
     
//      if(x<n) x=x*3;
     
//      if(x==n) return true;
//    }
// return false;

while(n>1) {
			if(n%3 == 0) {
				n = n/3;
			}
			else {
				return false;
			}
		}	
		if(n==1) {
			return true;
		}else 
		{ return false;}


    }
}
