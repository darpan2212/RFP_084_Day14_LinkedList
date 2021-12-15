package com.hashtable;

import com.linkedlist.MyLinkedList;

public class MyHashMap<K, V> {

	MyLinkedList<K> myLinkedList;

	public MyHashMap() {
		myLinkedList = new MyLinkedList<>();
	}

	public V get(K key) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		return myMapNode == null ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<K, V>();
			myMapNode.setKey(key);
			myMapNode.setValue(value);
			myLinkedList.add(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	public int getIndex(K key) {
		
		return 0;
	}
}