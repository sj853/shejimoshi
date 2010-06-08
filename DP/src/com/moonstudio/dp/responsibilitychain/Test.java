package com.moonstudio.dp.responsibilitychain;

public class Test {

	public static void main(String[] args) {

		String msg = "大家好：） <h2><script> :) 敏感信息 ：）和谐 :) 被就业 ";
		System.out.println("oldStr ：" + msg);

		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		String result = mp.process();

		System.out.println("newStr ： " + result);

	}

}
