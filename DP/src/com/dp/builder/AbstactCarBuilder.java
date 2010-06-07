package com.dp.builder;

/**
 *Builder模式:
 * 将组件的生成与组装分开
 * 封装性 面向对象
 */
public interface AbstactCarBuilder {

	void builderCarEngine();
	void builderCarThrottle();
	void builderCarWheel();
	
	Car getCar();
}
