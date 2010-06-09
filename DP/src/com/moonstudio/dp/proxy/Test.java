package com.moonstudio.dp.proxy;

public class Test {
	public static void main(String[] args) {
		Tank t = new Tank();

		// 这里的顺序改变就是需求的改变,这里就可以看出实现代理用聚合的好处了

		// 顺序一
		// TankTimeProxy ttp = new TankTimeProxy(t);
		// TankLogProxy tlp = new TankLogProxy(ttp);
		// 顺序二
		TankLogProxy tlp = new TankLogProxy(t);
		TankTimeProxy ttp = new TankTimeProxy(tlp);

		Moveable m = ttp;
		m.move();
		m.stop();
	}
}
