package com.moonstudio.dp.proxy.dynamic;

import java.lang.reflect.Method;

public class Test2 {
	public static void main(String[] args) {
		Method[] methods = Moveable.class.getMethods();
		for (Method m : methods) {
			System.out.println(m.getName());
		}
	}
}
