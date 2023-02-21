package com.strings;

public class StringEx {
	
	public static void main(String[] args) {
		String str = "abc";
		String str2 = "abc";
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		if(str.equals(str2)) {
			System.out.println("Strings are equal ");
		}
		if(str==str2) {
			System.out.println("str==str2 are equal");
		}else {
			System.out.println("str==str are NOT equal");
		}
		
		if(str3.equals(str4)) {
			System.out.println("Strings(str3.equals(str4)) are equal ");
		}
		if(str3==str4) {
			System.out.println("str3==str4 are equal");
		}else {
			System.out.println("str3==str4 are NOT equal");
		}
		
	}

}
