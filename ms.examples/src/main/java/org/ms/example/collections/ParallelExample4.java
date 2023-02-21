package org.ms.example.collections;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelExample4 {
	private int x = 0; 
	private int y = 20; 




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ParallelExample4 object = new ParallelExample4();

		long count = Stream.iterate(0, n -> n + 1).limit(1_000)
				// .parallel() with this 23s, without this 1m 10s
				.filter(ParallelExample4::isPrime).peek(x -> System.out.format("%s\t", x)).count();

		System.out.println("\nTotal: " + count);

		Stream.of("one", "two", "three", "four","five")
			.filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e))
				.map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e))
				.collect(Collectors.toList());
		
		System.out.println("----------------");
		
		Stream.of("one", "two", "three", "four","five")
		.filter(e -> e.length() > 3)
			.peek(e -> System.out.println("Filtered value: " + e))
			.collect(Collectors.toList());
		
		System.out.println("--------------------------------");
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());


	}

	/**
	 * @param number
	 * @return
	 */
	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
	}

}
