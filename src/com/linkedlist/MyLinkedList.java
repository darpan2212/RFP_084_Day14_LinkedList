package com.linkedlist;

public class MyLinkedList<V> {

	INode<V> head;
	INode<V> tail;

	void add(INode<V> newNode) {
		if (tail == null) {
			tail = newNode;
		} else {
			tail.setNext(newNode);
		}
		if (head == null) {
			head = newNode;
		} else {
			tail = newNode;
		}
	}

	INode<V> pop() {
		INode<V> tempNode = head;
		head = head.getNext();
		tempNode.setNext(null);
		return tempNode;
	}

	INode<V> popLast() {
		INode<V> tempNode = tail;
		tail = null;
		return tempNode;
	}
	
	public void printMyNodes() {
		System.out.println("My nodes : " + head);
	}
}