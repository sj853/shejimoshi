package com.moonstudio.dp.proxy;

public class Tank implements Moveable {

	@Override
	public void move() {
		System.out.println("Tank Moving ...");
	}

	@Override
	public void stop() {
		System.out.println("Tank Stoping ...");
	}

}