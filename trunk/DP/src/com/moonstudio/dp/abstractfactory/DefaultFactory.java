package com.moonstudio.dp.abstractfactory;

public class DefaultFactory extends AbstractFactory {

	@Override
	Food createFood() {
		return new MelonSeeds();
	}

	@Override
	Vehicle createVehicle() {
		return new Car();
	}

	@Override
	Weapon createWeapon() {
		return new AK47();
	}

}
