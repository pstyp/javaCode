package com.qa.qacommunity;

public class ConditionalDemo {

	public static void main(String[] args) {

		System.out.println(!!!!!!!true);
		
	}

	public static void numberIsGreaterThan(int num, String name) {

		if (num > 5 && name.equals("Dan")) {
			System.out.println("HELLO");

		} else if (num > 7) {
			System.out.println("FRIENDS");
		} else {
			System.out.println("bye");
		}

	}
}
