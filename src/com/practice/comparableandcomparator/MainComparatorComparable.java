package com.practice.comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainComparatorComparable {
	public static void main(String[] args) {

		List<Company> list = new ArrayList<>();
		list.add(new Company(1, "CTS", "chennai"));
		list.add(new Company(3, "Abrtel", "Chennai"));
		list.add(new Company(5, "Accenture", "Mumbai"));
		list.add(new Company(2, "Zoho", "chennai"));
		
		//list.sort(Comparator.comparing(Company::getCompanyId).thenComparing(Company::getCompanyName).thenComparing(Company::getAddress));
		list.sort(Comparator.comparing(Company::getCompanyName).thenComparing(Company::getAddress));

		System.out.println("List "+list);
		
		Arrays.parallelSort(list.toArray(new Company[list.size()]));
		
		List<String> list2 = Arrays.asList("stark","targareyan","lannisters","baratheon","greyjoy","bolton","umber","karstark","turly","tully");
		list2.stream().sorted((c1,c2)->c1.compareTo(c2)).collect(Collectors.toList()).forEach(System.out::println);
		
		List<Integer> list3 = Arrays.asList(2,5,3,6,8,3,9,10,7,1,11);
		list3.stream().sorted((c1,c2)->c1.compareTo(c2)).collect(Collectors.toList()).forEach(System.out::println);
		
		

		
		
//		System.out.println("Before Sorting " + list);
//		
//		Collections.sort(list);
//		System.out.println("Comparable "+list);
//
//		Collections.sort(list, Company.idComparator);
//		System.out.println("After Sorting  " + list);
//
//		Collections.sort(list, Company.nameComparator);
//		System.out.println("Name Comparator :: " + list);
//		Collections.sort(list, Company.addressComparator);
//		System.out.println("Address Comparator :: " + list);
//		Collections.sort(list, Company.searchByIdandName);
//		System.out.println("Id and Name Comparator :: " + list);
		

	}
}
