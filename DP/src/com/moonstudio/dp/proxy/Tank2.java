package com.moonstudio.dp.proxy;

/**
 *代理：
 * -用继承实现,但是继承不灵活,用聚合比较好.
 * -用继承的话,继承的层次将没完没了
 * 
 * @author ThrFou
 * 
 */
public class Tank2 extends Tank {

	@Override
	public void move() {
		System.out.println("钱");
		super.move();
		System.out.println("后");
	}

}
