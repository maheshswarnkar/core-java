package com.ms.streamapi;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.ms.commons.CommonData;

public class UseOfStreamApiInMap {

	private static Map<String, String> employeeMap = CommonData.getEmployeesMap();

	private static void sortMapOnBasedOfValues() {
		LinkedHashMap<String, String> collect = employeeMap.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		collect.forEach((key, value) -> System.out.println(key + " " + value));

	}

	public static void main(String[] args) {

	}

}
