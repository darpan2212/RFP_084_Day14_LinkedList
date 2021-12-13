package com.linkedlist.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.linkedlist.INode;
import com.linkedlist.MyLinkedList;
import com.linkedlist.MyNode;

public class MyLinkedListTest {

	@Test
	public void printNode() {
		INode<Double> node1 = new MyNode<Double>(50.0);
//		System.out.println(node1);
		
		MyLinkedList<Double> doubleLinkedList = new MyLinkedList<>();
		doubleLinkedList.add(node1);
	}
	
	@Test
	public void searchInLinkedList() {
		INode<Integer> myFirstNode = new MyNode<Integer>(56);
		INode<Integer> mySecondNode = new MyNode<Integer>(30);
		INode<Integer> myThirdNode = new MyNode<Integer>(70);

		MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();

		intLinkedList.add(myFirstNode);
		intLinkedList.add(mySecondNode);
		intLinkedList.add(myThirdNode);
		intLinkedList.add(myFirstNode);
//		System.out.println(intLinkedList);
		assertTrue(intLinkedList.search(myFirstNode));
	}
}