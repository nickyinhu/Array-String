package arraystring;

import java.util.Arrays;
/** 
 * Find element with value of 0, and set all elements in the same column and row of this element to 0 
 * @author Hu
 *
 */

public class MatrixSetToZero {
	public int[][] findZero (int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j] == 0){
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(row[i] || column[j]){
					matrix[i][j]=0;
				}
			}
		}
		return matrix;
	}
	
	public static void main (String[] args){
		int[][] matrix = {{1,2,0},{2,3,4},{0,2,5}};
		matrix = new MatrixSetToZero().findZero(matrix);
		for(int[] e : matrix){
			System.out.println(Arrays.toString(e));
		}
	}
}
