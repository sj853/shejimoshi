package com.moonstudio.dp.proxy.dynamic;

import java.lang.reflect.Method;


public class TransactionHandler implements InvocationHandler {

	private Object target;

	public TransactionHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public void invoke(Object whoInvokeMethod, Method m) {
		// ============== 前 =======================
		
		System.out.println("Transaction Start ...");
		try {
			m.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ============== 后 =======================
		System.out.println("Transaction Commit...");
	}

}
