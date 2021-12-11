package com.linkedlist;

public class MyNode<V> implements INode<V> {

	private V value;
	private INode<V> next;

	public MyNode(V key) {
		this.value = key;
		next = null;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public INode<V> getNext() {
		return next;
	}

	public void setNext(INode<V> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyNode{value=").append(value).append("}");
		if (next != null) {
			builder.append("->").append(next);
		}
		return builder.toString();
	}
}