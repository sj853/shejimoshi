package com.moonstudio.dp.proxy.dynamic;

/**
 * 动态代理实例:可以对任意对象,任意接口做代理
 * 
 * @author ThrFou
 * 
 */
public class Test {
	public static void main(String[] args) throws Exception {
		Tank t = new Tank();
		// 代理处理逻辑
		InvocationHandler ih = new TimeHandler(t);
		Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class, ih);
		m.move();

	}
}
