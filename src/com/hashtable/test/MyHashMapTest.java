package com.hashtable.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.hashtable.MyHashMap;

public class MyHashMapTest {

	@Test
	public void countWordOccurancesInLine() {
		String str = "To be or not to be";
		String[] words = str.split(" ");
		MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
		for (String word : words) {
			Integer value = myHashMap.get(word.toLowerCase());
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			myHashMap.add(word.toLowerCase(), value);
		}
		int frequency = myHashMap.get("or");
		System.out.println(frequency);
		assertEquals(1, frequency);
		System.out.println(myHashMap.hashCode());
	}

	@Test
	public void countWordOccurancesInPara() {
		String str = "Paranoids are no paranoid because they are paranoid "
				+ "but because they keep putting themselves deliberately "
				+ "into paranoid avoidable situations";
		String[] words = str.split(" ");
		MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
		for (String word : words) {
			Integer value = myHashMap.get(word.toLowerCase());
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			myHashMap.add(word.toLowerCase(), value);
		}
		int frequency = myHashMap.get("paranoid");
		System.out.println(frequency);
		//assertEquals(1, frequency);
		System.out.println(myHashMap.hashCode());
	}

}