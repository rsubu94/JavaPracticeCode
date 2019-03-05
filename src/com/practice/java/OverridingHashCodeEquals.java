package com.practice.java;

import java.util.HashSet;
import java.util.Iterator;

public class OverridingHashCodeEquals {
	String name;
	int no;

	public OverridingHashCodeEquals(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public int hashCode() {
//		final int prime = 66;
//		int result = 10;
//		result = prime * result + no;
//		System.out.println(result + " " + no);
		return 2 + 10 + no;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		OverridingHashCodeEquals other = (OverridingHashCodeEquals) obj;
		if (no != other.no)
			return false;

		return true;
	}

	public static void main(String[] args) {
		OverridingHashCodeEquals overridingHashCodeEquals = new OverridingHashCodeEquals("subu", 12);
		OverridingHashCodeEquals overridingHashCodeEquals1 = new OverridingHashCodeEquals("subu", 12);
		OverridingHashCodeEquals overridingHashCodeEquals2 = new OverridingHashCodeEquals("jon", 19);

		HashSet<OverridingHashCodeEquals> hashSet = new HashSet<>();
		hashSet.add(overridingHashCodeEquals);
		hashSet.add(overridingHashCodeEquals1);
		hashSet.add(overridingHashCodeEquals2);

		Iterator<OverridingHashCodeEquals> set = hashSet.iterator();
		while (set.hasNext()) {
			System.out.println("Key " + set.next().toString() + " " + set.hashCode());
		}
	}

	@Override
	public String toString() {
		return "OverridingHashCodeEquals [name=" + name + ", no=" + no + "]";
	}

}
