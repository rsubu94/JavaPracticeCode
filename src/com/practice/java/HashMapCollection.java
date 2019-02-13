package com.practice.java;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCollection {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1,"subu");
		map.put(2,"");
		map.put(0,"tommu");
		
		map.put(4,"peaky");
		
		//forEach
		map.forEach((k,v)->{
			System.out.println(k +":"+ v);
			
		});
		
		
		
		//iterating through stream API
		map.entrySet().stream().forEach(e->{
			System.out.println(e.getKey()+":"+e.getValue());
		});
		
		
		//enhanced for loop
		for(Map.Entry<Integer, String> m : map.entrySet())
		{
			System.out.println("Key "+m.getKey()+" Value "+m.getValue());
		}
		
		//using iterator	
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
			//or
		//for(Iterator<Map.Entry<Integer, String>> i=map.entrySet().iterator();i.hasNext();)
		{
			//System.out.println("Next "+iterator.next());
			Map.Entry<Integer, String> pair = iterator.next();
			
//			if(pair.getValue().equals("subu")) {
//				iterator.remove();
//			}
			
			
		//	System.out.println(pair.getKey()+":"+pair.getValue().startsWith("s")+":"+pair.getClass());
			iterator.forEachRemaining(System.out::println);
			
		}
		for(Integer key : map.keySet())
		{
			String val = map.get(key).toString();
			System.out.println("Val ="+val);
		}
		
		
		
		//to iterate only key
		Iterator<Integer> ke = map.keySet().iterator();
		while(ke.hasNext())
		{
			Integer string=ke.next();
			
			System.out.println(string);
		}
		//or using for loop
		for(Iterator<Integer> itt=map.keySet().iterator();itt.hasNext();)
		{
			Integer intt= itt.next();
			System.out.println("Key "+intt);
		}
		
		//To iterate only keys
		Set<Integer> s = map.keySet();
		s.forEach(System.out::println);
		
		
		
		//To iterate only values
		Collection<String> val =  map.values();
		val.forEach(System.out::println);
		
		
	}

}
