package com.qa.qacommunity;

public class ArraysDemo2 {

	public static void main(String[] args) {

		int[][] ageArray = { { 25, 30, 31 }, { 56, 67, 39 }, { 8, 1, 2 } }; // new[3][3]
		String[][] nameArray = new String[3][2]; 
		ageArray[0][0]=1;
		nameArray[1][1]="John";
		nameArray[0][0]="Jordan"; 
		
		int[][][] ageArray3 = new int[1][5][27];
		
		
		// FOR-EACH LOOP
//		
//		for (int[] array : ageArray) {
//			for (int value : array) {
//				System.out.println(value);
//			}
//		}

		// FOR LOOP
		
		for (int i =0; i<ageArray.length; i++) {
			for (int j = 0; j < ageArray[i].length; j++) {
				System.out.println(ageArray[i][j]);
			}
		}
	}
}
