package com.moonstudio.dp.proxy;

/**
 * 代理：用聚合实现：一个类里面有另一个类的对象
 * 
 * @author ThrFou
 * 
 */
public class TankTimeProxy implements Moveable {

	public TankTimeProxy(Moveable m) {
		super();
		this.m = m;
	}

	Moveable m;

	@Override
	public void move() {
		System.out.println("时间一");
		m.move();
		System.out.println("时间二");
	}

	@Override
	public void stop() {
		System.out.println("时间三");
		m.move();
		System.out.println("时间四");
	}

}
