package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class StreamApiPrograms {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,4,5,11,12);
		
		numbers.stream().filter(n->n%2==0).forEach(System.out::println);//even numbers
		
		numbers.stream().filter(n->n%2!=0).forEach(System.out::println);
		
		numbers.stream().filter(n->n>10).forEach(System.out::println);

		Optional<Integer> max = numbers.stream().max(Integer::compareTo);
		System.out.println("max number is--"+max);
		
		int sum =
				numbers.stream()
				       .mapToInt(Integer::intValue)
				       .sum();
		System.out.println("sum is--"+sum);
		
		numbers.stream().distinct().forEach(System.out::println);

		numbers.stream().findFirst().ifPresent(System.out::println);
		
		Set<Integer> set = new HashSet<>();

		numbers.stream()
		    .filter(n -> !set.add(n))
		    .forEach(System.out::println);
		
		Optional<Integer> first =
				numbers.stream()
				    .filter(n -> !set.add(n))
				    .findFirst();
		System.out.println("first number is--"+first);
		
		Optional<Integer> highest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("Highest number is--"+highest);//Second Highest Number
		
		List<String> names = Arrays.asList("india","russia","japan","usa","london");

		names.stream()
		.map(s -> new StringBuilder(s)
		.reverse()
		.toString())
		.forEach(System.out::println);
		
		numbers.stream().sorted().distinct().forEach(System.out::println);
	}

}
