package com.qa.qacommunity;

public class ArraysDemo1 {
	
	public static void main(String[] args) {
		
		
	// ARRAYS
		
		int[] ageArray = {18, 26, 20, 100, 12, 6, 15}; 
		long[] ageArray2 = new long[6];
		String[] nameArray = { "John", "Emma", "Alex", "Rachel"}; 
		
		ageArray[0]=16;
		ageArray[3]=5;
		ageArray[2]=1;
		ageArray2[5]=5;
		
//		nameArray[0]="Angelica"; 
		
		// FOR LOOP
		
//		for(int i = 0; i< ageArray2.length; i++) {
//			System.out.println(ageArray2[i]);
//		}
//		
		// FOR-EACH LOOP (enhanced for loop)
		
//		for (String name : nameArray) {
//			System.out.println(name);
//		}
		
		for (int age : ageArray) {
			System.out.println(age);
		}
 	}

}
