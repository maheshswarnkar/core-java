package org.ms.dateandtime;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NanoSecondDifference {

	public static void main(String[] args) {

		// random numbers
		List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);

		// print to console
		System.out.println("Original Integer List : " + numbers);

		// Execution - start time
		LocalTime startTime = LocalTime.now();
		System.out.println("Start time " + startTime);

		// sort in descending-order and get 2nd largest element
		int secondLargestNumber = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		// Execution - end time
		LocalTime endTime = LocalTime.now();
		System.out.println("End time " + endTime);

		// find difference
		Duration duration = Duration.between(startTime, endTime);
		long differenceInNano = duration.getNano();

		// print sum to console
		System.out.println("\nSecond largest number in List is - " + secondLargestNumber);

		// print execution time in Nano seconds
		System.out.println("\nExecution time : " + differenceInNano + " ns");
	}

}
