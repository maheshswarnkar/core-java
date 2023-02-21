package ms.passbyValue;

import java.util.ArrayList;
import java.util.List;

public class PassByValueOrReference {
	
	
	public static void  test1(List<Integer> testList, int count)  {
		testList.add(2);
		count = count +2;
		testList = null;
		System.out.println("testList value "+testList);
	}
	
	public static void main(String[] args) {
		int count = 10;
		List<Integer> list = new ArrayList<>();
		list.add(3);
		
		test1(list, count);
		System.out.println("TestList "+list);
		System.out.println("count "+count);
		
	}

}
