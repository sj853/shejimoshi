package com.dp.prototype;

public class TestMain {

	public static void main(String[] args) {
		
		People t = new Teacher();
		System.out.println(t.getName());
		t.saySomething();
		People s = (People) t.clone();
		System.out.println(s.getName());
		s.saySomething();
	}
}
