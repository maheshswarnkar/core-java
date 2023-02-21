package org.ms.dateandtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DateComparison {

	public static void main(String[] args) {
		ArrayList<String> datestring=new ArrayList<String>();
		datestring.add("01/21/2013 @03:13 PM");
		datestring.add("01/21/2013 @04:37 PM");
		datestring.add("01/21/2016 @10:41 AM");
		datestring.add("01/21/2013 @10:48 AM");
		datestring.add("01/22/2013 @06:16 AM");
		datestring.add("01/22/2013 @06:19 AM");
		datestring.add("01/21/2015 @05:19 PM");
		datestring.add("01/21/2013 @05:19 PM");

		Collections.sort(datestring, new Comparator<String>() {
		                @Override
		                public int compare(String object1, String object2) {
		                    return object1.compareTo(object2);
		                }
		            });
		
		System.out.println("dateString "+datestring);

	}

}
