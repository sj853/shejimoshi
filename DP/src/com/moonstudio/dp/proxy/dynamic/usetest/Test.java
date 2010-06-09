package com.moonstudio.dp.proxy.dynamic.usetest;

import com.moonstudio.dp.proxy.dynamic.InvocationHandler;
import com.moonstudio.dp.proxy.dynamic.Proxy;
import com.moonstudio.dp.proxy.dynamic.TimeHandler;
import com.moonstudio.dp.proxy.dynamic.TransactionHandler;

/**
 * 动态代理的测试:
 *- 看这个包就可以看出
 *- - - - - -
 *- 这里的处理逻辑已经独立出来了:就用的父包里面的Handler
 *- - - - - -
 *- 可以用时间Handler
 *- 可以用事务的Handler
 * 
 * @author ThrFou
 * 
 */
public class Test {
	public static void main(String[] args) {
		UserMgr mgr = new UserMgrImpl();
		// 这里的代理叠加有点问题,要动动脑筋
		InvocationHandler ih = new TransactionHandler(mgr);
		//InvocationHandler ih = new TimeHandler(mgr);
		try {
			UserMgr u = (UserMgr) Proxy.newProxyInstance(UserMgr.class, ih);
			u.addUser();
			u.delUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
