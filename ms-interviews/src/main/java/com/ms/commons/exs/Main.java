package com.ms.commons.exs;

import java.util.ArrayList;
import java.util.List;

import com.ms.commons.Employee;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Mahesh", "Swarnkar-101", "IT", 1000, 102);
		Employee e2 = new Employee(1, "User-1", "LastName-101", "HR", 100, 102);
		Employee e3 = new Employee(1, "Mahesh", "LastName-101", "IT", 100, 102);

		List<Employee> employeesList = new ArrayList<>();

		int value = (e1.getFirstName().equalsIgnoreCase(e2.getFirstName())) ? 1 : 0;
		int value2 = (e1.getFirstName().equalsIgnoreCase(e3.getFirstName())) ? 1 : 0;

		System.out.println(value);
		System.out.println(value2);
	}

}
