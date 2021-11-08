package com.qa.qacommunity;

public class StringsDemo {

	
	public static void main(String[] args) {
		
//		String myStr = "I like strings";
//		
//		String myStr2 = new String("I like strings");
//		
//		String myStr3 = "I like strings";
//		
//		System.out.println(myStr==myStr2);
//		
//		int stringLength=myStr.length();
//		
//		System.out.println("String length is " + stringLength);
		
		
		String str1 = "ThISiSSOMEtEXT";
		String str2 = "thisissometext";
		
		System.out.println(str1.equalsIgnoreCase(str2));

		System.out.println(str1.replace("SOME", "SOMEREALLYFUN"));
		
		for (int i =0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		

	}
}
