package com.strings;

public class TryAndCatchEx {

	public static int test() {
		int i = 2, j = 0, k = 0;
		try {
			k = i / 2;
			return 1;
		} catch (Exception e) {
			System.out.println("Catch is called");
			return 2;
		} finally {
			System.out.println("Finally is called");
			return 3;
		}
	}

	public static void main(String[] args) {
		int result = test();
		System.out.println("return is " + result);
	}

}
