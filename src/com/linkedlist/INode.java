package com.linkedlist;

public interface INode<V> {

	V getValue();
	void setValue(V key);
	
	INode<V> getNext();
	void setNext(INode<V> next);
}