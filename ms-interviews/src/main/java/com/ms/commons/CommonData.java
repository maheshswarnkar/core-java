package com.ms.commons;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonData {

	public static List<Employee> getSmallDataSetEmployeesList() {

		Employee employee1 = new Employee(101, "Mahesh", "Swarnkar", "IT", 100101, 39);
		Employee employee2 = new Employee(102, "Sriram", "GopalKrishnan", "IT", 100102, 40);
		Employee employee3 = new Employee(103, "Gaurav", "Mahajan", "HR", 100103, 37);
		Employee employee4 = new Employee(104, "Pankaj", "Badhani", "HR", 100104, 42);
		Employee employee5 = new Employee(105, "Virendra", "Royal", "Admin", 100105, 41);
		Employee employee6 = new Employee(106, "Deepak", "Kannade", "Admin", 100106, 41);
		Employee employee7 = new Employee(107, "Mohinder", "Verma", "IT", 100107, 48);
		Employee employee8 = new Employee(108, "Mahesh", "Chandra", "IT", 100108, 45);
		Employee employee9 = new Employee(109, "FirstName-User-109", "LastName-109", "IT", 100109, 32);
		Employee employee10 = new Employee(110, "FirstName-User-110", "LastName-110", "IT", 100110, 30);

		List<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(employee1);
		listOfEmployees.add(employee2);
		listOfEmployees.add(employee3);
		listOfEmployees.add(employee4);
		listOfEmployees.add(employee5);
		listOfEmployees.add(employee6);
		listOfEmployees.add(employee7);
		listOfEmployees.add(employee8);
		listOfEmployees.add(employee9);
		listOfEmployees.add(employee10);

		return listOfEmployees;

	}

	public static List<List<Employee>> getSmallDataSetListOfEmployeesList() {

		Employee employee1 = new Employee(101, "Mahesh", "Swarnkar", "IT", 100101, 39);
		Employee employee2 = new Employee(102, "Sriram", "GopalKrishnan", "IT", 100102, 40);
		Employee employee3 = new Employee(103, "Gaurav", "Mahajan", "HR", 100103, 37);
		Employee employee4 = new Employee(104, "Pankaj", "Badhani", "HR", 100104, 42);
		Employee employee5 = new Employee(105, "Virendra", "Royal", "Admin", 100105, 41);
		Employee employee6 = new Employee(106, "Deepak", "Kannade", "Admin", 100106, 41);
		Employee employee7 = new Employee(107, "Mohinder", "Verma", "IT", 100107, 48);
		Employee employee8 = new Employee(108, "Mahesh", "Chandra", "IT", 100108, 45);
		Employee employee9 = new Employee(109, "FirstName-User-109", "LastName-109", "IT", 100109, 32);
		Employee employee10 = new Employee(110, "FirstName-User-110", "LastName-110", "IT", 100110, 30);

		List<Employee> listOfEmployees1 = new ArrayList<>();
		List<Employee> listOfEmployees2 = new ArrayList<>();
		List<Employee> listOfEmployees3 = new ArrayList<>();
		listOfEmployees1.add(employee1);
		listOfEmployees1.add(employee2);
		listOfEmployees1.add(employee3);
		listOfEmployees2.add(employee4);
		listOfEmployees2.add(employee5);
		listOfEmployees2.add(employee6);
		listOfEmployees3.add(employee7);
		listOfEmployees3.add(employee8);
		listOfEmployees3.add(employee9);
		listOfEmployees3.add(employee10);

		List<List<Employee>> listOfListOfEmployees = new ArrayList<>();
		listOfListOfEmployees.add(listOfEmployees1);
		listOfListOfEmployees.add(listOfEmployees2);
		listOfListOfEmployees.add(listOfEmployees3);

		return listOfListOfEmployees;

	}

	public static List<Employee> getLargeDataSetEmployees() {

		List<Employee> listOfEmployees = new ArrayList<>();
		Employee employee = null;

		SecureRandom random = new SecureRandom();
		int randomNumber = random.nextInt(900) + 100;

		for (int i = 0; i < 100000; i++) {
			employee = new Employee(i, new StringBuilder("FirstName-").append(i).toString(),
					new StringBuilder("SecondName-").append(i).toString(),
					new StringBuilder("DeptName-").append(randomNumber).toString(), (1000 + i), (i));
			listOfEmployees.add(employee);
		}

		return listOfEmployees;

	}

	public static Map<String, String> getEmployeesMap() {

		Map<String, String> mapOfEmployees = new HashMap<>();
		Employee emp = new Employee();

		for (int i = 0; i < 10; i++) {
			emp = new Employee();
			emp.setFirstName("User-" + i);
			if (i % 2 == 0) {
				emp.setDepartName("IT");
			} else if (i % 3 == 0) {
				emp.setDepartName("HR");
			} else if (i % 5 == 0) {
				emp.setDepartName("Finance");
			} else {
				emp.setDepartName("Admin");
			}
			mapOfEmployees.put(emp.getFirstName(), emp.getDepartName());
		}

		return mapOfEmployees;

	}

	public static void main(String[] args) {
//		getLargeDataSetEmployees().forEach(System.out::println);
//		getSmallDataSetEmployeesList().forEach(System.out::println);
		getEmployeesMap().forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
	}
}
