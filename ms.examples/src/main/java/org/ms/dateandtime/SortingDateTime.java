package org.ms.dateandtime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SortingDateTime {
	public static void main(String[] args) {
//java 8
//		sortDateTimeObject();
		sortDateTimeText();
//		convertDateToString(new Date());
//		System.out.println(new Date());
//		test();
	}

	private static void sortDateTimeObject() {
		List<LocalDateTime> dateTimeList = new ArrayList<LocalDateTime>();
		dateTimeList.add(LocalDateTime.of(2012, 05, 12, 5, 16));
		dateTimeList.add(LocalDateTime.of(2014, 03, 23, 11, 26));
		dateTimeList.add(LocalDateTime.of(2011, 02, 13, 9, 36));
		dateTimeList.add(LocalDateTime.of(2013, 11, 12, 5, 16));
		dateTimeList.add(LocalDateTime.of(2017, 8, 11, 21, 26));
		dateTimeList.add(LocalDateTime.of(2016, 9, 05, 19, 36));

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy '@'hh:mm a");
		System.out.println("---> Date & Time Object List Before Sort (MM/dd/yyyy '@'hh:mm a)");
		for (LocalDateTime dateTime : dateTimeList) {
			System.out.println(dateTime.format(dateTimeFormatter));
		}
// LocalDateTime  internally having Comparable interface no need additional Comparator
		Collections.sort(dateTimeList);

		System.out.println("---> Date & Time Object List After Sort (MM/dd/yyyy '@'hh:mm a)");
		for (LocalDateTime dateTime : dateTimeList) {
			System.out.println(dateTime.format(dateTimeFormatter));
		}

	}

	private static void sortDateTimeText() {
		List<String> dateStrList = new ArrayList<String>();
// MM/dd/yyyy '@'hh:mm a

//		dateStrList.add("01/21/2014 @03:13 PM");
//		dateStrList.add("01/21/2011 @04:37 PM");
//		dateStrList.add("01/21/2012 @10:41 AM");
//		dateStrList.add("01/21/2013 @10:48 AM");
//		dateStrList.add("01/22/2015 @06:16 AM");
//		dateStrList.add("01/22/2013 @06:19 AM");
//		dateStrList.add("01/21/2018 @05:19 PM");
//		dateStrList.add("01/21/2013 @05:19 PM");

		dateStrList.add("2020-09-15T13:55:28.726Z");
		dateStrList.add("2020-10-18T01:55:28.726Z");
		dateStrList.add("2020-11-01T10:55:28.726Z");
		dateStrList.add("2020-11-01T10:55:28.726Z");
		dateStrList.add("2021-12-01T10:55:28.726Z");
		dateStrList.add("2020-02-25T10:55:28.726Z");
		dateStrList.add("2018-02-01T10:55:28.726Z");

		System.out.println("---> Date & Time List Before Sort (MM/dd/yyyy '@'hh:mm a)");
		for (String dateStr : dateStrList)
			System.out.println(dateStr);

//		DateFormat t = new SimpleDateFormat(pattern);

//Sort String Date
		Collections.sort(dateStrList, new Comparator<String>() {
//			DateFormat f = new SimpleDateFormat("MM/dd/yyyy '@'hh:mm a");
			DateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

			@Override
			public int compare(String o1, String o2) {
				try {
					return f.parse(o1).compareTo(f.parse(o2));
				} catch (ParseException e) {
					throw new IllegalArgumentException(e);
				}
			}
		});

		System.out.println("---> Date & Time List After Sort (MM/dd/yyyy '@'hh:mm a)");
		for (String dateStr : dateStrList)
			System.out.println(dateStr);
	}

	public static String convertDateToString(Date d) {
		String pattern = "MM/dd/yyyy HH:mm:ss";

		// Create an instance of SimpleDateFormat used for formatting
		// the string representation of date according to the chosen pattern
		DateFormat df = new SimpleDateFormat(pattern);

		// Get the today date using Calendar object.
		Date today = Calendar.getInstance().getTime();
		// Using DateFormat format method we can create a string
		// representation of a date with the defined format.
//		String todayAsString = df.format(today);

		String todayAsString = df.format(today);

		// Print the result!
		System.out.println("Today is: " + todayAsString);
		return todayAsString;
	}

	public static void test() {

		// dateStrList.add("2020-09-15T13:55:28.726Z");
		//"2020-09-15T13:55:28.726Z"

//		String fromDateFormat = "dd/MM/yyyy";
		String inputString = "2020-09-15T13:55:28.726Z".replace("T", " ").replace("Z", "");
		String fromDateFormat = "yyyy-MM-dd HH:mm:ss.SSS";
		String fromdate = inputString; // Take any date

		String CheckFormat = "dd MMM yyyy HH mm ss SSS";// take another format like dd/MMM/yyyy
		String dateStringFrom;

		Date DF = new Date();

		try {
			// DateFormatdf = DateFormat.getDateInstance(DateFormat.SHORT);
			DateFormat FromDF = new SimpleDateFormat(fromDateFormat);
			FromDF.setLenient(false); // this is important!
			Date FromDate = FromDF.parse(fromdate);
			dateStringFrom = new SimpleDateFormat(CheckFormat).format(FromDate);
			DateFormat FromDF1 = new SimpleDateFormat(CheckFormat);
			DF = FromDF1.parse(dateStringFrom);
			System.out.println(dateStringFrom);
		} catch (Exception ex) {

			System.out.println("Date error");

		}

	}
}