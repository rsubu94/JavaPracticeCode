package com.practice.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class SporysMain {
	public static void main(String[] args) {
		Cricket sports = new SportsSubClass();
//		sports.sp1();
//		sports.sp2();
//		sports.sp3();
//		sports.sp4();
//		sports.sp5();
//		sports.method2();
//		sports.display();
		int[] intArray  = {1,5,3,6,5,2,1,4,6,7,8,7,9,4};
		
		findDuplicateInArray(intArray);
		System.out.println("-----------------------1---------------------------------");

		findDuplicateInHashMap(intArray);
		findDuplicatesWithHashset(intArray);
	}

	private static void findDuplicateInArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] == intArray[j]) {
					System.err.println("Duplicate Array " + intArray[i]);
				}
			}
		}
	}

	private static void findDuplicateInHashMap(int[] intArray) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int element : intArray) {
			if (map.get(element) == null) {
				map.put(element, 1);
			} else {
				map.put(element, map.get(element) + 1);
			}

		}
		Set<Entry<Integer,Integer>> set = map.entrySet();
		for(Entry<Integer, Integer> etrEntry : set) {
			if(etrEntry.getValue()>1)
			System.out.println(etrEntry.getKey()+" - found "+etrEntry.getValue()+" times");
		}

	}

	private static void findDuplicatesWithHashset(int[] intArray) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		System.out.println("------------------------2--------------------------------");

		for (int element : intArray) {
			if (!hashSet.add(element)) {
				System.out.println("Duplicate value : Hashset " + element);
			}
		}
	}
	private static void findDuplicatesUsingHashMap(int[] inputArray)
	{
	    HashMap<Integer, Integer> map = new HashMap<>();
	         
	    for (int element : inputArray) 
	    {   
	        if(map.get(element) == null)
	        {
	            map.put(element, 1);
	        }
	        else
	        {
	            map.put(element, map.get(element)+1);
	        }
	    }
	         
	    Set<Entry<Integer, Integer>> entrySet = map.entrySet();
	         
	    for (Entry<Integer, Integer> entry : entrySet) 
	    {               
	        if(entry.getValue() > 1)
	        {
	            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
	        }
	    }
	}
}