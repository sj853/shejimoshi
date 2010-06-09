package com.moonstudio.dp.proxy.dynamic;

import java.lang.reflect.Method;

public interface InvocationHandler {
	// JDK里面的Handler：Object： invoke(Object proxy, Method method, Object[] args)
	// 我们这里模拟的代理只能代理没有参赛的方法
	void invoke(Object whoInvokeMethod, Method m);
}
