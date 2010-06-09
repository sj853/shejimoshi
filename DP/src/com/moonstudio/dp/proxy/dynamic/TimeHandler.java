package com.moonstudio.dp.proxy.dynamic;

import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	// 对那个对象进行代理
	private Object target;

	public TimeHandler(Object target) {
		this.target = target;
	}

	@Override
	public void invoke(Object whoInvokeMethod, Method m) {
		// ============== 前 =======================
		System.out.println("Time A ...");
		// whoInvokeMethod这个暂时没有用，但是不代表以后不用
		// System.out.println(whoInvokeMethod.getClass().getName());
		try {
			m.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ============== 后 =======================
		System.out.println("Time B ...");
	}

}
