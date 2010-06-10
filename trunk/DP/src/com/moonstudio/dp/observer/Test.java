package com.moonstudio.dp.observer;

/**
 * 这种设计方式，资源消耗非常严重
 * 
 * @author ThrFou
 * 
 */
public class Test {
	public static void main(String[] args) {
		Child c = new Child();
		new Thread(c).start();
		new Thread(new Dad(c)).start();
	}
}
class Child implements Runnable {
	private boolean wakenUp = false;

	void wakeUp() {
		wakenUp = true;
	}

	public boolean isWakenUp() {
		return wakenUp;
	}

	public void setWakenUp(boolean wakenUp) {
		this.wakenUp = wakenUp;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.wakenUp = true;
	}

}

class Dad implements Runnable {

	Child c;

	public Dad(Child c) {
		this.c = c;
	}

	/**
	 * 他就一直在这循环
	 */
	@Override
	public void run() {
		while (!c.isWakenUp()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		feed(c);
	}

	private void feed(Child c2) {
		System.out.println("小孩醒了，喂食中...");
	}

}