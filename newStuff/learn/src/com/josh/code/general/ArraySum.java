package com.josh.code.general;

public class ArraySum {

	static int[][] arr = new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

	public static void main(String[] args) {

		int rowSum=0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(" " + arr[i][j]);
				rowSum = rowSum+arr[i][j];
			}
			System.out.println("    for row: "+i+"the rowsum is:"+rowSum);
			rowSum = 0;
		}

	}

}
