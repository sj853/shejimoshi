//package com.moonstudio.dp.factory;
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class Car {
//
//	// 单例模式
//	private static Car car = new Car();
//
//	// 多例
//	private List<Car> cars = new LinkedList<Car>();
//	private Car() {
//		// private 的class，只有自己可以new
//	}
//
//	// 静态工厂,控制产生对象的方法,就可以称为工厂方法
//	public static Car getInstance() {
//		// 这里面可以做各种各样的限制
//		return car;
//	}
//
//	public void run() {
//		System.out.println("冒着烟奔跑中 ...");
//	}
//}

package com.moonstudio.dp.factory;

public class Car implements Moveable {
	
	@Override
	public void run() {
		System.out.println("冒着烟奔跑中 Car...");
	}

}
