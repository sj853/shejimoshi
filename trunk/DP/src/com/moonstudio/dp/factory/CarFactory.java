package com.moonstudio.dp.factory;

public class CarFactory extends VehicleFactory {
	@Override
	Moveable create() {
		return new Car();
	}
}
