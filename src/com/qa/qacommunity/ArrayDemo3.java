package com.qa.qacommunity;

public class ArrayDemo3 {

	
	public static void main(String[] args) {
		
		long[] ageArray = {2, 25, 6, 7, 2};
		int[] numArray = new int[6];
		
		
		
		
		// FOR EACH LOOP FOR ageArray
		
//		for (long age : ageArray) {
//			System.out.println(age);
//		}
		
		for (long age : ageArray) {
			if (age==2) {
				System.out.println(age);
			} else {
				System.out.println("Hello");
			}
		}
		
		// FOR LOOP FOR ageArray
		
//		for (int i =0; i<ageArray.length; i++) {
//			System.out.println(ageArray[i]);
//		}
//		
	
		
	}
}
