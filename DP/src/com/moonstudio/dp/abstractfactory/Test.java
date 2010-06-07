package com.moonstudio.dp.abstractfactory;

public class Test {
	public static void main(String[] args) {

		// 默认工厂
		 AbstractFactory factory = new MagicFactory();
		// AbstractFactory factory = new DefaultFactory();

		Food f = factory.createFood();
		f.printTips();

		Vehicle v = factory.createVehicle();
		v.run();

		Weapon w = factory.createWeapon();
		w.shoot();

	}
}
