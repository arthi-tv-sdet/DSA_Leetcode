package DSA_Practise;

import java.util.HashSet;

import org.junit.Test;

public class NumberofEquivalentDominoPairs {

	/*
	 * 1128. Number of Equivalent Domino Pairs
	 * 
	 * Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] =
	 * [c, d] if and only if either (a == c and b == d), or (a == d and b == c) -
	 * that is, one domino can be rotated to be equal to another domino.
	 * 
	 * Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and
	 * dominoes[i] is equivalent to dominoes[j].
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: dominoes = [[1,2],[2,1],[3,4],[5,6]] Output: 1 
	 * 
	 * Example 2:
	 * 
	 * Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]] Output: 3
	 * 
	 * 
	 * 
	 * Pseudocode:
	 * create two sets, count=0,temparr1[],temparr2[]
	 * traverse through given array dominoes
	 * add dominoes[i] to temparr1[] then to set 1 and dominoes[i+1] to temparr2[] and to set 2
	 * compare set 1 and 2 and increment count if both has same values 
	 * clear both sets and continue with other index
	 * return count 
	 */

	@Test
	public void test()
	{
		int dominoes[][]= {{1,2},{2,1},{3,4},{5,6}};
		//int dominoes[][]= {{1,2},{1,2},{1,1},{1,2},{2,2}};
		dominoPairs(dominoes);
	}

	private void dominoPairs(int[][] dominoes) {

		int count=0;

		HashSet <Integer> hs1=new HashSet<>();

		HashSet <Integer> hs2=new HashSet<>();

		for(int i=0;i<dominoes.length;i++)
		{
			int temparr1[]=dominoes[i];

			for(int a=0;a<temparr1.length;a++)
			{
				hs1.add(temparr1[a]);
			}

			for(int j=i+1;j<dominoes.length;j++)
			{
				int temparr2[]=dominoes[j];

				for(int b=0;b<temparr2.length;b++)
				{
					hs2.add(temparr2[b]);
				}
				if(hs1.equals(hs2))
				{
					count++;
				}
				hs2.clear();
			}
			hs1.clear();
		}

		System.out.println(count);

	}




}
