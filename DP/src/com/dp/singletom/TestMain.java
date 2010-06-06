package com.dp.singletom;

public class TestMain {

	public static void main(String[] args) {
		Unique u = Unique.getInstance();
		Unique u2 = Unique.getInstance();
		System.out.println(u==u2);
		//结果是TURE
		//Unique u3 = new Unique(); 不能通过编译
	}
}
