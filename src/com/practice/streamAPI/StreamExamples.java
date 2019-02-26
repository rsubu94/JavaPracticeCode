package com.practice.streamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExamples {
	public static void main(String[] args) {

		Stream.of(10, 20, 30, 40).forEach(System.out::println);

		Stream.of(new Integer[] { 1, 2, 3, 4, 5 }).forEach(System.out::println);

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 30; i++)
			list.add(i);

		Stream<Integer> seqStream = list.stream();
		seqStream.forEach(System.out::println);
		System.err.println("******************************************");
		Stream<Integer> parStream = list.parallelStream();
		parStream.forEach(System.out::println);
		System.err.println("##########################################");

		Stream<Integer> stream3 = Stream.generate(new Random()::nextInt).limit(5);
		stream3.forEach(System.out::println);
//		Stream.iterate(2, i -> i * i).filter();

		IntStream intStream = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".chars();
		intStream.forEach(System.out::println);

		IntStream.range(0, 100).boxed().collect(Collectors.toCollection(ArrayList::new)).stream().reduce(Math::min)
				.ifPresent(System.out::println);
		IntStream.range(0, 100).boxed().collect(Collectors.toCollection(ArrayList::new)).stream().map(i -> i * 2)
				.filter(i -> i > 10).collect(Collectors.toList()).forEach(System.out::println);

		int number = 11;
		boolean r = number > 1 && IntStream.range(2, number).boxed().noneMatch(index -> number % index == 0);
		System.out.println("Boolean " + r);

		Stream<String> names4 = Stream.of("Pankaj", "Amit", "David", "Lisa", "Daniel");
		Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
		if (!firstNameWithD.isPresent()) {
			System.out.println("First Name starting with D=" + firstNameWithD.get()); // David
		}
		Stream.iterate(1, n -> n + 1).filter(StreamExamples::isOdd).limit(5).forEach(System.out::println);
		
		
		List<String> listOfStrings = Arrays.asList("Mark", "Howard","34343434434343");
		Optional<String> largeString 
		  = listOfStrings.stream().filter(str -> str.length() > 10).findAny();
		System.out.println(largeString.orElse("nul"));//ifPresent(System.out::println);

		Optional<String> veryLargeString 
		  = listOfStrings.stream().filter(str -> str.length() > 20).findFirst();
		veryLargeString.ifPresent(System.out::println);
		
		Spliterator<Integer> iSpliterator = list.spliterator();
		System.err.println("__________________________");
		//System.err.println(iSpliterator.getExactSizeIfKnown());
//iSpliterator.forEachRemaining(System.out::println);
	iSpliterator.trySplit().forEachRemaining(System.out::println);
	System.err.println("__________________________");
	iSpliterator.forEachRemaining(System.out::println);



//		try {
//			Files.newDirectoryStream(Paths.get(System.getProperty("user.dir"))).forEach(System.out::println);
//			System.out.println("*********");
//			Files.list(Paths.get("src")).forEach(System.out::println);
//			System.out.println("^^^^^^^^");
//			Files.walk(Paths.get(System.getProperty("user.dir"))).sequential().forEach(System.out::println);
//			;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	public static boolean isOdd(long number) {
		if (number % 2 == 0) {
			return false;
		}
		return true;
	}

}
