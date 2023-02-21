package ms.collections.ex;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, EmployeeHashMap> employeeMap = new HashMap<>();
		employeeMap.put("First", new EmployeeHashMap(101, "FirstEmployee"));
		employeeMap.put("Second", new EmployeeHashMap(102, "SecondEmployee"));
		employeeMap.put("Third", new EmployeeHashMap(101, "ThirdEmployee"));

//		employeeMap.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
		employeeMap.forEach((key, value) -> System.out.println("Key and Value " + key + " " + value));
	}

}

class EmployeeHashMap {

	private int empId;
	private String empName;
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeHashMap other = (EmployeeHashMap) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}

	public EmployeeHashMap(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "EmployeeHashMap [empId=" + empId + ", empName=" + empName + "]";
	}

}