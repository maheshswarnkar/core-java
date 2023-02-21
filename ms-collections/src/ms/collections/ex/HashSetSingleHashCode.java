package ms.collections.ex;

import java.util.HashSet;
import java.util.Set;

public class HashSetSingleHashCode {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("a");
		hashSet.add("a");

		System.out.println(hashSet);

		EmployeeHashSet employeeHashSet1 = new EmployeeHashSet(101, "Mahesh");
		EmployeeHashSet employeeHashSet2 = new EmployeeHashSet(102, "Naresh");
		EmployeeHashSet employeeHashSet3 = new EmployeeHashSet(103, "Rajesh");
		EmployeeHashSet employeeHashSet4 = new EmployeeHashSet(101, "Test");

		Set<EmployeeHashSet> employeeSet = new HashSet<>();
		employeeSet.add(employeeHashSet1);
		employeeSet.add(employeeHashSet2);
		employeeSet.add(employeeHashSet3);
		employeeSet.add(employeeHashSet4);

		System.out.println("Employee HashSet and it did not insert duplicate "
				+ " \n\t (Even hashcode is same.. but"
				+ " equals method implementation is proper)..\n" + employeeSet);

		Set<String> testString = new HashSet<>();
		testString.add(null);
		testString.add("a");
		testString.add("b");
		System.out.println(testString);

	}

}

class EmployeeHashSet {

	private int empId;
	private String empName;

	public EmployeeHashSet(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}



	@Override
	public String toString() {
		return "EmployeeHashSet [empId=" + empId + ", empName=" + empName + "]";
	}

}
