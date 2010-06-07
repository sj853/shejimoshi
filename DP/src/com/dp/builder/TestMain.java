package com.dp.builder;


public class TestMain {

	public static void main(String[] args) {
		AbstactCarBuilder carBuilder = new CarBuilder();
		Assembly assembly = new Assembly(carBuilder);
		assembly.construct();
		Car car = carBuilder.getCar();
		car.getName();
	}
}
