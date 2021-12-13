package com.linkedlist;

public class MyLinkedList<V> {

	INode<V> head;
	INode<V> tail;

	public void add(INode<V> newNode) {
		if (head == null) {
			head = newNode;
		}
		if (tail == null) {
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public INode<V> pop() {
		INode<V> tempNode = head;
		head = head.getNext();
		tempNode.setNext(null);
		return tempNode;
	}

	INode<V> popLast() {
		INode<V> tempNode = head;
		while (tempNode.getNext().getNext() != null) {
			tempNode = tempNode.getNext();
		}
		INode<V> lastNode = tempNode.getNext();
		tempNode.setNext(null);
		return lastNode;
	}

	public void printMyNodes() {
		System.out.println("My nodes : " + head);
	}
}