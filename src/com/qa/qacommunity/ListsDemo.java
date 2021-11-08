package com.qa.qacommunity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<>();
		
//		ArrayList<String> names2 = new ArrayList<>();
		
		
		names.add("Zayn");
		names.add("James");
		names.add("Jordan");
		names.add("Angelica");
		names.add("Pete");
		
		System.out.println(names);
		
//		System.out.println(names.get(4));
		
		names.set(1, "Aswene");
		
		System.out.println(names);
		
//		names.remove(4); 
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		names.add("Anna");
		System.out.println(names.size());
		
		
		// FOR EACH LOOP (enhanced for loop)
		
//		for (String name : names) {
//			System.out.println(name);
//		}
//		
//		// REGULAR FOR LOOP
//		
//		for (int i=0; i<names.size(); i++) {
//			System.out.println(names.get(i));
//		}
//		
		
		Collections.swap(names, 0, 5);
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		
		List<String> pets = new ArrayList<>(List.of("cat", "dog", "cow"));
		
		System.out.println(pets);
		pets.set(0, "bird");
		

	}

}
