package com.moonstudio.dp.iterator;

public class ThrFouLinkList implements ThrFouCollection {

	private Node head = null;
	private Node tail = null;
	private int size = 0;

	@Override
	public void add(Object o) {
		Node n = new Node(o, null);
		if (head == null) {
			tail = n;
			head = tail;
			head.setNext(tail);
		} else {
			tail.setNext(n);
			tail = n;
		}
		size++;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public ThrFouIterator iterator() {
		// 这里面本来也类似ThrFouArrayList类一样
		// 有一个自己内部的Iterator
		// 怎么处理就让它说了算,这里就不多写了
		return null;
	}

}
