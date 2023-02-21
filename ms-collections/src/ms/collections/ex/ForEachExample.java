package ms.collections.ex;


import java.util.*;

public class ForEachExample {
	
	public static void test(List<Integer> list, int count) {
		list.add(2);
		count = count+1;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		int count = 1;
		list.add(3);
		list.forEach(i -> System.out.println(i));
		
		test(list,count);
		
	}

}
