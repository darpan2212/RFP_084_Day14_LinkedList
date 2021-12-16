package com.hashtable.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.hashtable.MyHashMap;
import com.hashtable.MyLinkedHashMap;

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
		System.out.println(myHashMap);
		System.out.println("size of hashmap: " + myHashMap.size());
		System.out.println("Removing not key : " + myHashMap.remove("not"));
		System.out.println(myHashMap);
		System.out.println("size of hashmap: " + myHashMap.size());
	}

	/*
	 * @Test public void countWordOccurancesInPara() { String str =
	 * "Paranoid are no paranoid because they are paranoid " +
	 * "but because they keep putting themselves deliberately " +
	 * "into paranoid avoidable situations"; String[] words = str.split(" ");
	 * MyLinkedHashMap<String, Integer> myHashMap = new MyLinkedHashMap<String,
	 * Integer>(); for (String word : words) { Integer value =
	 * myHashMap.get(word.toLowerCase()); if (value == null) { value = 1; } else {
	 * value += 1; } myHashMap.add(word.toLowerCase(), value); } int frequency =
	 * myHashMap.get("paranoid"); System.out.println(frequency); assertEquals(4,
	 * frequency); System.out.println(myHashMap); }
	 */

}