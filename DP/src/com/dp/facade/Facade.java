package com.dp.facade;

/**
 * facade模式：
 * 为子系统中的一组接口提供一个统一接口。
 * Facade模式定义了一个更高层的接口，使子系统更加容易使用。
 *
 */



//正如上面所说，客户端client，它并不需要关心子系统，
//而是关心DrawerFacade所留下来的和外部交互的接口
//，而子系统在DrawerFacade的聚合
public class Facade {

	DrawerOne one = new DrawerOne();
	DrawerTwo two = new DrawerTwo();
	void getFile(){
		one.open();
		one.getKey();
		two.open();
		two.getFile();
	}
	
	//统一的接口
	public static void main(String[] args) {
		new Facade().getFile();
	}
}
