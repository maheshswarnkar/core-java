package com.ms.streamapi;

import java.util.Map;
import java.util.Set;

import com.ms.commons.CommonData;
import com.ms.commons.CustomHashSet;

public class HashSetEx {

	private static void sameHashCode() {
		Set<String> set = new CustomHashSet();
		set.add("Mahesh");
		set.add("Test2");
		set.add("Test3");

		System.out.println(set);

	}

	public static void main(String[] args) {
		Map<String, String> employeesMap = CommonData.getEmployeesMap();
//		employeesMap.forEach((k, v) -> System.out.println("key : " + k + " value: " + v));
		HashSetEx.sameHashCode();
	}
}
