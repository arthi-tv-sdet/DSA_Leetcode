package Mng_Session;

import java.util.Arrays;

import org.junit.Test;

public class RotateImage {

	//48. Rotate Image



	/**
	 * 
	 * 
	 * Test data:
	 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Input: matrix = [[1,3],[6,6]]
Output: [[6,1],[6,3]]
   
   
   Pseudocode:

    traverse through given array
    in for loop 1 change the rows value to column 
    in another for loop reverse the order of numbers in each row

    Time: O[N^2]
    Space: O[1]

	 */
@Test
public void test1()
{
	
	int matrix[][]= {{1,2,3},{5,6,6},{7,8,9}};
	rotate(matrix);
}
@Test
public void test2()
{
	
	int matrix[][]= {{1,3},{6,6}};
	rotate(matrix);
}
	public void rotate(int[][] matrix) {

		int len=matrix.length;

		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}


		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][len - 1 - j];
				matrix[i][len - 1 - j] = temp;
			}
		}
		
		System.out.println(Arrays.deepToString(matrix));
	}
	
	
	
}
