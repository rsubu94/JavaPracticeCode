package com.practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DoubleBraceIntialization {

	public static <T> Collection<T> getCollectionFromIterator(Iterable<T> itr) {
		Collection<T> collection = new ArrayList<>();
		itr.forEach(collection::add);
		return collection;
	}

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);

			}

		};
		System.out.println("----------------------------------");
		list.add(45);
		list.add(85);
		
		list.subList(2, 4);

		list.forEach(System.out::println);
		
		Iterable<Integer> iterable = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Iterable " + iterable);
		Collection<Integer> collection = getCollectionFromIterator(iterable);
		System.out.println("collection " + collection);

	}

}
