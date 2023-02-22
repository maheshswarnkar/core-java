package com.ms.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ms.commons.CommonData;
import com.ms.commons.Employee;
import com.ms.commons.MSCommonUtils;

public class UseOfStreamApiInList extends MSCommonUtils {

	static List<Employee> employeesList = CommonData.getSmallDataSetEmployeesList();
	static List<List<Employee>> employeesListOfList = CommonData.getSmallDataSetListOfEmployeesList();

	private static long printWithStreamsOnly(List<Employee> employeesList) {
		long startTime = getCurrentTime();
		employeesList.stream().forEach(e -> System.out.println(e));
		return printTotalTime(startTime, getCurrentTime(), "printWithStreamsOnly");

	}

	private static long printWithParallelStreams(List<Employee> employeesList) {
		long startTime = getCurrentTime();
		employeesList.parallelStream().forEach(e -> System.out.println(e));
		return printTotalTime(startTime, getCurrentTime(), "printWithParallelStreams");

	}

	private static long printWithForLoop(List<Employee> employeesList) {
		long startTime = getCurrentTime();
		for (Employee employee : employeesList) {
			System.out.println(employee);
		}
		return printTotalTime(startTime, getCurrentTime(), "printWithForLoop");

	}

	private static void performanceTestingOfAPIs() {
		List<Employee> employeesList = CommonData.getLargeDataSetEmployees();

		long parallelStreamTime = 0, timeTakenByFor = 0, timeByStream = 0;

		parallelStreamTime = printWithParallelStreams(employeesList);
		timeTakenByFor = printWithForLoop(employeesList);
		timeByStream = printWithStreamsOnly(employeesList);

		System.out.println("Time taken by sequential stream " + timeByStream);
		System.out.println("Time taken by parallel stream " + parallelStreamTime);
		System.out.println("Time taken by for loop " + timeTakenByFor);
		System.out.println("At here performance depends upon which was called first");
	}

	public void filterExample() {
		// Creating a stream of strings
		Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

		// Getting a stream consisting of the
		// elements having UpperCase Character
		// at custom index say be it '1'
		// using Stream filter(Predicate predicate)
		stream.filter(str -> Character.isUpperCase(str.charAt(1))).forEach(System.out::println);
	}

	private static void increaseSalary() {
		List<Employee> employeesList = CommonData.getSmallDataSetEmployeesList();
		employeesList.stream().filter(emp -> ((emp.getAge() > 37))).map(emp -> {
			emp.setSalary(emp.getSalary() * 5);
			return emp;
		}).forEach(System.out::println);
	}

	private static void useOfPeekAndMap() {
		List<Employee> employeesList = CommonData.getSmallDataSetEmployeesList();
		employeesList.stream().filter(emp -> emp.getId() > 104).peek(emp -> {
			emp.setAge(emp.getAge() - 1);
		}).map(emp -> {
			emp.setSalary(emp.getSalary() * 2);
			return emp;
		}).peek(emp -> {
			emp.setAge(emp.getAge() * 3);
		}).filter(emp -> emp.getAge() > 120).forEach(System.out::println);

		employeesList.stream().map(emp -> {
			emp.setFirstName((emp.getFirstName() + " " + emp.getLastName()));
			return emp;
		}).forEach(System.out::println);
	}

	private static void sortingUseOfComparator() {
		List<Employee> employeesList = CommonData.getSmallDataSetEmployeesList();

		employeesList.sort((emp1, emp2) -> Integer.valueOf(emp1.getAge()).compareTo(Integer.valueOf(emp2.getAge())));

		Collections.sort(employeesList, Comparator.comparing(Employee::getSalary));
	}

	private static void useOfComparator() {
		List<Employee> employeesList = CommonData.getSmallDataSetEmployeesList();
		employeesList.sort(
				Comparator.comparing(Employee::getFirstName).thenComparing(Comparator.comparing(Employee::getAge)));

	}

	private static void sequentialStreamSorting() {
		List<Employee> employeesList = CommonData.getSmallDataSetEmployeesList();

		// sorting does not work correctly in case of parallelStream
		employeesList.stream().sorted(Comparator.comparing(Employee::getFirstName)).forEach(System.out::println);
	}

	private static void secondLowestSalaryEmployee() {
		List<Employee> employeesList = CommonData.getSmallDataSetEmployeesList();

		employeesList.stream().peek(System.out::println).sorted(Comparator.comparing(Employee::getSalary)).limit(2)
				.skip(1).collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void useOfFlatMap() {
		List<Employee> employeesList1 = CommonData.getSmallDataSetEmployeesList();
		List<Employee> employeesList2 = CommonData.getSmallDataSetEmployeesList();
		List<Employee> employeesList3 = CommonData.getSmallDataSetEmployeesList();

		List<List<Employee>> employeesList4 = Arrays.asList(employeesList1, employeesList2, employeesList3);
		employeesList4.stream().flatMap(List::stream).collect(Collectors.toList()).forEach(System.out::println);

		Stream<Employee> flatMap = employeesList4.stream().flatMap(List::stream);
		flatMap.collect(Collectors.toList()).forEach(System.out::println);

		Stream<Employee> flatMap2 = employeesListOfList.stream().flatMap(list -> list.stream());
	}

	public static void compareWhenInteger() {
		employeesList.stream().sorted((Employee o1, Employee o2) -> (o2.getAge() - o1.getAge())).limit(2).skip(1)
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	public static void compareWhenString() {
		employeesList.stream().sorted((Employee o1, Employee o2) -> (o2.getFirstName().compareTo(o1.getFirstName())))
				.forEach(System.out::println);
	}

	private static void useOfAverage() {
		OptionalDouble average = employeesList.stream().filter(emp -> emp.getDepartName().equals("IT"))
				.mapToDouble(Employee::getSalary).average();

		System.out.println(average);
	}

	private static void useOfReduce() {
		employeesList.stream().map(emp -> {
			emp.setFirstName((emp.getFirstName() + " " + emp.getLastName()));
			return emp;
		}).forEach(System.out::println);

	}

	private static void convertListToMap() {
		Map<Integer, Double> collect = employeesList.stream()
				.collect(Collectors.toMap(Employee::getId, Employee::getSalary));
		System.out.println(collect);

		Map<String, List<Employee>> collect2 = employeesList.stream()
				.collect(Collectors.groupingBy(Employee::getFirstName));
		System.out.println(collect2);
	}

	public static void main(String[] args) {
		Map<String, List<Employee>> collectListOfEmployees = employeesList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartName));

		OptionalDouble optionalDouble = employeesList.stream().filter(emp -> emp.getDepartName().equals("IT"))
				.mapToDouble(Employee::getSalary).average();

		double asDouble = optionalDouble.getAsDouble();
		System.out.println("Double value is " + asDouble);

//		for (Map.Entry<String, List<Employee>> mapEntry : collectListOfEmployees.entrySet()) {
//			System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
//		}

//		Map<String, Integer> sortedMap = employeesList.stream()
//				.sorted(Map.Entry.comparingByValue())
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
//						LinkedHashMap::new));

//		System.out.println("SortedMap " + sortedMap);

	}

}
