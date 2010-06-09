package com.moonstudio.dp.proxy.dynamic;

public class Tank implements Moveable {

	@Override
	public void move() {
		System.out.println("Tank Moving ...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}