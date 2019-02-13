package com.practice.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

import com.sun.security.jgss.ExtendedGSSContext;

import sun.net.www.content.text.plain;

public class ConcurrentMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "subu");
		map.put(2, "jaqen");
		map.put(3, "xaro");
		map.put(4, "jonsnow");
		map.put(5, "ygrite");

		Iterator<Integer> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			if (integer == 3) {
				map.put(integer + 1, "arya");
			}
		}
		System.out.println("Concurrent HashMap " + map);

		// HashMap
		map = new HashMap<Integer, String>();
		map.put(1, "1");
		map.put(2, "1");
		map.put(3, "1");
		map.put(4, "1");
		map.put(5, "1");
		map.put(6, "1");
		System.out.println("HashMap before iterator: " + map);
		Iterator<Integer> it1 = map.keySet().iterator();

		while (it1.hasNext()) {
			Integer key = it1.next();
			if (key == 3) {
				map.put(key, "new3");
				break;
			}

		}
		new Thread(()->{System.out.println("Runnable");});
		
		System.out.println("HashMap after iterator: " + map);
		
//		List<Object> list = Arrays.asList("subu","tin","red","glow","trear");
		
		List<Integer> list = Arrays.asList(20,30,40,10);

//		int sum = list.stream().filter(i -> (i > 10)).mapToInt(i->(int)i).sum();
		int sum= list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();

		System.out.println(sum);
		
//		Predicate<String> p = (t) -> t.startsWith("t");
//		for(Object t:list)
//		{
//			if(p.test((String)t))
//				System.out.println(t);
//		}
		

	}

}
