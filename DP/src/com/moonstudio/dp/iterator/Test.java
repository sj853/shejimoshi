package com.moonstudio.dp.iterator;

public class Test {
	public static void main(String[] args) {
		ThrFouCollection al = new ThrFouArrayList();
		for (int i = 0; i < 15; i++) {
			al.add("" + i);
		}
		System.out.println(al.size());

		// 遍历
		ThrFouIterator it = al.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o.toString());
		}

		ThrFouCollection ll = new ThrFouLinkList();
		for (int i = 0; i < 15; i++) {
			ll.add(new Object());
		}
		System.out.println(ll.size());

	}
}
