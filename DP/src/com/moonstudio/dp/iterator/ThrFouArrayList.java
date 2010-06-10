package com.moonstudio.dp.iterator;

public class ThrFouArrayList implements ThrFouCollection {

	private class ThrFouArrayListIterator implements ThrFouIterator {

		private int currentIndex = 0;

		@Override
		public boolean hasNext() {
			if (currentIndex >= index) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public Object next() {
			return objects[currentIndex++];
		}

	}

	private Object[] objects = new Object[10];// 初始容量

	private int index = 0;

	@Override
	public void add(Object o) {
		if (index == objects.length) {
			// 容器装满了,扩展容量
			Object[] newObjects = new Object[objects.length * 2];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			objects = newObjects;
		}
		objects[index++] = o;
	}

	@Override
	public ThrFouIterator iterator() {
		return new ThrFouArrayListIterator();
	}

	@Override
	public int size() {
		return index;
	}

}
