package com.hashcode;

public class HashCodeClass {

	public static void main(String[] args) {

		Integer a = 6;
		String b = "A";

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		System.out.println(a.equals(b));
	}

}