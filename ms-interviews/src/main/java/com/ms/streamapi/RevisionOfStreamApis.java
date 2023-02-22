package com.ms.streamapi;

import java.util.HashSet;
import java.util.List;

import com.ms.commons.CommonData;
import com.ms.commons.Employee;

public class RevisionOfStreamApis {

	public static void main(String[] args) {
		List<Employee> employeesList = CommonData.getSmallDataSetEmployeesList();
		employeesList.stream().filter(emp -> (emp.getAge() > 35)).map(emp -> emp.getFirstName().toUpperCase())
				.forEach(System.out::println);
		
		
	}

}
