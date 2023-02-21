package ms.collections.ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class CollectionsEx {
	
	public static void main(String[] args) {
		Collection<Integer> collectionOfInt = new ArrayList<>();
		collectionOfInt.toArray();
		
		
		Collection<String> collectionOfString = new ArrayList<>();
		String[] array = (String[])collectionOfString.toArray();
		
		var collectionOfMap = new HashMap<Integer, String>();
		collectionOfMap.put(1, "Mahesh");
		
		for(Map.Entry<Integer, String> map : collectionOfMap.entrySet()) {
			
		}
	}

}
