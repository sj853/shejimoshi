package com.moonstudio.dp.observer;

/**
 * 这种设计方式
 * 
 * @author ThrFou
 * 
 */
public class Test2 {
	public static void main(String[] args) {
		Dad2 d = new Dad2();
		Child2 c = new Child2(d);
		new Thread(c).start();
	}
}

class Child2 implements Runnable {

	private Dad2 dad;

	public Child2(Dad2 d) {
		this.dad = d;
	}

	void wakeUp() {
		dad.feed(this);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wakeUp();
	}

}

class Dad2 {

	public Dad2() {
	}

	public void feed(Child2 c2) {
		System.out.println("小孩醒了，喂食中...");
	}

}