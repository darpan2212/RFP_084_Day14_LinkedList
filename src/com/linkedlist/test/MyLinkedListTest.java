package com.linkedlist.test;

import org.junit.Test;

import com.linkedlist.INode;
import com.linkedlist.MyLinkedList;
import com.linkedlist.MyNode;

public class MyLinkedListTest {

	@Test
	public void printNode() {
		INode<Double> node1 = new MyNode<Double>(50.0);
		System.out.println(node1);
		
		MyLinkedList<Double> doubleLinkedList = new MyLinkedList<>();
		doubleLinkedList.add(node1);
	}
	
}