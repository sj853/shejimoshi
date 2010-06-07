package com.dp.builder;

public class Assembly {

	public Assembly(AbstactCarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	AbstactCarBuilder carBuilder;
	
	public void construct(){
		carBuilder.builderCarEngine();
		carBuilder.builderCarThrottle();
		carBuilder.builderCarWheel();
		System.out.println("a car is borned");
	}
}
