package com.moonstudio.dp.proxy;

/**
 * 代理：用聚合实现：一个类里面有另一个类的对象
 * 
 * @author ThrFou
 * 
 */
public class TankLogProxy implements Moveable {

	Moveable m;

	public TankLogProxy(Moveable m) {
		super();
		this.m = m;
	}

	@Override
	public void move() {
		System.out.println("Log : 1 ...");
		m.move();
		System.out.println("Log : 2 ...");
	}

	@Override
	public void stop() {
		System.out.println("Log : 3 ...");
		m.stop();
		System.out.println("Log : 4 ...");
	}

}
