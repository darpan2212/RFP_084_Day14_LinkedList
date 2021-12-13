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

	public INode<V> popLast() {
		INode<V> tempNode = head;
		while (tempNode.getNext().getNext() != null) {
			tempNode = tempNode.getNext();
		}
		INode<V> lastNode = tempNode.getNext();
		tempNode.setNext(null);
		return lastNode;
	}

	public boolean search(INode<V> searchNode) {
		INode<V> tempNode = head;
		while (tempNode != null) {
			if (tempNode.getValue().equals(searchNode.getValue())) {
				return true;
			}
			tempNode = tempNode.getNext();
		}
		return false;
	}

	public boolean insert(V after, INode<V> newNode) {
		INode<V> tempNode = head;
		while (tempNode != null) {
			if (tempNode.getValue().equals(after)) {
				INode<V> node = tempNode.getNext();
				tempNode.setNext(newNode);
				newNode.setNext(node);
				return true;
			}
			tempNode = tempNode.getNext();
		}
		return false;
	}

	public boolean remove(V value) {
		INode<V> tempNode = head;
		if (tempNode.getValue().equals(value)) {
			head = tempNode.getNext();
			return true;
		}
		while (tempNode.getNext() != null) {
			if (tempNode.getNext().getValue().equals(value)) {
				tempNode.setNext(tempNode.getNext().getNext());
				return true;
			}
			tempNode = tempNode.getNext();
		}
		return false;
	}

	public int size() {
		int size = 0;
		INode<V> tempNode = head;
		while (tempNode != null) {
			tempNode = tempNode.getNext();
			size++;
		}
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void printMyNodes() {
		System.out.println("My nodes : " + head);
	}
}