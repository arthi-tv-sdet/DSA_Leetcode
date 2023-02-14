package Mng_Session;

import java.util.Arrays;

import org.junit.Test;

public class meeting {

	/*Given an array of meeting time intervals consisting of start and end times [s1, e1], [s2, e2], ... , determine if a person could attend all meetings.

	For example,
	Given [ [0, 30], [5, 10], [15, 20] ],
	return false.




	test data:

	[[0,10],[15,20],[25,35]] true

	[[0,25],[20,30]] false

	[[0,30]] true
		
	[[10,25],[5,10]] true




	start[]=[0,15,25] end[]=[10,20,35]

	start[]=[0,20] end[]=[25,30]

	start[]=[0] end=[30]

	start[]=[10,5] end=[25,10]  after sorting start [5,10] end[10,25] 

	Pseudocode:
	sort the given array - with start time  and end time in two different arrays
	traverse through start array and compare each end array element
	if the start value greater than the end interval of previous meeting for all values- return true
	if start of following meeting is less than end of previous meeting - return false

	Time: O[N^2]
	SPace: O[N]

*/
	@Test
	public void test()
	{
		int meet[][]= {{0,10},{15,20},{25,35}};
		int meet1[][]= {{0,25},{20,30},{25,35}};
		System.out.println(joinMeet(meet));
		System.out.println(joinMeet(meet1));
	}

	public boolean joinMeet(int meet[][])
	{
	int[] starts = new int[meet.length];
	 int[] ends = new int[meet.length];
	 int count = 0;
     for(int[] m: meet){
         starts[count] = m[0];
         ends[count++] = m[1];
     }
     Arrays.sort(starts);
     Arrays.sort(ends);
     for(int i = 1; i < meet.length; i++){
         if(starts[i] < ends[i - 1]) return false;
     }
     return true;

	}
		
}
