package com.dp.builder;

public interface AbstactCarBuilder {

	void builderCarEngine();
	void builderCarThrottle();
	void builderCarWheel();
	
	Car getCar();
}
