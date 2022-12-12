package HR;

public class staircase {

	
	/*
	 * Staircase of size n=4
	 * 
	 *    #
	 *   ##
	 *  ###
	 * ####      
	 * 
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		int n=10;
		
		for(int num=1;num<=n;num++)
		{
			int space=n-num;
			for(int i=0;i<space;i++)
			{
				System.out.print(' ');
			}
			
			for(int i=0;i<num;i++)
			{
				System.out.print('#');
			}
			System.out.println();
		}
			
		}
		    

	}

