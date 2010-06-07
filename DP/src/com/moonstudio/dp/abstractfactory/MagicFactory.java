package com.moonstudio.dp.abstractfactory;

public class MagicFactory extends AbstractFactory {

	@Override
	Food createFood() {
		return new Apple();
	}

	@Override
	Vehicle createVehicle() {
		return new Plane();
	}

	@Override
	Weapon createWeapon() {
		return new Mushroom();
	}

}
