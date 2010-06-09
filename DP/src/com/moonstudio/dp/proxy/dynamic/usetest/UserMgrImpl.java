package com.moonstudio.dp.proxy.dynamic.usetest;

public class UserMgrImpl implements UserMgr {

	@Override
	public void addUser() {
		System.out.println("1、插入记录到User表");
		System.out.println("2、做日志在另一张表");
	}

	@Override
	public void delUser() {
		System.out.println("A、删除记录从User表");
		System.out.println("B、做日志在另一张表");
	}

}
