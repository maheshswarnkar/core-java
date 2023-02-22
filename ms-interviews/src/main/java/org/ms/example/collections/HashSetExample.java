package org.ms.example.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Integer> hash = new HashSet();
		hash.add(1);
		hash.add(2);
		hash.add(3);
		hash.add(1);
		
		System.out.println(hash);

	}

}
