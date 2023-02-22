package com.ms.streamapi;

import java.util.Map;

import com.ms.commons.CommonData;
import com.ms.commons.CustomMap;

public class HashMapEx {

	private static void sameHashCode() {
		CustomMap customMap = new CustomMap();
		customMap.put("First", "User-1");
		customMap.put("Second", "User-2");
		customMap.put("Third", "User-3");
		customMap.put("Four", "User-4");
		customMap.put("Five", "User-5");
		customMap.put("Six", "User-6");
		customMap.put("Seven", "User-7");

		customMap.forEach((k, v) -> System.out.println(k + " : " + v));
	}
	
	

	public static void main(String[] args) {
		Map<String, String> employeesMap = CommonData.getEmployeesMap();
//		employeesMap.forEach((k, v) -> System.out.println("key : " + k + " value: " + v));
		HashMapEx.sameHashCode();

	}

}
