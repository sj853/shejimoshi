package com.moonstudio.dp.proxy.dynamic.compiler;

import java.lang.reflect.Method;
import com.moonstudio.dp.proxy.dynamic.InvocationHandler;

//这是动态生成的类
public class $ThrFouDynamicProxy implements
		com.moonstudio.dp.proxy.dynamic.usetest.UserMgr {
	InvocationHandler ih;

	public $ThrFouDynamicProxy(InvocationHandler ih) {
		this.ih = ih;
	}

	@Override
	public void addUser() {
		try {
			Method md = com.moonstudio.dp.proxy.dynamic.usetest.UserMgr.class
					.getMethod("addUser");
			ih.invoke(this, md);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delUser() {
		try {
			Method md = com.moonstudio.dp.proxy.dynamic.usetest.UserMgr.class
					.getMethod("delUser");
			ih.invoke(this, md);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}