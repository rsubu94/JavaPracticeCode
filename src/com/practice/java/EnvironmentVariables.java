package com.practice.java;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EnvironmentVariables {
	public static void main(String[] args) {
		Map<String, String> map = System.getenv();
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println("Key " + iterator.next());
		}
		System.out.println("Path " + System.getenv("PATH"));
		System.out.println("Path " + System.getenv("HTTPS_PROXY"));

		StringBuilder stringBuilder = new StringBuilder(10);
		stringBuilder.append("Subramanian");
		stringBuilder.append("RV");
		System.out.println("String Builder Value " + stringBuilder.toString());
		StringBuilder stringBuilder2 = new StringBuilder("GeeksForGeeks");
		System.out.println("Stringbuilder 2 " + stringBuilder2.appendCodePoint(65));

	}

}
