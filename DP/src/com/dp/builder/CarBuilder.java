package com.dp.builder;

public class CarBuilder implements AbstactCarBuilder {

	Car Posche;
	CarPart CarEngine,CarThrottle,CarWheel;
	@Override
	public void builderCarEngine() {
		
		CarEngine = new CarEngine();
		CarEngine.partName();
	}

	@Override
	public void builderCarThrottle() {
		CarThrottle = new CarThrottle();
		CarThrottle.partName();
	}

	@Override
	public void builderCarWheel() {
		CarWheel = new CarWheel();
		CarWheel.partName();
	}

	@Override
	public Car getCar() {
		return null;
	}

}
