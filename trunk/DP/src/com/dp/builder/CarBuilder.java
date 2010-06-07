package com.dp.builder;

public class CarBuilder implements AbstactCarBuilder {

	public CarBuilder() {
		car = new Car();
	}

	Car car;
	@Override
	public void builderCarEngine() {
		car.carEngine = new CarEngine();
		car.carEngine.partName();
	}

	@Override
	public void builderCarThrottle() {
		car.carThrottle = new CarThrottle();
		car.carThrottle.partName();
	}

	@Override
	public void builderCarWheel() {
		car.carWheel = new CarWheel();
		car.carWheel.partName();
	}

	@Override
	public Car getCar() {
		return car;
	}

}
