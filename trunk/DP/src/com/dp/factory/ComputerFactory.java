package com.dp.factory;

/**
 * 工厂模式（使用条件）：
 * 1.要频繁使用new class()
 * 2.实现封装，符合面向对象设计思想
 * 
 * 抽象工厂模式(用于生产对象组(这些对象之间有点关系)
 * 抽象方法模式（用户生产一种对象类型,如某类型不同的子类生产，不同参数的new）
 */
public abstract class ComputerFactory {
//生产RAM CPU
	public abstract RAM produceRAM();
	public abstract CPU produceCPU();
	
}
